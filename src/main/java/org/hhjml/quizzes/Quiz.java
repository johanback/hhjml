package org.hhjml.quizzes;

import org.hhjml.miniprojekt2.Question;
import org.hhjml.miniprojekt2.Result;

import java.util.ArrayList;
import java.util.List;

public class Quiz {
    private long id;

    private String name;

    private List<Result> resultList;
    private List<Question> questionArray;

    public Result getResult(Character resultChar) {
        for (Result r : resultList) {
            if (r.getResultChar() == resultChar) {
                return r;
            }
        }
        return new Result();
    }

    public List<Result> getResultList() {
        return resultList;
    }

    public void setResultList(List<Result> resultList) {
        this.resultList = resultList;
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

    public List<Question> getQuestionArray() {
        return questionArray;
    }

    public void setQuestionArray(List<Question> questionArray) {
        this.questionArray = questionArray;
    }
}
