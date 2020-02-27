package org.hhjml.miniprojekt2;

import java.util.ArrayList;
import java.util.List;

public class CarBrandQuiz implements Quiz {
    private String quizName = "carbrand";
    private Result result1 = new Result("Audi", "Audi AG is a German automobile manufacturer that designs, engineers, produces, " +
            "markets and distributes luxury vehicles.", "audi.jpg");
    private Result result2 = new Result("Renault", "Groupe Renault is a French multinational automobile manufacturer established " +
            "in 1899. The company produces a range of cars and vans, and in the past has manufactured trucks, tractors, tanks, buses/coaches, " +
            "aircraft and aircraft engines, and autorail vehicles.", "renault.jpg");
    private Result result3 = new Result("Tesla", "Tesla, Inc. (formerly Tesla Motors, Inc.), is an American electric vehicle and clean " +
            "energy company based in Palo Alto, California. The company specializes in electric vehicle manufacturing, battery energy storage from" +
            " home to grid scale and, through its acquisition of SolarCity, solar panel and solar roof tile manufacturing.", "tesla.jpg");
    private Result result4 = new Result("Mini", "Mini is a British automotive marque founded in 1969, owned by German automotive company " +
            "BMW since 2000, and used by them for a range of small cars.", "mini.jpg");

    private List<Question> questionArray = new ArrayList<>();

    public CarBrandQuiz() {
        getQuestionArray().add(new Question("How do you like speed?", "Fastest possible is the only choice", "I wish I was faster", "Alot, as long as it is also quiet", "Doesn't matter, as long as it's done in style"));
        getQuestionArray().add(new Question("When you accomplish a task, I...", "...make sure everything is done properly.", "...finish as soon as I can, even if the result is bad.", "...want to be as efficient as possible.", "...don't."));
        getQuestionArray().add(new Question("Sunglasses are...", "...neccesary!", "...useless.", "...an opportunity!", "...sunglasses?"));
        getQuestionArray().add(new Question("Favourite food?", "Schnitzel!", "Baguette", "Pizza hut", "Tiny schnitzels"));
        getQuestionArray().add(new Question("What's on your wrist?", "An expensive watch", "Nothing", "A smartwatch", "A bracelet"));
    }

    @Override
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

    @Override
    public List<Question> getQuestionArray() {
        return questionArray;
    }

    @Override
    public String getQuizName() {
        return quizName;
    }
}
