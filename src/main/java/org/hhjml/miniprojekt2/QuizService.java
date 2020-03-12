package org.hhjml.miniprojekt2;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.HashMap;
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
        return quiz.getQuestionList().get(qnumber);
    }

    public void initializeQuiz(Quiz activeQuiz){
        activeQuiz.setQuestionList(questionRepository.findAllByCustomQuery(activeQuiz));
        for (Question q: activeQuiz.getQuestionList()) {
            q.setAnswerList(answerRepository.findAllByQuestion(q));
        }
        activeQuiz.setResultList(resultRepository.findByQuiz(activeQuiz));
    }

    public Quiz getQuiz (String quizName) {
        return repository.findByName(quizName);
    }

    public int getQuizSize (String quizName) {
        return repository.findByName(quizName).getQuestionList().size();
//        return getQuiz(quizName).getQuestionList().size();
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

    public Result getResult(Quiz quiz, char resultChar) {
        return resultRepository.findByQuizNameAndResultChar(quiz.getName(), resultChar);
    }



}
