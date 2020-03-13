package org.hhjml.miniprojekt2;

import java.util.List;

public class Question {
    private long id;
    private long quizid;
    private String question;
    private List<Answer> answerList;


    public Question(long id, long quizid, String question, List<Answer> answerList) {
        this.id = id;
        this.quizid=quizid;
        this.question = question;
        this.answerList = answerList;
    }

    public long getQuizid() {
        return quizid;
    }

    public void setQuizid(long quizid) {
        this.quizid = quizid;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
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
