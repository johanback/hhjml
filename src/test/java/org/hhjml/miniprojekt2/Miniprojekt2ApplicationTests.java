package org.hhjml.miniprojekt2;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.util.Assert;

import java.util.HashMap;

@SpringBootTest
class Miniprojekt2ApplicationTests {
	@Autowired
	QuizService service;

	@Test
	void contextLoads() {
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

	@Test
	void testIfDraw() {
		HashMap<Character, Integer> toBeTested = new HashMap<>();
		toBeTested.put('B', 3);
		toBeTested.put('A', 3);
//		Assertions.assertEquals();
	}



}
