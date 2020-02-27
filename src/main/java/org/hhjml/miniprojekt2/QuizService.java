package org.hhjml.miniprojekt2;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.HashMap;

@Service
public class QuizService {

    @Autowired
    QuizRepository repository;

    public Question getQuestion(Quiz quiz, int qnumber) {
        return quiz.getQuestionArray().get(qnumber);
    }

    public Quiz getQuiz (String quizName) {
        return repository.getQuiz(quizName);
    }

    public ArrayList<String> getQuizNames () {
        return repository.getQuizNames();
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
                mostAnswered= c;
            }
        }
        return mostAnswered;
    }



}
