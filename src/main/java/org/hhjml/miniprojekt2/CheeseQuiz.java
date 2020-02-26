package org.hhjml.miniprojekt2;

import java.util.ArrayList;
import java.util.List;

public class CheeseQuiz extends Quiz {
    private String quizName = "cheese";
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

    public String getResult(Character resultChar) {
        switch (resultChar){
            case 'A':
                return result1;
            case 'B':
                return result2;
            case 'C':
                return result3;
            case 'D':
                return result4;
            default:
                return "No fucking clue mate";
        }
    }

    public List<Question> getQuestionArray() {
        return questionArray;
    }
}
