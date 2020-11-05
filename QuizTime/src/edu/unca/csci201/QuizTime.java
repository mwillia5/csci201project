package edu.unca.csci201;

public class QuizTime {

	public static void main(String[] args) {
		
		Quiz q=new Quiz();
		
		MultipleChoiceQuestion test1=new MultipleChoiceQuestion("This is a test question? (ans='A')","A","A","B",
				"C","D");
		FillinTheBlankQuestion test2=new FillinTheBlankQuestion("This is another test question? (Answer is 'hello')","hello");
		
		try {
			q.addQuestion(test1);
			q.addQuestion(test2);
		} catch (QuizFullException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		//q.printQuiz();
		
		
		
		q.giveQuiz();
	}

}
