package org.hhjml.miniprojekt2;

import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.HashMap;

@Repository
public class QuizRepository {

    HashMap<String, Quiz> quizDB = new HashMap<>();

    CheeseQuiz cheeseQuiz = new CheeseQuiz();
    ShoeQuiz shoeQuiz = new ShoeQuiz();

    public QuizRepository() {
        quizDB.put(cheeseQuiz.getQuizName(), cheeseQuiz);
        quizDB.put(shoeQuiz.getQuizName(), shoeQuiz);
    }

    public Quiz getQuiz(String quizName) {
        return quizDB.get(quizName);
    }

    public ArrayList<String> getQuizNames () {
        ArrayList<String> quizNames = new ArrayList<>();
        for (String s : quizDB.keySet()) {
            quizNames.add(s);
        }
        return quizNames;
    }

}