package ch11.exception.exception_code.exception_kind;

import oracle.net.aso.e;

public class ExceptionHandlingExample03 {
	
	/*
	 * 두 개 이상의 예외를 하나의 catch 블록으로 동일하게 예외 처리하고 싶을 때가 있다. 이 경우에는 catch블록에
	 * 예외 클래스를 기호 | 로 연결하면된다
	 */
	 
	public static void main(String[] args) {
	
		String[] array = new String[]{"10","1oo",null,"2000"};
				
		for(int i=0;i<=array.length;i++) {
			
			try{
				System.out.println(i+"번째 인덱스 데이터 : "+array[i].length());
				int value = Integer.parseInt(array[i]);
				
			}catch(NumberFormatException e) {
				System.out.println("숫자로 변환할수 없는 항목이 있습니다. 확인해 주세요"+e.getMessage());
			}catch(NullPointerException | ArrayIndexOutOfBoundsException e){
				System.out.println("문자열이 null이거나 항목의 수가 부족합니다.");
			
			}catch(Exception e){// 예상 못하는 예외가 발생시
				System.out.println("예상치 못한 예외가 발생했습니다");
				
			}catch(Throwable e){			
			}
		}
		System.out.println("시스템 종료");
	}
}

