package edu.unca.csci201;

public class TrueFalseQuestion implements Question {

	private String question="";
	private Boolean answer;
	
	public TrueFalseQuestion(String string, boolean b) {
		this.question=string;
		this.answer=b;
	}

	@Override
	public String getTextPrompt() {
		
		return this.question;
	}

	@Override
	public Answer[] getPossibleAnswers() throws NoAnswersException {
		Answer[] a=null;//= {new TrueFalseAnswer(true), new TrueFalseAnswer(false)};
		if(a==null)throw new NoAnswersException();
		return a;
	}

	@Override
	public Answer getCorrectAnswer() throws NoCorrectAnswerException {
		Answer a=new TrueFalseAnswer(this.answer);
		return a;
	}

	@Override
	public Answer convertResponseToAnswer(String userResponse) throws InvalidResponseException {
		String converted=userResponse.toUpperCase();
		Boolean answ = null;
		if(converted.equalsIgnoreCase("t")||converted.equalsIgnoreCase("true"))answ=true;
		else if(converted.equalsIgnoreCase("f")||converted.equalsIgnoreCase("false"))answ=false;
		else {throw new InvalidResponseException();}
		Answer b=new TrueFalseAnswer(answ);
		return b;
	}

}
