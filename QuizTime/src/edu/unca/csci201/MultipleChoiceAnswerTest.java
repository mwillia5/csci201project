package edu.unca.csci201;

import static org.junit.Assert.*;

import org.junit.Test;

public class MultipleChoiceAnswerTest {

	@Test
	public void testCreateMultipleChoiceAnswer() {
		
		MultipleChoiceAnswer answer1 = new MultipleChoiceAnswer("A");
		MultipleChoiceAnswer answer2 = new MultipleChoiceAnswer("B");
		
	}

	@Test
	public void testIsSameAs() {

		MultipleChoiceAnswer answer1 = new MultipleChoiceAnswer("A");
		MultipleChoiceAnswer answer2 = new MultipleChoiceAnswer("A");
		MultipleChoiceAnswer answer3 = new MultipleChoiceAnswer("B..");
		
		assertTrue("IsSameAs() fails self-test for true", answer1.isSameAs(answer1));
		assertTrue("IsSameAs() fails self-test for false", answer2.isSameAs(answer2));
		assertTrue("IsSameAs() fails for true", answer1.isSameAs(answer2));
		assertFalse("IsSameAs() fails for false", answer1.isSameAs(answer3));
		
	}

	@Test
	public void testToString() {
		MultipleChoiceAnswer answer1 = new MultipleChoiceAnswer("A");
		MultipleChoiceAnswer answer2 = new MultipleChoiceAnswer("B");
		
		assertTrue("toString() does not output 'A'", answer1.toString().equalsIgnoreCase("a"));
		assertTrue("toString() does not output 'B'", answer2.toString().equalsIgnoreCase("b"));
		
	}

}
