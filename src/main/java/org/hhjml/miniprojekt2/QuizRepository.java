package org.hhjml.miniprojekt2;

import org.hhjml.quizzes.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.web.method.annotation.AbstractWebArgumentResolverAdapter;

import javax.sql.DataSource;
import java.sql.*;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

@Repository
public class QuizRepository {

    @Autowired
    DataSource dataSource;

    public Quiz getQuiz(String quizName) {

        Quiz quiz = new Quiz();

        /*1. Quiz skapas, får sitt namn
        2. Metod som skapar en ArrayList av frågor som sen sätts till quizens sån arraylist.
            //quiz.setQuestionsArray(getQuestions(quiz))
        3. Metod som sätter resultaten
        4. Returnerar färdigt quiz.
         */

        try (Connection conn = dataSource.getConnection()) {
            PreparedStatement ps = conn.prepareStatement("SELECT * FROM Quiz" +
                                                            "JOIN Question ON Quiz.id=question.quizid" +
                                                            "JOIN Answer ON Question.id=Answer.questionid" +
                                                            "JOIN Result ON Quiz.id=Result.quizid" +
                                                            "WHERE Quiz.name = ?");
            ps.setString(1, quizName);
            ResultSet rs = ps.executeQuery();

            while (rs.next()) {

            }

        } catch (SQLException e) {
            e.printStackTrace();
        }

        return quiz;
    }

    private List<Question> getQuestions (Quiz quiz) {
        List<Question> qarray = new ArrayList<>();
        //Gör en query som hämtar varje question baserat på quizens id.
        //Gör en metod som tar question och stoppar in alla svar.

        getAnswers();

        return qarray;

    }

    private List<Answer> getAnswers (Question question) {
        List<Answer> answerList = new ArrayList<>();
        //Gör en question som hämtar varje answer baserat på question id.
        return answerList;
    }

    public ArrayList<String> getQuizNames () {
        ArrayList<String> quizNames = new ArrayList<>();
        quizNames.addAll(quizDB.keySet());
        return quizNames;
    }

}