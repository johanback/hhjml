package org.hhjml.miniprojekt2;

import java.util.ArrayList;
import java.util.List;

public abstract class Quiz {
    private String quizName;
    private String result1;
    private String result2;
    private String result3;
    private String result4;

    private List<Question> questionArray = new ArrayList<>();

    public String getResult(Character resultChar) {
        return result1;
    }

    public List<Question> getQuestionArray() {
        return questionArray;
    }
}
