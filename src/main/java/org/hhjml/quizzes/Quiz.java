package org.hhjml.quizzes;

import org.hhjml.miniprojekt2.Question;
import org.hhjml.miniprojekt2.Result;

import java.util.ArrayList;
import java.util.List;

public interface Quiz {

    public Result getResult(Character resultChar);
    public List<Question> getQuestionArray();
    public String getQuizName();
}
