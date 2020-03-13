package org.hhjml.miniprojekt2;

import org.hibernate.Hibernate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Random;

@Service
public class QuizService {



    @Autowired
    QuizRepository repository;
    @Autowired
    ResultRepository resultRepository;
    @Autowired
    QuestionRepository questionRepository;
    @Autowired
    AnswerRepository answerRepository;


    public Question getQuestion(Quiz quiz, int qnumber) {
        return quiz.getQuestions().get(qnumber);
    }

    public List<Answer> getAnswers(Question question){
        return question.getAnswers();
    }

    public Object getResult(Quiz quiz, Character resultChar) {
        List<Result> allResults = quiz.getResults();
        Result result = null;
        for(Result r : allResults){
            if (r.getResultChar() == resultChar){
                result = r;
            }
        }
        return result;
    }

    public void initializeQuiz(String quizName){
        Quiz activeQuiz = repository.findByName(quizName);
        Hibernate.initialize(activeQuiz);
    }

    public Quiz getQuiz (String quizName) {
        return repository.findByName(quizName);
    }

    public int getQuizSize (String quizName) {
        Quiz activeQuiz = repository.findByName(quizName);
        return activeQuiz.getQuestions().size();

    }

    public ArrayList<String> getQuizNames () {
        ArrayList<Quiz> allQuizzes = (ArrayList<Quiz>)repository.findAll();
        ArrayList<String> allQuizNames = new ArrayList<>();
        for (Quiz q : allQuizzes) {
            allQuizNames.add(q.getName());
        }
        return allQuizNames;
    }

    public void addScore (HashMap<Character, Integer> answerTable, char answer) {
        if (answerTable.containsKey(answer)) {
            answerTable.put(answer, answerTable.get(answer) + 1);
        } else {
            answerTable.put(answer, 1);
        }
    }

    public Character calcMostAnswered(HashMap<Character, Integer> answerTable){
        Integer compareValue = 0;
        Character mostAnswered = null;
        for (Character c: answerTable.keySet()) {
            if (answerTable.get(c) > compareValue){
                compareValue = answerTable.get(c);
                mostAnswered = c;
            }
        }

        for (Character c: answerTable.keySet()) {
            if (mostAnswered.equals(c)) {
                continue;
            } else if (answerTable.get(c) == compareValue) {
                Random r = new Random();
                mostAnswered = (r.nextInt(2) == 0 ? mostAnswered : c);
            }
        }
        return mostAnswered;
    }



//    public String getRandomQuiz(){
//        Random r = new Random();
//        int randomNumber = r.nextInt(getQuizNames().size() - 1);
//        String randomName = getQuizNames().get(randomNumber);
//        return randomName;
//    }

/*    public Result getResult(Quiz quiz, char resultChar) {
        return resultRepository.findByQuizNameAndResultChar(quiz.getName(), resultChar);
    }*/



}
