package org.hhjml.miniprojekt2;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import javax.transaction.Transactional;
import java.util.List;

@SpringBootTest
class Miniprojekt2ApplicationTests {
    @Autowired
    QuizService service;

    @Autowired
    QuizRepository repository;

    @Autowired
    QuestionRepository questionRepository;

    @Autowired
    AnswerRepository answerRepository;


    @Test
    void contextLoads() {
    }

    @Test
    @Transactional
    void testGetQuiz() {
        Quiz quiz = repository.findById(1L).get();
        Assertions.assertEquals("Cheese Quiz", quiz.getName());
    }

    @Test
    void testGetQuestion() {
        Question question = questionRepository.findById(1L).get();
        Assertions.assertEquals("Question 1", question.getQuestionBody());
	}

	@Test
    void testGettingQuestions() {
        Quiz quiz = repository.findById(1L).get();
        Question question = quiz.getQuestions().get(0);
        Assertions.assertEquals("Question 1", question.getQuestionBody());
    }

    @Test
    void testGettingResults() {
        Quiz quiz = repository.findById(1L).get();
        Result result = quiz.getResults().get(0);
        Assertions.assertEquals("Result 1", result.getResult());
    }

    @Test
    void testGettingAnswers() {
        Quiz quiz = repository.findById(1L).get();
        Question question = quiz.getQuestions().get(0);
        Answer answer = question.getAnswers().get(0);
        Assertions.assertEquals("Answer 1", answer.getAnswer());
    }

//	@Test
//	void calcResultWorksAsExpected() {
//		HashMap<Character, Integer> hm = new HashMap<>();
//		hm.put('A', 2);
//		hm.put('B', 5);
//		hm.put('C', 2);
//		hm.put('D', 1);
//		HashMap<Character, Integer> hm2 = new HashMap<>();
//		hm2.put('A', 2);
//		hm2.put('B', 1);
//		hm2.put('C', 1);
//		hm2.put('D', 3);
//		Assertions.assertEquals('B', service.calcMostAnswered(hm));
//		Assertions.assertEquals('D', service.calcMostAnswered(hm2));
//	}
//
//	@Test
//	void testAddScore () {
//		HashMap<Character, Integer> toBeTested = new HashMap<>();
//		toBeTested.put('B', 3);
//		toBeTested.put('A', 2);
//		service.addScore(toBeTested, 'A');
//		service.addScore(toBeTested, 'C');
//		Assertions.assertEquals(3, toBeTested.get('A'));
//		Assertions.assertEquals(1, toBeTested.get('C'));
//	}
    }

