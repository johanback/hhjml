package org.hhjml.miniprojekt2;

import java.util.ArrayList;
import java.util.List;

public class StarWarsQuiz implements Quiz{

    private String quizName = "Star Wars character";
    private String result1 = "Anakin Skywalker";
    private String result2 = "Ahsoka Tano";
    private String result3 = "Sheev Palpatine";
    private String result4 = "Han Solo";

    private List<Question> questionArray = new ArrayList<>();

    public StarWarsQuiz() {
        getQuestionArray().add(new Question("Favourite color?", "Blue", "Red", "Green", "Cheesy yellow"));
        getQuestionArray().add(new Question("Favourite food?", "Cheese, duh!", "MEAT!", "Pasta!", "Oysters"));
        getQuestionArray().add(new Question("Favourite animal?", "Cat", "Dog", "Giraffe", "Pink fairy armadillo"));
        getQuestionArray().add(new Question("Favourite sci-fi franchise?", "Doctor who", "Star wars", "Star trek", "Battlestar Galactica"));
        getQuestionArray().add(new Question("Are you stupid?", "Yes", "Definetely", "I don't know?", "I don't understand the question"));
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

    @Override
    public String getQuizName() {
        return quizName;
    }
}
