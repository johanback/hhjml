package org.hhjml.miniprojekt2;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface QuestionRepository extends CrudRepository<Question, Long> {

/*    @Query("SELECT q FROM Question q WHERE q.quiz =?1")
    List<Question> findAllByQuestionBelongingTo(Quiz quiz);*/

//    List<Question> findAllByQuizfk(Quiz quiz);
}
