package org.hhjml.quizzes;

import org.hhjml.miniprojekt2.Question;
import org.hhjml.miniprojekt2.Result;

import java.util.ArrayList;
import java.util.List;

public class MusicGenreQuiz implements Quiz {


    private String quizName = "music genre";

    private Result result1 = new Result("Death metal", "Hard, fast and with indecipherable vocals, you make everyone's friends shift in their seats when someone puts you on during a party.", "deathmetal.jpg");
    private Result result2 = new Result("Jazz", "Technical, inaccessible and elitist, you turn your listeners into the most obnoxious people around, ruining friendships and relationships alike.", "jazz.jpg");
    private Result result3 = new Result("Pop", "Simple, easy to listen to, and commercially viable, you are the envy of the other genres, although they would never dare admit it.", "pop.jpg");
    private Result result4 = new Result("Rap", "Wether it's quick and techincal or mumbled and autotuned, you have taken the world by storm. While other genres debate on whether something with no melody can be considered music you are too busy partying and living it up to care.", "rap.jpg");

    private List<Question> questionArray = new ArrayList<>();

    public MusicGenreQuiz() {
        getQuestionArray().add(new Question("The first thing I do when I wake up is:", "Scream at the top of my lungs", "Do complex math", "Have breakfast", "Go back to bed"));
        getQuestionArray().add(new Question("Which of these video games would you prefer to play?", "Facemelting shooter", "Nothing, I don't bother with video games", "The Sims", "An adventurous role-playing game"));
        getQuestionArray().add(new Question("My pants are:", "Studded with spikes for some reason", "Second hand pants from the 60s", "Way too revealing", "Hanging on to my knees for dear life"));
        getQuestionArray().add(new Question("After work/school I go straight to:", "The pub", "The book store", "The gym", "Prison (do not pass go)"));
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


