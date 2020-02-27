package org.hhjml.miniprojekt2;

public class Result {

    private String result;
    private String description;
    private String imgUrl;

    public Result(String result, String description, String imgUrl) {
        this.result = result;
        this.description = description;
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
