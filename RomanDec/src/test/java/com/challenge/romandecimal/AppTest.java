package com.challenge.romandecimal;

import org.junit.Before;
import org.junit.Test;

import com.challenge.romandecimal.App;

import junit.framework.TestCase;

/**
 * Unit test for simple App
 */
public class AppTest extends TestCase {
	App app;

	@Before
	public void setUp() {
		app = new App();

	}

	@Test
	public void testEqualConsequtives() {
		String input = "MM";
		assertEquals("testing testEqualConsequtives", Integer.valueOf(2000), Integer.valueOf(app.getResult(input)));

	}

	@Test
	public void testFirstLargerVal() {
		String input = "VI";
		assertEquals("testing testFirstLargerVal", Integer.valueOf(6), Integer.valueOf(app.getResult(input)));

	}

	public void testSecondLargerVal() {
		String input = "IV";
		assertEquals("testing testSecondLargerVal", Integer.valueOf(4), Integer.valueOf(app.getResult(input)));

	}

	@Test
	public void testSample() {
		String input = "MDCLXVI";
		assertEquals("testing testSample", Integer.valueOf(1666), Integer.valueOf(app.getResult(input)));

	}

}
