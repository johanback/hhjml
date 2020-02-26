package org.hhjml.miniprojekt2;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashMap;

@Service
public class QuizService {

    @Autowired
    QuizRepository repository;

    public Question getQuestion(Quiz quiz, int qnumber) {
        return quiz.getQuestionArray().get(qnumber);
    }

    public Quiz getCheeseQuiz() {
        return repository.getCheeseQuiz();
    }

    public Character calcMostAnswered(HashMap<Character, Integer> answerTable){
        Character mostAnswered = 'A';
        for (Character c: answerTable.keySet()) {
            if (answerTable.get(c) > answerTable.get(mostAnswered)){
                mostAnswered = c;
            }
        }
        return mostAnswered;
    }



}
