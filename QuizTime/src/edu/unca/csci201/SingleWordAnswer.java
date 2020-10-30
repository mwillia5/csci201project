package edu.unca.csci201;

public class SingleWordAnswer implements Answer {
	String Answ;
	
	public SingleWordAnswer(String answ) {
		this.Answ=answ;
	}
	
	@Override
	public String toString() {
		return Answ;
	}

	@Override
	public boolean isSameAs(Answer other) {
		if(this.Answ.equalsIgnoreCase(other.toString()))return true;
		else return false;
	}

}
