package org.hhjml.miniprojekt2;

import java.util.ArrayList;
import java.util.List;

public class MarvelQuiz implements Quiz {

    private String quizName = "marvel hero";

    private Result result1 = new Result("Iron-man", "Genius. Billionaire. Playboy. Philanthropist.", "iron man.jpg");
    private Result result2 = new Result("Hulk", "Dr. Bruce Banner lives a life caught between the soft-spoken scientist he’s always been and the uncontrollable green monster powered by his rage.", "hulc.jpg");
    private Result result3 = new Result("Captian America", "Recipient of the Super-Soldier serum, World War II hero Steve Rogers fights for American ideals as one of the world’s mightiest heroes and the leader of the Avengers.", "captain america.jpg");
    private Result result4 = new Result("Thor", "The son of Odin uses his mighty abilities as the God of Thunder to protect his home Asgard and planet Earth alike.", "Ebba thor.jpg");

    private List<Question> questionArray = new ArrayList<>();

    public MarvelQuiz() {
        getQuestionArray().add(new Question("What kind of pizza do you like?", "Oxfilé-pizza", "Kebabpizza", "Margarita", "Calzone"));
        getQuestionArray().add(new Question("Favorite Tv-show when you were young?", "Fresh prince in bel air", "Magnum PI", "Full house", "Golden girls"));
        getQuestionArray().add(new Question("Your choice of liquid?", "Whisky", "Milk", "Manhattan", "Mead"));
        getQuestionArray().add(new Question("Choose the destination you would like to travel to?", "The Moon", "Cave", "City", "Alps"));
        getQuestionArray().add(new Question("Choose a president?", "Vladimir Putin", "Kim Jong Un", "George W Bush", "Donald Trump"));
    }

    public Result getResult(Character resultChar) {
        switch (resultChar) {
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
