package edu.unca.csci201;

public class TrueFalseQuestion implements Question {

	String question="";
	Boolean answer;
	
	public TrueFalseQuestion(String string, boolean b) {
		this.question=string;
		this.answer=b;
	}

	@Override
	public String getTextPrompt() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Answer[] getPossibleAnswers() throws NoAnswersException {
			// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Answer getCorrectAnswer() throws NoCorrectAnswerException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Answer convertResponseToAnswer(String userResponse) throws InvalidResponseException {
		// TODO Auto-generated method stub
		return null;
	}

}
