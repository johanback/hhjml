package org.hhjml.miniprojekt2;

import java.util.ArrayList;
import java.util.List;

public class CheeseQuiz extends Quiz {
    private String result1 = "Parmesan";
    private String result2 = "Cheddar";
    private String result3 = "Gouda";
    private String result4 = "Pepper jack";

    private List<Question> questionArray = new ArrayList<>();

    public CheeseQuiz() {
        getQuestionArray().add(new Question("Favourite color?", "Blue", "Red", "Green", "Cheesy yellow"));
        getQuestionArray().add(new Question("Favourite food?", "Cheese, duh!", "MEAT!", "Pasta!", "Oysters"));
        getQuestionArray().add(new Question("Favourite animal?", "Cat", "Dog", "Giraffe", "Pink fairy armadillo"));
        getQuestionArray().add(new Question("Favourite sci-fi franchise?", "Doctor who", "Star wars", "Star trek", "Battlestar Galactica"));
    }

    public String getResult1() {
        return result1;
    }

    public String getResult2() {
        return result2;
    }

    public String getResult3() {
        return result3;
    }

    public String getResult4() {
        return result4;
    }

    public List<Question> getQuestionArray() {
        return questionArray;
    }
}
