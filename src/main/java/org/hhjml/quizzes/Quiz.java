package org.hhjml.quizzes;

import org.hhjml.miniprojekt2.Question;
import org.hhjml.miniprojekt2.Result;

import java.util.ArrayList;
import java.util.List;

public class Quiz {
    private long id;

    private String name;

    private Result result1;
    private Result result2;
    private Result result3;
    private Result result4;

    private List<Question> questionArray;

    public Result getResult(Character resultChar) {
        switch (resultChar) {
            case 'A':
                return result1;
            case 'B':
                return result2;
            case 'C':
                return result3;
            case 'D':
                return result4;
            default:
                return null;
        }
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Result getResult1() {
        return result1;
    }

    public void setResult1(Result result1) {
        this.result1 = result1;
    }

    public Result getResult2() {
        return result2;
    }

    public void setResult2(Result result2) {
        this.result2 = result2;
    }

    public Result getResult3() {
        return result3;
    }

    public void setResult3(Result result3) {
        this.result3 = result3;
    }

    public Result getResult4() {
        return result4;
    }

    public void setResult4(Result result4) {
        this.result4 = result4;
    }

    public List<Question> getQuestionArray() {
        return questionArray;
    }

    public void setQuestionArray(List<Question> questionArray) {
        this.questionArray = questionArray;
    }
}
