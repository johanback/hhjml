package org.hhjml.quizzes;

import org.hhjml.miniprojekt2.Question;
import org.hhjml.miniprojekt2.Result;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class WhoAreYou implements Quiz {

    private String quizName = "member of HHJML";

    private Result result1 = new Result("Ludwig", "Ludwig likes trains.", "parmesan.jpg");
    private Result result2 = new Result("Johan", "Johan is quite tall.", "johan.jpg");
    private Result result3 = new Result("Henrik", "Henrik likes plaid shirts and screwdrivers.", "cheddar.jpg");
    private Result result4 = new Result("Hanna", "Hanna often secretly takes pictures of strangers' dogs on the subway.", "pepperjack.jpg");

    private List<Question> questionArray = new ArrayList<>();

    public WhoAreYou() {
        getQuestionArray().add(new Question("Favourite food?", "Carbonara!", "Pizza!", "Hamburgers!", "Seafood risotto"));
        getQuestionArray().add(new Question("Favourite color?", "Yellow", "Burgundy", "Orange", "Blue"));
        getQuestionArray().add(new Question("Favourite beverage?", "Coke", "Juice", "Beer", "Diet Coke"));
        getQuestionArray().add(new Question("Shoe size?", "42", "44", "42", "41"));
        getQuestionArray().add(new Question("Pick a sport", "E-sport", "Football", "Golf", "Nah"));
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
