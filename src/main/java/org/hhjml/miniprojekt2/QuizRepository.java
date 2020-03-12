package org.hhjml.miniprojekt2;

import org.hhjml.quizzes.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import javax.sql.DataSource;
import java.sql.*;
import java.util.ArrayList;
import java.util.HashMap;

@Repository
public class QuizRepository {

    @Autowired
    DataSource dataSource;

    public Quiz getQuiz(String quizName) {

        Quiz quiz = new Quiz();

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

    public ArrayList<String> getQuizNames () {
        ArrayList<String> quizNames = new ArrayList<>();
        quizNames.addAll(quizDB.keySet());
        return quizNames;
    }

}