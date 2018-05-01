package edu.handong.csee.java.lab13.prob2;

public class Science extends Book{
	private String publisher;
	
	public Science(String name, String publisher) {
		super(name);
		this.publisher = publisher;
	}
	
	public String useString() {
		return super.useString() + "\n\tPublisher : " + publisher;
	}
	
	public void show() {
		System.out.println("<<<Science>>>\n\t" + this.useString());
	}
}
