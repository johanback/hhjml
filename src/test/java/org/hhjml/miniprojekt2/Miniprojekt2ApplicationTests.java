package org.hhjml.miniprojekt2;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

@SpringBootTest
class Miniprojekt2ApplicationTests {
	@Autowired
	QuizService service;

	@Autowired
	QuizRepository repository;

	@Autowired
	QuestionRepository questionRepository;

	@Test
	void contextLoads() {
	}

	@Test
	void testGetQuiz() {
		Quiz quiz = repository.findByName("Cheese Quiz");
		List<Question> test = quiz.getQuestionList();
		for(Question q : test){
			System.out.println(q);
		}
		Assertions.assertEquals("Cheese Quiz", quiz.getName());
	}

	@Test
	void testListGetsPopulated() {
		Quiz quiz = repository.findByName("Cheese Quiz");
//		quiz.setQuestionList(questionRepository.findAllByCustomQuery(quiz.getId()));
//		for(Question q : quiz.getQuestionList()){
//			System.out.println(q);
//		}
		Assertions.assertEquals(2, quiz.getQuestionList().size());
	}

	@Test
	void testNoOfQuestions() {
		Quiz quiz = repository.findByName("Cheese Quiz");
		service.initializeQuiz(quiz);
		Assertions.assertEquals(2, quiz.getQuestionList().size());
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
