package edu.unca.csci201;

import static org.junit.Assert.*;

import org.junit.Test;

public class MultipleChoiceAnswerTest {

	@Test
	public void testCreateTrueFalseAnswer() {
		
		TrueFalseAnswer answer1 = new TrueFalseAnswer(true);
		TrueFalseAnswer answer2 = new TrueFalseAnswer(false);
		
	}

	@Test
	public void testIsSameAs() {

		TrueFalseAnswer answer1 = new TrueFalseAnswer(true);
		TrueFalseAnswer answer2 = new TrueFalseAnswer(true);
		TrueFalseAnswer answer3 = new TrueFalseAnswer(false);
		
		assertTrue("IsSameAs() fails self-test for true", answer1.isSameAs(answer1));
		assertTrue("IsSameAs() fails self-test for false", answer2.isSameAs(answer2));
		assertTrue("IsSameAs() fails for true", answer1.isSameAs(answer2));
		assertFalse("IsSameAs() fails for false", answer1.isSameAs(answer3));
		
	}

	@Test
	public void testToString() {
		TrueFalseAnswer answer1 = new TrueFalseAnswer(true);
		TrueFalseAnswer answer2 = new TrueFalseAnswer(false);
		
		assertTrue("toString() does not output 'true'", answer1.toString().equalsIgnoreCase("true"));
		assertTrue("toString() does not output 'false'", answer2.toString().equalsIgnoreCase("false"));
		
	}

}
