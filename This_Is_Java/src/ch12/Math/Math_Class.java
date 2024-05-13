package ch12.Math;

import java.util.Arrays;
import java.util.Random;

/*
 * <Math class>
 * Math 클래스는 수학 계산에 사용할 수 있는 메소드를 제공한다. Math 클래스가 제공하는 메소드는 모두
 * 정적 이므로 Math클래스로 바로 접근할 수 있다. 다음은 Math 클래스가 제공해주는 주요 메소드이다.
 * 
 * 구분 			코드								리턴값
 * 절대값			int v1 = Math.abs(-5);			v1 = 5
 * 
 * 올림값			double v3 = Math.ceil(5.3);		v3 = 6.0
 * 				double v4 = Math.ceil(-5.3)		v4 = -5.0
 * 
 * 버림값			double v5 = Math.floor(5.3);	v5 = 5.0
 * 				double v6 = Math.floor(-5.3);	v6 = -6.0
 * 
 * 최댓값			int v7 = Math.max(5,9);			v7 = 9
 * 
 * 최소값			int v9 = Math.min(5,9);			v9 = 5
 * 
 * 랜덤값 		double v11 = Math.random();		0.0<=v11<1.0
 * 
 * 반올림값 		long v14 = math.round(5.3);		v14=5
 * 
 * <random>
 * random() 메소드는 0.0 과 1.0 사이의 double 타입 난수를 리턴한다. 이 값을 이용해서 start 부터
 * 시작하는 n 개의 정수 (start<=..<(start+n)) 중 하나의 정수를 얻기 위한 공식을 만들면 다음과 같다
 * 예제와 공식 설명은 4.2절을 참고하자
 * 
 * int num = (int)(Math.random()*n)+start;
 * 
 * 난수를 얻는 또 다른 방법으로 java.util.Random 클래스를 이용할 수 있다. 이 클래스를 이용하면 boolean,
 * int, double 난수를 얻을 수 있다. 다음은 Random 객체를 생성하기 위한 생성자이다
 * 
 * 객체 생성				설명
 * Random()				현재 시간을 이용해서 종자값을 자동 설정한다.
 * Random(long seed)	주어진 종자값을 사용한다.
 * 
 * 종자값(seed)이란 난수를 만드는 알고리즘에 사용되는 값으로, 종자값이 같으면 같은 난수를 얻는다. 다음은
 * Random 클래스가 제공하는 메소드이다.
 * 
 * 리턴값			메소드			설명
 * boolean		nextBoolean()	boolean타입의 난수를 리턴
 * double		nextDouble()	double 타입의 난수를 리턴(0.0<=~<1.0);
 * int 			nextInt()		int 타입의 난수를 리턴(-21억	<=~ 21억 -1);
 * int 			nextInt(int n)	int 타입의 난수를 리턴 (0<=~<n);
 * 
 * 다음 에제는 로또의 6개 숫자를 얻는 방법을 보여준다 로또는 1~45 범위의 정수 숫자만 선택할 수 있으므로 
 * nextInt(45)+1 연산식을 사용했다.
 *  
 *  */

	/*
	 * 	Random 객체는 객체를 생성하고 객체로 접근해서 위의 메소드를 통해서 바로 랜덤값을 얻을수 있다.
	 */

public class Math_Class {
	public static void main(String[] args) {
		
		/*
		 * //선택번호 int[] selectNumber = new int[6];//선택번호 6개가 저장될 배열 생성 Random random =
		 * new Random(3);// 선택번호를 얻기 위한 Random 객체 생성 System.out.println("선택 번호");
		 * 
		 * for(int i=0;i<selectNumber.length;i++) { selectNumber[i] =
		 * random.nextInt(45)+1; System.out.print(selectNumber[i] + " "); }
		 * 
		 * System.out.println();
		 * 
		 * //당첨번호 int[] winningNumber = new int[6]; random = new Random(5);
		 * System.out.println("당첨번호");
		 * 
		 * for(int i=0;i<winningNumber.length;i++) { winningNumber[i] =
		 * random.nextInt(45)+1; System.out.print(winningNumber[i] + " "); }
		 * 
		 * System.out.println();
		 * 
		 * //당첨여부 Arrays.sort(selectNumber); Arrays.sort(winningNumber); boolean result
		 * = Arrays.equals(selectNumber, winningNumber); System.out.println("당첨여부");
		 * 
		 * if(result) { System.out.println("1등 당첨"); } else { System.out.println("꽝"); }
		 */
		
	
	
		
		
	
	}
}

/*
 * 선택번호 6개를 얻기위해 Random 객체의 종자값을 3주었고 당첨번호 6개를 얻기위해 Random 객체의 종자값으로
 * 5를 주었다 서로 다른 종자값을 주었기 때문에 선택 번호와 당첨번호는 다르게 나온다. 만약 정자값을 동일하게 주면
 * 동일한 난수를 얻기 때문에 선택번호와 당첨번호는 같게나온다.
 * 
 *
 */