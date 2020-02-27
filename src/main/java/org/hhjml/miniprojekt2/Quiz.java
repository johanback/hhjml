package org.hhjml.miniprojekt2;

import java.util.ArrayList;
import java.util.List;

public interface Quiz {

    public Result getResult(Character resultChar);
    public List<Question> getQuestionArray();
    public String getQuizName();
}
