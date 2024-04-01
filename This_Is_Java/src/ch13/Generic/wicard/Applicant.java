package ch13.Generic.wicard;

public class Applicant<T> {
	
	public T kind;
	
	public Applicant(T kind) {
		this.kind = kind;
	}
	
}
