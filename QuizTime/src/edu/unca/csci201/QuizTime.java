package edu.unca.csci201;

import java.text.DecimalFormat;
import java.util.Scanner;

public class QuizTime {

	public static void main(String[] args) {
		
		Quiz thequiz=new Quiz();
		
		/*MultipleChoiceQuestion test1=new MultipleChoiceQuestion("This is a test question? (ans='A')","A","A","B",
				"C","D");
		FillinTheBlankQuestion test2=new FillinTheBlankQuestion("This is another test question? (Answer is 'hello')",
				"hello");
		*/
		Question[] quiz1=new Question[25];
		quiz1[0]=new MultipleChoiceQuestion("What is Germany's 1# export for 2019?","B","A. Automobiles",
				"B. Machinery","C. Beer","D. Electronics");
		quiz1[1]=new FillinTheBlankQuestion("______ has the largest train station in Europe.", "Berlin");
		quiz1[2]=new TrueFalseQuestion("True or False: The first printed book was in German.", true);
		quiz1[3]=new MultipleChoiceQuestion("Most taxis in Germany are: ", "C","A. BMW","B. Audi","C. Mercedes",
				"D. Ford");
		quiz1[4]=new FillinTheBlankQuestion("_______ is the largest state in Germany","Bavaria");
		quiz1[5]=new TrueFalseQuestion("True or false: McDonald’s in Germany serves beer.", true);
		quiz1[6]=new MultipleChoiceQuestion("Which of the following cities was never the capital of Germany?" , "C",
				"A. Aachen", "B. Trier","C. Düsseldorf" ,"D. Cologne");
		quiz1[7]=new FillinTheBlankQuestion("Radioactive _____ (answer ends in an s) roam wild in Germany.", "boars");
		quiz1[8]=new TrueFalseQuestion("True or false: Prison escape is not punishable by law in Germany", true);
		quiz1[9]=new MultipleChoiceQuestion("What percentage of the Autobahn doesn't have a speed limit?",
				"D", "A. 50%", "B. 85%", "C. 25%", "D. 65%");
		quiz1[10]=new FillinTheBlankQuestion("In what month does Oktoberfest begin?", "September");
		quiz1[11]=new TrueFalseQuestion("True or false: Germany is the largest exporter of cars in the world.",
				false);
		
		
		try {
			for(Question q : quiz1) {
				if(q==null) {break;}
				thequiz.addQuestion(q);
			}
		} catch (QuizFullException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		//thequiz.printQuiz();
		System.out.println("Welcome to a small quiz on Germany!");
		System.out.println("For multiple choice questions only answer with the corresponding letter to the correct answer.");
		System.out.println("For all fill in the blank questions the answer is just 1 word.");
		System.out.println("for True/False questions answer with the word 'true' or 'false' ");
		System.out.println("-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-");
		double score=thequiz.giveQuiz();
		DecimalFormat df=new DecimalFormat("0.00");
		System.out.println("Your score was: "+df.format(score)+" out of 100");
		System.out.println("Enter 'OK' to continue to missed answers..");

		Scanner scan2=new Scanner(System.in);
		scan2.next();
		thequiz.printwrongs();
		scan2.close();
	}

}
