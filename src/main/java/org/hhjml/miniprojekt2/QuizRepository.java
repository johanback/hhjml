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
            PreparedStatement ps = conn.prepareStatement("SELECT * FROM Quiz " +
                                                            "WHERE Quiz.name = ?");
            ps.setString(1, quizName);
            ResultSet rs = ps.executeQuery();

            if (rs.next()) {
                quiz.setId(rs.getLong("ID"));
                quiz.setName(rs.getString("Name"));
            }

            quiz.setQuestionArray(getQuestions(quiz));
            quiz.setResultList(getResults(quiz));

        } catch (SQLException e) {
            e.printStackTrace();
        }

        return quiz;
    }

    private List<Result> getResults (Quiz quiz) {
        List<Result> resultList = new ArrayList<>();
        try (Connection conn = dataSource.getConnection()) {
            PreparedStatement ps = conn.prepareStatement("SELECT * FROM Result " +
                                                        "JOIN Quiz ON Quiz.id=Result.Quiz_id " +
                                                        "WHERE ")
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    private List<Question> getQuestions (Quiz quiz) {
        List<Question> qarray = new ArrayList<>();
        //Gör en query som hämtar varje question baserat på quizens id.
        //Gör en metod som tar question och stoppar in alla svar.
        //Loopa igenom arrayen efter den blivit fylld med frågor och anropa getAnswers för varje.

        try (Connection conn = dataSource.getConnection()) {
            PreparedStatement ps = conn.prepareStatement("SELECT * FROM Question " +
                                                            "JOIN Quiz ON Quiz.id=Question.quizid " +
                                                            "WHERE quiz.id = ?");
            ps.setLong(1, quiz.getId());
            ResultSet rs = ps.executeQuery();

            while (rs.next()) {
                qarray.add(new Question(rs.getLong("ID"),rs.getLong("quizid"), rs.getString("Question"), getAnswers(rs.getLong("ID"))));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }


        return qarray;

    }

    private List<Answer> getAnswers (long questionid) {
        List<Answer> answerList = new ArrayList<>();
        //Gör en question som hämtar varje answer baserat på question id.
        try (Connection conn = dataSource.getConnection()) {
            PreparedStatement ps = conn.prepareStatement("SELECT * FROM Answer " +
                                                        "JOIN Question ON Question.id=Answer.questionid " +
                                                        "WHERE question.id=?");
            ps.setLong(1, questionid);
            ResultSet rs = ps.executeQuery();

            while (rs.next()) {
                answerList.add(new Answer(rs.getLong("ID"),
                        rs.getLong("QuestionID"),
                        rs.getString("Answer"),
                        rs.getString("Resultchar").charAt(0)));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return answerList;
    }

    public ArrayList<String> getQuizNames () {
        ArrayList<String> quizNames = new ArrayList<>();

        try (Connection conn = dataSource.getConnection()) {
            PreparedStatement ps = conn.prepareStatement("SELECT Name FROM Quiz");
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                quizNames.add(rs.getString("Name"));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return quizNames;
    }

}