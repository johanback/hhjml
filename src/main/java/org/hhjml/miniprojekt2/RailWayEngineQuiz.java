package org.hhjml.miniprojekt2;

import java.util.ArrayList;
import java.util.List;

public class RailWayEngineQuiz implements Quiz {
    private String quizName = "rail way engine";
    private Result result1 = new Result("Thomas the tank engine", "Thomas the Tank Engine is a fictional anthropomorphised steam locomotive in The Railway Series books " +
            "by the Reverend Wilbert Awdry and his son, Christopher, published from 1945.", "thomastank.jpeg");
    private Result result2 = new Result("Rc4", "The SJ Class Rc is the most used electric locomotive in Sweden. Rc is a universal locomotive used both in freight and passenger trains.", "Rc4.jpg");
    private Result result3 = new Result("TMZ", "DSB class MZ was a series of 61 diesel-electric locomotives operated by Danske Statsbaner. They were built by NOHAB between 1967 and 1978 under " +
            "licence from General Motors EMD with subcontractors Thrige-Titan (traction motors) and Frichs (chassis, bodywork). ", "tmz.jpg");
    private Result result4 = new Result("Siemens taurus", "The EuroSprinter family of electric locomotives is a modular concept of locomotives for the European market built by Siemens. " +
            "The internal Siemens product name is ES 64, with ES for EuroSprinter and the number 64 indicating the 6,400 kW power at rail. In Sweden the locomotives are called Taurus", "taurus.jpg");

    private List<Question> questionArray = new ArrayList<>();

    public RailWayEngineQuiz () {
        questionArray.add(new Question("Do you even lift?", "No.", "Occasionally", "Yeah, YOU WANNA GO?!", "Mmmmmhmmm."));
        questionArray.add(new Question("What is your opinion on protein powder?", "Eh...", "It provides some extra taste for my milk.", "Workout is worthless without it!", "Pseudo-science"));
        questionArray.add(new Question("What is your favourite metal?", "Gold.", "Steel.", "The music kind", "Whatever is shiny."));
        questionArray.add(new Question("What is your opinion on climate change?", "It's not real.", "We've known about it forever...", "F*ck the climate!", "Something has to be done now!"));
        questionArray.add(new Question("What is most important - speed or strength?", "Neither.", "Strength, but you can never skip leg day", "POWEEEEER!", "I'd say 50/50"));
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
