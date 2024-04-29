package ch06.object;

public class Car{
		//필드
		String model= "그랜저";
		int speed = 100;
		boolean start = true;
		//생성자 선언
		
		//this 생성자  
		
		//생성자는 기본적으로 아무것도 없는 기본 생성자가 만들어진다
		
		/*
		 * this(); 여기서 this는 객체 자기 자신을 말한다 this(model,100,false); 여기서
		 * 파라미터를 3개를 넣어준 이유는 생성자중에 파라미터를 제일 많이 가진 생성자를 호출해서
		 * 코드의 길이를 줄여주기 위해서이다 파라미터가 필요 없을떈 0을 넣어주거나 초기값을 넣어주면 된다
		 * 아니면 두번쨰 생성자를 호출해줘도 상관은 없다. 생성자 오버로딩
		 * 
		 */
		
		Car(String model){
		this(model,0,false);//this(); 는 생성자 제일 처음에 위치해야 한다.
		
		}
		
		Car(String model,int speed){
		this(model,speed,false);	
		}
		
		Car(String model,int speed,boolean start){
			
			this.model = model;
			this.speed = speed;
			this.start = start;
			
		}
}
