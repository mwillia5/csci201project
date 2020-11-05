package edu.unca.csci201;

public class MultipleChoiceQuestion implements Question {
	
	private String thequetsion="";
	private MultipleChoiceAnswer ans;
	private MultipleChoiceAnswer[] answers=new MultipleChoiceAnswer[4];
	private MultipleChoiceAnswer userAnswer;
	
	public MultipleChoiceQuestion(String question, String answ,String option1, 
			String option2, String option3, String option4) {
		this.thequetsion=question;
		this.ans=new MultipleChoiceAnswer(answ);
		MultipleChoiceAnswer option11=new MultipleChoiceAnswer(option1);
		MultipleChoiceAnswer option22=new MultipleChoiceAnswer(option2);
		MultipleChoiceAnswer option33=new MultipleChoiceAnswer(option3);
		MultipleChoiceAnswer option44=new MultipleChoiceAnswer(option4);

		this.answers[0]=option11;
		this.answers[1]=option22;
		this.answers[2]=option33;
		this.answers[3]=option44;
	}
	
	@Override
	public String getTextPrompt() {

		return this.thequetsion;
	}

	@Override
	public Answer[] getPossibleAnswers() throws NoAnswersException {
		if(answers==null)throw new NoAnswersException();
		return answers;
	}

	@Override
	public Answer getCorrectAnswer() throws NoCorrectAnswerException {
		return this.ans;
	}

	@Override
	public Answer convertResponseToAnswer(String userResponse) throws InvalidResponseException {
		userResponse=userResponse.trim();
		if(userResponse.equalsIgnoreCase("a")) userAnswer = new MultipleChoiceAnswer("A");
		if(userResponse.equalsIgnoreCase("b")) userAnswer= new MultipleChoiceAnswer("B");
		if(userResponse.equalsIgnoreCase("c")) userAnswer = new MultipleChoiceAnswer("C");
		if(userResponse.equalsIgnoreCase("d")) userAnswer = new MultipleChoiceAnswer("D");
		if(!userResponse.equalsIgnoreCase("a")&&!userResponse.equalsIgnoreCase("b")&&
				!userResponse.equalsIgnoreCase("c")&&!userResponse.equalsIgnoreCase("d")) throw new InvalidResponseException();
		return userAnswer;
	}

}
