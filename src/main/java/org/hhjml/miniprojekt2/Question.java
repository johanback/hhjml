package org.hhjml.miniprojekt2;

import java.util.List;

public class Question {
    private String question;
    private List<Answer> answerList;


    public Question(String question, List<Answer> answerList) {
        this.question = question;
        this.answerList = answerList;
    }

    public String getQuestion() {
        return question;
    }

    public void setQuestion(String question) {
        this.question = question;
    }

    public List<Answer> getAnswerList() {
        return answerList;
    }

    public void setAnswerList(List<Answer> answerList) {
        this.answerList = answerList;
    }
}
