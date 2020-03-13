package org.hhjml.miniprojekt2;

public class Result {
    private long id;
    private long quizid;

    private char resultChar;
    private String result;
    private String description;
    private String imgUrl;

    public Result () {

    }

    public Result(long id, long quizid, char resultChar, String result, String description, String imgUrl) {
        this.id = id;
        this.quizid = quizid;
        this.resultChar = resultChar;
        this.result = result;
        this.description = description;
        this.imgUrl = imgUrl;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public long getQuizid() {
        return quizid;
    }

    public void setQuizid(long quizid) {
        this.quizid = quizid;
    }

    public char getResultChar() {
        return resultChar;
    }

    public void setResultChar(char resultChar) {
        this.resultChar = resultChar;
    }

    public void setResult(String result) {
        this.result = result;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setImgUrl(String imgUrl) {
        this.imgUrl = imgUrl;
    }

    public String getResult() {
        return result;
    }

    public String getDescription() {
        return description;
    }

    public String getImgUrl() {
        return imgUrl;
    }
}
