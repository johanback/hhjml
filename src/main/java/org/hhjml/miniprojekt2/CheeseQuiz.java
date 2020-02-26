package org.hhjml.miniprojekt2;

import java.util.ArrayList;
import java.util.List;

public class CheeseQuiz {
    String result1 = "Parmesan";
    String result2 = "Cheddar";
    String result3 = "Gouda";
    String result4 = "Pepper jack";

    List<Question> questionArray = new ArrayList<>();

    public CheeseQuiz() {
        questionArray.add(new Question("Favourite color?", "Blue", "Red", "Green", "Cheesy yellow"));
        questionArray.add(new Question("Favourite food?", "Cheese, duh!", "MEAT!", "Pasta!", "Oysters"));
        questionArray.add(new Question("Favourite animal?", "Cat", "Dog", "Giraffe", "Pink fairy armadillo"));
        questionArray.add(new Question("Favourite sci-fi franchise?", "Doctor who", "Star wars", "Star trek", "Battlestar Galactica"));
    }

}
