package ch11.exception.exception_code.exception_kind;

public class ExceptionHandlingExample02 {

	/*
	 * 처리 해야할 예외 클래스들이 상속 관계에 있을 때는 하위 클래스 catch블록을 먼저 작성하고 상위 클래스 catch블록을
	 * 나중에 작성해야 한다. 예외가 발생하면 catch블록은 위에서 부터 차례대로 검사 대상이되는데. 하위 예외도 상위 클래스
	 * 타입이므로 상위 클래스 catch블록이 먼저 검사 대상이 되면 안된다.
	 */
	
	public static void main(String[] args) {
		
		String[] array = new String[]{"100","1oo"};
		
		for(int i=0;i<=array.length;i++) {
			
			try{
				int value = Integer.parseInt(array[i]);
				System.out.println("["+i+"] : "+value);
				
			}catch(NumberFormatException e) {
				System.out.println("숫자로 변환할수 없습니다. "+e.getMessage());
				
			}catch(Exception e) {
				System.out.println("배열 인덱스가 초과 되었습니다. "+e.getMessage());
			}	
		}
		System.out.println("시스템 종료");	
	}
}
