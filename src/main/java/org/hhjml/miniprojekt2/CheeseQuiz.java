package org.hhjml.miniprojekt2;

import java.util.ArrayList;
import java.util.List;

public class CheeseQuiz implements Quiz {

    private String quizName = "cheese";

    private Result result1 = new Result("Parmesan", "Parmigiano-Reggiano or Parmesan is an Italian hard, granular cheese. " +
            "It has been called the \"King of Cheeses\" and a \"practically perfect food\".", "parmesan.jpg");
    private Result result2 = new Result("Gouda", "Gouda is a mild, yellow cheese, originating from the Netherlands, " +
            "made from cow's milk. It is one of the most popular cheeses worldwide.", "gouda.jpg");
    private Result result3 = new Result("Cheddar", "Cheddar cheese is a relatively hard, off-white (or orange if colourings such as annatto are added), " +
            "sometimes sharp-tasting, natural cheese. Originating in the English village of Cheddar in Somerset, cheeses of this style are now produced beyond the " +
            "region and in several countries around the world.", "cheddar.jpg");
    private Result result4 = new Result("Pepper Jack", "Pepper Jack is a derivative of Monterey Jack, the original “American” cheese invented by Mexican " +
            "Franciscan friars of Monterey, California. As the name suggests, the cheese is flavoured with sweet peppers, rosemary, habañero chilies and garlic and spicy " +
            "jalapeños for an extra kick.", "pepperjack.jpg");

    private List<Question> questionArray = new ArrayList<>();

    public CheeseQuiz() {
        getQuestionArray().add(new Question("Favourite food?", "Pasta!", "Pizza!", "Hamburgers!", "Spicy food!"));
        getQuestionArray().add(new Question("Favourite color?", "Green", "Blue", "Yellow", "Red"));
        getQuestionArray().add(new Question("How would you define your style?", "Fancy", "Casual", "Whatever is on the floor when I wake up", "Rocker"));
        getQuestionArray().add(new Question("Favourite country?", "Italy", "Netherlands", "The United Kingdom", "USA"));
        getQuestionArray().add(new Question("Pick a sport", "Soccer", "Curling", "Rugby", "Football"));
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
