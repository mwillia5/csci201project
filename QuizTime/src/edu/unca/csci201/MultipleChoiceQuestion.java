package edu.unca.csci201;

public class MultipleChoiceQuestion implements Question {
	
	private String thequetsion="";
	private String ans;
	private MultipleChoiceAnswer[] answers=new MultipleChoiceAnswer[4];
	
	public MultipleChoiceQuestion(String question, String ans) {
		this.thequetsion=question;
		this.ans=ans;
	}
	
	@Override
	public String getTextPrompt() {

		return this.thequetsion;
	}

	@Override
	public Answer[] getPossibleAnswers() throws NoAnswersException {
		answers[0]=new MultipleChoiceAnswer("A");
		answers[1]=new MultipleChoiceAnswer("B");
		answers[2]=new MultipleChoiceAnswer("C");
		answers[3]=new MultipleChoiceAnswer("D");
		
		return answers;
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
