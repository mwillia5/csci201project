package edu.unca.csci201;

public class TrueFalseAnswer implements Answer {
	
	Boolean answer;
	
	public TrueFalseAnswer(boolean b) {
		this.answer=b;
	}

	public String toString() {
		String thestring="";
		if(this.answer==false)thestring="false";
		if(this.answer==true)thestring="true";
		
		return thestring;
	}
	
	@Override
	public boolean isSameAs(Answer other) {
		if(other.toString().equalsIgnoreCase(this.toString()))return true;
		
		else return false;
	}

}
