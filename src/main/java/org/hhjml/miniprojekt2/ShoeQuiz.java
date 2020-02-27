package org.hhjml.miniprojekt2;

import java.util.ArrayList;
import java.util.List;

public class ShoeQuiz implements Quiz{
    private String quizName = "shoe";
    private Result result1 = new Result("boots", "A boot, plural boots, is a type of specific footwear. " +
            "Most boots mainly cover the foot and the ankle, while some also cover some part of the lower calf.", "boots.jpg");
    private Result result2 = new Result("pumps", "A court shoe (British English), coort shoe (Scottish English), " +
            "or pump (American English), is a shoe with a low-cut front, or vamp, with either a shoe buckle or a black bow as ostensible fastening.", "pumps.jpg");
    private Result result3 = new Result("slippers", "Slippers are light footwear that are easy to put on and off and are intended to be worn indoors, " +
            "particularly at home.", "slippers.jpg");
    private Result result4 = new Result("sneakers", "Sneakers (also called trainers, athletic shoes, tennis shoes, gym shoes, kicks, sport shoes or runners) " +
            "are shoes primarily designed for sports or other forms of physical exercise, but which are now also widely used for everyday wear.", "sneakers.jpg");

    private List<Question> questionArray = new ArrayList<>();

    public ShoeQuiz() {
        getQuestionArray().add(new Question("Favourite color?", "Blue", "Red", "Green", "Cheesy yellow"));
        getQuestionArray().add(new Question("Favourite food?", "Cheese, duh!", "MEAT!", "Pasta!", "Oysters"));
        getQuestionArray().add(new Question("Favourite animal?", "Cat", "Dog", "Giraffe", "Pink fairy armadillo"));
        getQuestionArray().add(new Question("Favourite sci-fi franchise?", "Doctor who", "Star wars", "Star trek", "Battlestar Galactica"));
        getQuestionArray().add(new Question("Are you stupid?", "Yes", "Definetely", "I don't know?", "I don't understand the question"));
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

    @Override
    public String getQuizName() {
        return quizName;
    }
}
