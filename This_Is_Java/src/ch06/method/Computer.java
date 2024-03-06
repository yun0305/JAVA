package ch06.method;

public class Computer {
	//가변 메개변수
		int sum(int ... values) {
		int sum = 0;	
		for(int i=0;i<values.length;i++) {
			sum += values[i];
		}
		return sum;
		}
}
