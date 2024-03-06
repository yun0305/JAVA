package ch11.exception.exception_code.exception_kind;

public class ExceptionHandlingExample01 {

	/*
	 * try 블록에는 다양한 종류의 예외가 발생할수 있다. 이 경우, 다중 catch를 사용하면 발생하는 예외에 따라
	 * 예외 처리 코드를 다르게 작성할 수 있다. catch 블록의 예외 클래스는 try블록에서 발생된 예외의 종류를 말하는데,
	 * 해당 타입의 예외가 발생하면 catch 블록이 선택되어 실행된다.
	 * 
	 * catch블록이 여러개라 할지라도 catch블록은 단 하나만 실행된다. 그 이유는 try블록에서 동시 다발적으로 예외가 발생하지
	 * 않으며, 하나의 예외가 발생하면 즉시 실행을 멈추고 해당 catch 블록으로 이동하기 때문이다.
	 * 
	 * 이번 예제는 배열의 인덱스가 초과되었을 경우 발생하는 ArrayIndexOutOfBoundsException과 숫자타입이 아닐 때 발생하는
	 * NumberFormatException을 각각 다르게 예외처리 한다.
	 */
	
	public static void main(String[] args) {
		
		String[] array = new String[]{"100","1oo"};
		
		
		for(int i=0;i<=array.length;i++) {
			
			try{
				int value = Integer.parseInt(array[i]);
				System.out.println("["+i+"] : "+value);
				
			}catch(ArrayIndexOutOfBoundsException e) {
				System.out.println("배열 인덱스가 초과 되었습니다. "+e.getMessage());
			
			}catch(NumberFormatException e) {
				System.out.println("숫자로 변환할수 없습니다. "+e.getMessage());
			}
			
		}
		
		System.out.println("시스템 종료");
		
	}

}
