package edu.unca.csci201;

public class MultipleChoiceAnswer implements Answer {

	private String ans="";
	

	public MultipleChoiceAnswer(String string) {
		this.ans=string;
	}

	public String toString() {

		return this.ans;
	}
	
	@Override
	public boolean isSameAs(Answer other) {

	}

}
