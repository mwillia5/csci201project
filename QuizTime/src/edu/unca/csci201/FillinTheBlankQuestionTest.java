package edu.unca.csci201;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class FillinTheBlankQuestionTest {

	FillinTheBlankQuestion question;
	
	
	@Before
	public void setUp() throws Exception {
		question = new FillinTheBlankQuestion("The answer to this question is \'fill\' ", "fill");
	}

	@Test
	public void testGetTextPrompt() {

		assertTrue("Text prompt not returned correctly", question.getTextPrompt().equals("The answer to this question is \'fill\' "));
	}

	@Test
	public void testGetPossibleAnswers() {
		try {
			question.getPossibleAnswers();
		} catch (NoAnswersException e) {
			// Exception thrown successfully (true / false doesn't give a list of possible answers)
			return;
		}
		
		fail("Exception not thrown when true/false question asked for a list of possible answers");
	}

	@Test
	public void testGetCorrectAnswer() throws NoCorrectAnswerException {
		Answer ans = question.getCorrectAnswer();
		
		SingleWordAnswer SWAns = (SingleWordAnswer) ans;
		
		assertTrue("Incorrect answer returned for the true/false question", SWAns.isSameAs(new SingleWordAnswer("fill")));
		
	}

	@Test
	public void testConvertResponseToAnswer() throws InvalidResponseException {
		Answer ans = question.convertResponseToAnswer("fill");
		
		SingleWordAnswer SWAns = (SingleWordAnswer) ans;
		
		assertTrue("Incorrect answer returned converting user response 'fill'", SWAns.isSameAs(new SingleWordAnswer("fill")));

		ans = question.convertResponseToAnswer("fill2");
		
		SWAns = (SingleWordAnswer) ans;
		
		assertTrue("Incorrect answer returned converting user response 'f'", SWAns.isSameAs(new SingleWordAnswer("fill2")));
		

		try {
			ans = question.convertResponseToAnswer("this is not a valid response");
		} catch (InvalidResponseException e) {
			// Correct exception thrown in response to invalid input
			return;
		}
		
		fail("Converting user response did not throw an exception when invalid input is received");
		
	}

}
