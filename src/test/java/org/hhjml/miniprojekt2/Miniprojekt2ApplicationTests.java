package org.hhjml.miniprojekt2;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.HashMap;

@SpringBootTest
class Miniprojekt2ApplicationTests {
	@Autowired
	QuizService service;

	@Test
	void contextLoads() {
	}

//	@Test
//	void givesTheCorrectName(){
//		CheeseQuiz cheeseQuiz = new CheeseQuiz();
//		MarvelQuiz marvelQuiz = new MarvelQuiz();
//		ShoeQuiz shoeQuiz = new ShoeQuiz();
//		Assertions.assertEquals("cheese", cheeseQuiz.getQuizName());
//		Assertions.assertEquals("Marvel", marvelQuiz.getQuizName());
//		Assertions.assertEquals("shoe", shoeQuiz.getQuizName());
//	}

	@Test
	void calcResultWorksAsExpected() {
		HashMap<Character, Integer> hm = new HashMap<>();
		hm.put('A', 2);
		hm.put('B', 5);
		hm.put('C', 2);
		hm.put('D', 1);
		HashMap<Character, Integer> hm2 = new HashMap<>();
		hm2.put('A', 2);
		hm2.put('B', 1);
		hm2.put('C', 1);
		hm2.put('D', 3);
		Assertions.assertEquals('B', service.calcMostAnswered(hm));
		Assertions.assertEquals('D', service.calcMostAnswered(hm2));
	}

	@Test
	void testAddScore () {
		HashMap<Character, Integer> toBeTested = new HashMap<>();
		toBeTested.put('B', 3);
		toBeTested.put('A', 2);
		service.addScore(toBeTested, 'A');
		service.addScore(toBeTested, 'C');
		Assertions.assertEquals(3, toBeTested.get('A'));
		Assertions.assertEquals(1, toBeTested.get('C'));
	}



}
