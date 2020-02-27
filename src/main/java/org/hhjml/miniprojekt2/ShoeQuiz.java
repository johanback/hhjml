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
        getQuestionArray().add(new Question("Favourite drink?", "Beer", "Coffee", "Milk", "Water"));
        getQuestionArray().add(new Question("How do you like the outdoors?", "It's the best!", "It's dirty!", "I'd rather stay inside", "Can I run in it?"));
        getQuestionArray().add(new Question("What is your favourite beer?", "Budweiser", "Beer?", "Whatever is in the fridge", "Something I can hardly pronounce"));
        getQuestionArray().add(new Question("What do you think about cars?", "It's only a car if it's a convertible", "A mode of transportation", "I'd prefer not to use one", "They're ok I guess!"));
        getQuestionArray().add(new Question("How do you prefer to travel?", "By horse", "By airplane", "I don't", "By bike"));
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
