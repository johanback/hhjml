package org.hhjml.miniprojekt2;

public class Answer {
    private long id;
    private long questionId;
    private String answer;
    private char resultChar;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public long getQuestionId() {
        return questionId;
    }

    public void setQuestionId(long questionId) {
        this.questionId = questionId;
    }

    public String getAnswer() {
        return answer;
    }

    public void setAnswer(String answer) {
        this.answer = answer;
    }

    public char getResultChar() {
        return resultChar;
    }

    public void setResultChar(char resultChar) {
        this.resultChar = resultChar;
    }
}
