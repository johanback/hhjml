package org.hhjml.miniprojekt2;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.util.HashMap;

@Controller
public class QuizController {

    @Autowired
    QuizService service;

    @GetMapping("/quiz")
    String displayFrontPage(HttpSession session){
        return "frontpage";
    }

    @GetMapping("/quiz/{quizName}")
    //Starts the selected quiz and takes you to the first question of it
    String dispayQuiz (HttpSession session, Model model, @PathVariable String quizName) {
        //Store the active quiz in the session
        session.setAttribute("activeQuiz", service.getQuiz(quizName));

        //Get the first question in the active quiz.
        model.addAttribute("inquiry", service.getQuestion((Quiz)session.getAttribute("activeQuiz"), 0));
        return "quizview";
    }

    @GetMapping("/question")
    String displayCheeseQuiz(HttpSession session, Model model, @RequestParam int qnumber) {

        if (session.getAttribute("qnumber") != null) {
            if ((Integer) session.getAttribute("qnumber") > service.getCheeseQuiz().getQuestionArray().size() - 1) {
                return "redirect:/result";
            }
        }
        model.addAttribute("inquiry", service.getQuestion((Quiz)session.getAttribute("activeQuiz"), qnumber));
        return "quizview";
    }

    @PostMapping("/registeranswer")
    String registerAnswer(HttpSession session, char answer) {
        System.out.println(answer);
        //Get the hashmap from the session
        HashMap<Character, Integer> answerTable = (HashMap) session.getAttribute("answerTable");
        if (answerTable == null) {
            answerTable = new HashMap<>();
            session.setAttribute("answerTable", answerTable);
        }

        //Add the score to the right key
        if (answerTable.containsKey(answer)) {
            answerTable.put(answer, answerTable.get(answer) + 1);
        } else {
            answerTable.put(answer, 1);
        }

        //Save the current question requestparam in the session
        if (session.getAttribute("qnumber") == null) {
            session.setAttribute("qnumber", 1);
        } else {
            session.setAttribute("qnumber", (Integer) session.getAttribute("qnumber") + 1);
        }


        return "redirect:question?qnumber=" + session.getAttribute("qnumber");
    }

    @GetMapping("/result")
    String displayResultForTheUserWhoIsAGoodBoyOrGirl(HttpSession session, Model model){
        Character resultChar = service.calcMostAnswered((HashMap)session.getAttribute("answerTable"));
        Quiz activeQuiz = (Quiz)session.getAttribute("activeQuiz");

        model.addAttribute("result", activeQuiz.getResult(resultChar));
        return "result";
    }

    @PostMapping("/destroy")
    public String destroySession(HttpServletRequest request) {
        request.getSession().invalidate();
        return "redirect:/cheesequiz";
    }

}
