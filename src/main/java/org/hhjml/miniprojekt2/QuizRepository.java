package org.hhjml.miniprojekt2;

import org.springframework.stereotype.Repository;

@Repository
public class QuizRepository {

    CheeseQuiz cheeseQuiz = new CheeseQuiz();

    public CheeseQuiz getCheeseQuiz() {
        return cheeseQuiz;
    }
}
