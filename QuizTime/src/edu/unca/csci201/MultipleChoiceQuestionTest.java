package edu.unca.csci201;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class MultipleChoiceQuestionTest {

	MultipleChoiceQuestion question;
	
	@Before
	public void setUp() throws Exception {
		question = new MultipleChoiceQuestion("The Answer to this question is 'A'", "A",
 "A. bongos", "B. cats", "C. elephants", "D. a hat");
		
	}

	@Test
	public void testGetTextPrompt() {

		assertTrue("Text prompt not returned correctly", question.getTextPrompt().equals("The Answer to this question is 'A'"));
	}

	@Test
	public void testGetPossibleAnswers() {
		try {
			question.getPossibleAnswers();
			return;
		} catch (NoAnswersException e) {
			// Should not throw exception for multiple choice
			System.out.println("Answer[] failed for possible answers");
			//return;
		}
		
		fail("Answer array was not returned for the question");
	}

	@Test
	public void testGetCorrectAnswer() throws NoCorrectAnswerException {
		Answer ans = question.getCorrectAnswer();

		MultipleChoiceAnswer mcAns = (MultipleChoiceAnswer) ans;

		assertTrue("Incorrect answer returned for the multipleChoicequestion", mcAns.isSameAs(new MultipleChoiceAnswer("A")));
		
	}

	@Test
	public void testConvertResponseToAnswer() throws InvalidResponseException {
		Answer ans = question.convertResponseToAnswer("a");
		
		MultipleChoiceAnswer mcAns = (MultipleChoiceAnswer) ans;
		
		assertTrue("Incorrect answer returned converting user response 'a'", mcAns.isSameAs(new MultipleChoiceAnswer("A")));

		ans = question.convertResponseToAnswer("b");
		
		mcAns = (MultipleChoiceAnswer) ans;
		
		assertTrue("Incorrect answer returned converting user response 'b'", mcAns.isSameAs(new MultipleChoiceAnswer("B")));
		

		try {
			ans = question.convertResponseToAnswer("this is not a valid response");
		} catch (InvalidResponseException e) {
			System.out.println("invalid response caught");
			// Correct exception thrown in response to invalid input
			return;
		}
		
		fail("Converting user response did not throw an exception when invalid input is received");
		
	}


}
