package ch06.getter_setter;

public class Car {
	
	private int speed;
	private boolean stop;
	
	public int getSpeed() {
		return speed;
	}
	
	public void setSpeed(int speed) {// 속도를 외부에서 접근할때 음수가 될수 없도록 막는다	
		if(speed<0) {
			speed = 0;
		}
		else {
			this.speed = speed;
		}
	}
	
	public boolean isStop(){
		return stop;
	}
	
	public void setStop(boolean stop) {
		if(!stop) {
			speed = 0;
		}
	}
}

