package org.hhjml.miniprojekt2;

import java.util.ArrayList;
import java.util.List;

public class CheeseQuiz implements Quiz {
    private String quizName = "cheese";
    private Result result1 = new Result("Parmesan", "Parmigiano-Reggiano or Parmesan is an Italian hard, granular cheese. " +
            "It has been called the \"King of Cheeses\" and a \"practically perfect food\".", "parmesan.jpg");
    private Result result2 = new Result("Gouda", "Parmigiano-Reggiano or Parmesan is an Italian hard, granular cheese. " +
            "It has been called the \"King of Cheeses\" and a \"practically perfect food\".", "gouda.jpg");
    private Result result3 = new Result("Parmesan", "Parmigiano-Reggiano or Parmesan is an Italian hard, granular cheese. " +
            "It has been called the \"King of Cheeses\" and a \"practically perfect food\".", "parmesan.jpg");
    private Result result4 = new Result("Parmesan", "Parmigiano-Reggiano or Parmesan is an Italian hard, granular cheese. " +
            "It has been called the \"King of Cheeses\" and a \"practically perfect food\".", "parmesan.jpg");



    private List<Question> questionArray = new ArrayList<>();

    public CheeseQuiz() {
        getQuestionArray().add(new Question("Favourite color?", "Blue", "Red", "Green", "Cheesy yellow"));
        getQuestionArray().add(new Question("Favourite food?", "Cheese, duh!", "MEAT!", "Pasta!", "Oysters"));
        getQuestionArray().add(new Question("Favourite animal?", "Cat", "Dog", "Giraffe", "Pink fairy armadillo"));
        getQuestionArray().add(new Question("Favourite sci-fi franchise?", "Doctor who", "Star wars", "Star trek", "Battlestar Galactica"));
    }

    public Result getResult(Character resultChar) {
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
                return null;
        }
    }

    public List<Question> getQuestionArray() {
        return questionArray;
    }


    public String getQuizName() {
        return quizName;
    }
}
