package edu.unca.csci201.test;

import edu.unca.csci201.Answer;
import edu.unca.csci201.InvalidResponseException;
import edu.unca.csci201.NoAnswersException;
import edu.unca.csci201.Question;

public class DummyQuestion implements Question {

	private boolean testCorrect;
	private boolean throwFirstException;
	private boolean throwSecondException;
	private boolean throwThirdException;
	
	public DummyQuestion(boolean testCorrect, boolean throwFirstException, boolean throwSecondException, boolean throwThirdException) {
		this.testCorrect = testCorrect;
		this.throwFirstException = throwFirstException;
		this.throwSecondException = throwSecondException;
		this.throwThirdException = throwThirdException;
	}
	
	@Override
	public String getTextPrompt() {
		return "";
	}

	@Override
	public Answer[] getPossibleAnswers() throws NoAnswersException {
		if (throwFirstException)
			throw new NoAnswersException();
		
		return new Answer[] {new DummyAnswer(testCorrect)};
	}

	@Override
	public Answer getCorrectAnswer() throws NoCorrectAnswerException {
		if (throwSecondException)
			throw new NoCorrectAnswerException();
		
		return new DummyAnswer(testCorrect);
	}

	@Override
	public Answer convertResponseToAnswer(String userResponse) throws InvalidResponseException {
		if (throwThirdException)
			throw new InvalidResponseException();
		
		return new DummyAnswer(testCorrect);
	}

}
