package edu.unca.csci201;

public interface Question {

	/**
	 * Returns the text of the question for display to the user
	 */
	public String getTextPrompt();
	
	/**
	 * Returns an array of all the possible answers a user may resond
	 * to this question with.  If this question does provide a list
	 * of possible answers, this method throws an exception
	 */
	public Answer [] getPossibleAnswers() throws NoAnswersException;
	
	/**
	 * Returns the true answer to this question.  If this question
	 * does not have a single true answer, this method throws an
	 * exception
	 */
	public Answer getCorrectAnswer() throws NoCorrectAnswerException;
	
	/**
	 * Given a string entered by the user, this method returns
	 * an appropriate answer object that represents the user's
	 * response.  If no such answer object can be created due to
	 * the user's response being invalid, this method throws an
	 * exception
	 */
	public Answer convertResponseToAnswer(String userResponse) throws InvalidResponseException;
	
}
