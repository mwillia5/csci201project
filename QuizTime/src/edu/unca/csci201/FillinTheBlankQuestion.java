package edu.unca.csci201;

public class FillinTheBlankQuestion implements Question {
	
	 private String question="";
	 private String theanswer="";
	
	public FillinTheBlankQuestion(String quest, String answ) {
		this.question=quest;
		this.theanswer=answ;
		
	}

	@Override
	public String getTextPrompt() {
		return this.question;
	}

	@Override
	public Answer[] getPossibleAnswers() throws NoAnswersException {
		Answer[] a=null;
		if(a==null)throw new NoAnswersException();
		return a;
	}

	@Override
	public Answer getCorrectAnswer() throws NoCorrectAnswerException {
		SingleWordAnswer ans=new SingleWordAnswer(this.theanswer);
		
		return ans;
	}

	@Override
	public Answer convertResponseToAnswer(String userResponse) throws InvalidResponseException {
		SingleWordAnswer userans=new SingleWordAnswer(userResponse);
		if(userResponse.contains(" ")) {
			//System.out.println("INVALID RESPONSE");
			throw new InvalidResponseException();
		}
		return userans;
	}

}
