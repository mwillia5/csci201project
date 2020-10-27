package edu.unca.csci201.test;

import edu.unca.csci201.Answer;

public class DummyAnswer implements Answer {

	private boolean issameas;
	
	public DummyAnswer(boolean issameas) {
		this.issameas = issameas;
	}
	
	@Override
	public boolean isSameAs(Answer other) {
		return issameas;
	}

}
