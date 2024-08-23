package ch05.array;

public class sec17 {

	public static void main(String[] args) {
		/*//main(String[] args)
		//외부의 데이터를 가져올때 쓴다
		if(args.length!=2) {
			System.out.println("입력값은 2개여야 합니다");
			System.exit(0);
		}
		int num1 = Integer.parseInt(args[0]);
		int num2 = Integer.parseInt(args[1]);
		int result = num1+num2;
		System.out.println("num1과 num2의 합은 = "+result);
		*/
		if(args.length != 2) { 
			System.out.println("프로그램 입력값이 부족합니다(오직 2개)");
			System.exit(0);
		}
		int sum1 = Integer.parseInt(args[0]);
		int sum2 = Integer.parseInt(args[1]);
		int result = sum1+sum2;
		System.out.println("num1과 num2의 합은 = "+result);

	}

}
