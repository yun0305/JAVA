package ch06.method;

public class Car {
		//return
		//필드선언
		int gas;
		
		void setGas(int gas) {
			this.gas = gas;
		}
		
		boolean isLeftGas() {//가스가 있는지 없는지 확인하는 메소드
			if(gas == 0) {
			System.out.println("gas가 없습니다");	
			return false;
			}
			else {
			System.out.println("gas가 있습니다");
			return true;	
			}

		}
		void run(){
			while(true) {
			if(gas > 0) {
				System.out.println("달립니다. (남은 잔량은 gas"+gas+")");
				gas-=1;
			}
			else {
				System.out.println("멈춥니다. (남은 잔량은 gas"+gas+")");
				return;// break; 를 사용해도 되지만 return을 사용한 이유는 return을 사용하면 메소드의 사용을 완전 
				//종료해 버린다 break;는 그뒤에 실행문이 있으면 그 실행문을 작동시킨다
			}
		}
	}
}
