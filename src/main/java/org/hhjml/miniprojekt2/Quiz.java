package org.hhjml.miniprojekt2;

import java.util.List;

@Entity
public class Quiz {
    @Id
    @GenratedValue(strategy = generationType.IDENTITY)
    private long id;
    private String name;
    private List<Result> resultList;
    private List<Question> questionList;

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

    public List<Result> getResultList() {
        return resultList;
    }

    public void setResultList(List<Result> resultList) {
        this.resultList = resultList;
    }

    public List<Question> getQuestionList() {
        return questionList;
    }

    public void setQuestionList(List<Question> questionList) {
        this.questionList = questionList;
    }
}
