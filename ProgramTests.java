package com.test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import junit.framework.Assert;

class ProgramTests {

	@BeforeAll
	static void setup() {
		System.out.println("Tests will be performing shortly.");
	}
	@Test
	void add() {
		int result = FirstProgram.add(10,10);
		Assert.assertEquals(20, result);
	}
	@Test
	void minus() {
		int result = FirstProgram.minus(10,10);
		Assert.assertEquals(0, result);
	}
	@Test
	void multiply() {
		int result = FirstProgram.multiply(10,10);
		Assert.assertEquals(100, result);
	}
	@Test
	void divide() {
		int result = FirstProgram.divide(20,10);
		Assert.assertEquals(2, result);
	}
	@Test
	void modulus() {
		int result = FirstProgram.modulus(22,10);
		Assert.assertEquals(2, result);
	}
	@AfterAll
	static void destroy() {
		System.out.println("All tests are completed.");
	}

}
