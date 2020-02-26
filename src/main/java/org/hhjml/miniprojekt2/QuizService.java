package org.hhjml.miniprojekt2;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

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



}
