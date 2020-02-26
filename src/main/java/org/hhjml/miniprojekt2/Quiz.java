package org.hhjml.miniprojekt2;

import java.util.ArrayList;
import java.util.List;

public abstract class Quiz {
    private String result1;
    private String result2;
    private String result3;
    private String result4;

    private List<Question> questionArray = new ArrayList<>();

    public String getResult1() {
        return result1;
    }

    public String getResult2() {
        return result2;
    }

    public String getResult3() {
        return result3;
    }

    public String getResult4() {
        return result4;
    }

    public List<Question> getQuestionArray() {
        return questionArray;
    }
}
