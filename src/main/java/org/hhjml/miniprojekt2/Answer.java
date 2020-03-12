package org.hhjml.miniprojekt2;


public class Answer {

    private long id;
    private Question question;
    private String answer;
    private char resultChar;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public Question getQuestion() {
        return question;
    }

    public void setQuestion(Question question) {
        this.question = question;
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
