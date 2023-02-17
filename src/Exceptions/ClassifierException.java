package Exceptions;

public class ClassifierException extends Exception{

	private int classifier;
	
	public ClassifierException(int classifier) {
		super("ClassifierException");
		this.classifier = classifier;
	}
	
	public String toString() {
		return String.format("%s\nNumber most be greater than 0: %d", getMessage(), classifier);
	}
}
