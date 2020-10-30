package edu.unca.csci201;

import static org.junit.Assert.*;

import org.junit.Test;

public class FillinTheBlankAnswerTest {


	@Test
	public void testCreateTrueFalseAnswer() {
		
		SingleWordAnswer answer1 = new SingleWordAnswer("test");
		SingleWordAnswer answer2 = new SingleWordAnswer("test2");
		
	}

	@Test
	public void testIsSameAs() {

		SingleWordAnswer answer1 = new SingleWordAnswer("test1");
		SingleWordAnswer answer2 = new SingleWordAnswer("test1");
		SingleWordAnswer answer3 = new SingleWordAnswer("test2");
		
		assertTrue("IsSameAs() fails self-test for true", answer1.isSameAs(answer1));
		assertTrue("IsSameAs() fails self-test for false", answer2.isSameAs(answer2));
		assertTrue("IsSameAs() fails for true", answer1.isSameAs(answer2));
		assertFalse("IsSameAs() fails for false", answer1.isSameAs(answer3));
		
	}

	@Test
	public void testToString() {
		SingleWordAnswer answer1 = new SingleWordAnswer("testing");
		SingleWordAnswer answer2 = new SingleWordAnswer("testing2");
		
		assertTrue("toString() does not output 'testing'", answer1.toString().equalsIgnoreCase("TESTING"));
		assertTrue("toString() does not output 'testing2'", answer2.toString().equalsIgnoreCase("TESTING2"));
		
	}

}
