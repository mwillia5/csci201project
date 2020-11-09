package edu.unca.csci201;

import java.util.Scanner;

public class Quiz {
	private Question[] thequiz=new Question[25];
	private double correct;
	private double wrong;
	private int counter=0;
	
	public void addQuestion(Question Q) throws QuizFullException {
		if (this.counter==25)throw new QuizFullException();
		this.thequiz[counter]=Q;
		this.counter++;		
		
	}
	
	public double giveQuiz() {
		int EXCEPTIONS=0;
		Scanner scan=new Scanner(System.in);
		String response="";
		for(Question a:thequiz) {
			if(a==null) {
				//System.out.println("END OF Q ARRAY");
				break;
			}
			System.out.println(a.getTextPrompt());;
			try {
				for(Answer answerarray: a.getPossibleAnswers()) {
					System.out.println(answerarray.toString());
				}
			} catch (NoAnswersException e1) {
				// TODO Auto-generated catch block
				//e1.printStackTrace();
			}
			response=scan.nextLine();
			try {
				try {
					Boolean b=a.getCorrectAnswer().isSameAs(a.convertResponseToAnswer(response));
					if (b) {correct++;}
					if (!b) {wrong++;}
				} catch (NoCorrectAnswerException e) {
					// TODO Auto-generated catch block
					EXCEPTIONS++;
					//e.printStackTrace();
				}
			} catch (InvalidResponseException e) {
				// TODO Auto-generated catch block
				EXCEPTIONS++;
				System.out.println("Invalid answer format");
				//e.printStackTrace();
			}
		
		}
		System.out.println("Quiz questions:"+this.counter+", correct:"+this.correct+", wrong:"+this.wrong);
		scan.close();
		double score=this.correct/this.counter*100;
		if(this.counter==0)return 0;
		return score;
	}
	
	
	public void printQuiz() {
		for(Question a: thequiz) {
			if(a==null) {
				System.out.println("END OF Q ARRAY");
				break;
			}
			System.out.println(a.getTextPrompt());

		}
	}
	
}
