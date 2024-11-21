package ch11.exception.AutoCloseable;

public class TryWithResourceExample {

	public static void main(String[] args) throws Exception {
		
		// 1.예외가 발생하던 안하던 MyResource의 close 메소드가 실행된다.
		// 2.블록 단위라서 res 인스턴스를 try외부에서 쓰려면 MyResource 선언을 밖으로 빼줘야 한다.
		
		try(MyResource res = new  MyResource("A"); ){
			String data = res.read1();
			int value = Integer.parseInt(data);	
		}catch(Exception e) {
			System.out.println("예외처리"+e.getMessage());			
		}
		System.out.println();
		
		
		try(MyResource res = new  MyResource("A"); ){
			String data = res.read2();
			int value = Integer.parseInt(data);	
		}catch(Exception e) {
			System.out.println("예외처리"+e.getMessage());			
		}
		System.out.println();
	
		
		MyResource res1 = new  MyResource("A");
		MyResource res2 = new  MyResource("A");
		
		try(res1;res2){
			String data1 = res1.read1();
			String data2 = res1.read2();
			
		}catch(Exception e) {
			System.out.println("예외처리"+e.getMessage());			
		}
		System.out.println();
	}

}
