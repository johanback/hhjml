package org.hhjml.miniprojekt2;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

public interface QuizRepository extends CrudRepository<Quiz, Long> {

    Quiz findByName(String name);

    @Query("SELECT q.name FROM Quiz q")
    Iterable<String> getQuizNames();

}
