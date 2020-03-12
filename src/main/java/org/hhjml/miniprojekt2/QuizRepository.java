package org.hhjml.miniprojekt2;

import org.hhjml.quizzes.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import javax.sql.DataSource;
import java.util.ArrayList;
import java.util.HashMap;

@Repository
public class QuizRepository {

    @Autowired
    DataSource dataSource;

    HashMap<String, Quiz> quizDB = new HashMap<>();

    CheeseQuiz cheeseQuiz = new CheeseQuiz();
    ShoeQuiz shoeQuiz = new ShoeQuiz();
    MarvelQuiz marvelQuiz = new MarvelQuiz();
    CarBrandQuiz carBrandQuiz = new CarBrandQuiz();
    MusicGenreQuiz musicGenreQuiz = new MusicGenreQuiz();
    RailWayEngineQuiz railWayEngineQuiz = new RailWayEngineQuiz();
    WhoAreYou whoAreYou = new WhoAreYou();

    public QuizRepository() {
        quizDB.put(cheeseQuiz.getQuizName(), cheeseQuiz);
        quizDB.put(shoeQuiz.getQuizName(), shoeQuiz);
        quizDB.put(marvelQuiz.getQuizName(), marvelQuiz);
        quizDB.put(carBrandQuiz.getQuizName(), carBrandQuiz);
        quizDB.put(musicGenreQuiz.getQuizName(), musicGenreQuiz);
        quizDB.put(railWayEngineQuiz.getQuizName(), railWayEngineQuiz);
        quizDB.put(whoAreYou.getQuizName(), whoAreYou);
    }

    public Quiz getQuiz(String quizName) {
        return quizDB.get(quizName);
    }

    public ArrayList<String> getQuizNames () {
        ArrayList<String> quizNames = new ArrayList<>();
        quizNames.addAll(quizDB.keySet());
        return quizNames;
    }

}