package org.hhjml.miniprojekt2;

import javax.persistence.*;

@Entity
public class Result {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;


    private char resultChar;
    private String result;
    private String description;
    private String imgUrl;
    @ManyToOne
    private Quiz quiz;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public Quiz getQuiz() {
        return quiz;
    }

    public void setQuiz(Quiz quiz) {
        this.quiz = quiz;
    }

    public char getResultChar() {
        return resultChar;
    }

    public void setResultChar(char resultChar) {
        this.resultChar = resultChar;
    }

    public String getResult() {
        return result;
    }

    public void setResult(String result) {
        this.result = result;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getImgUrl() {
        return imgUrl;
    }

    public void setImgUrl(String imgUrl) {
        this.imgUrl = imgUrl;
    }
}
