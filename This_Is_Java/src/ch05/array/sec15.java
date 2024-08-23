package ch05.array;

public class sec15 {

	public static void main(String[] args) {
		//배열복사
		//for문으로 배얄복사
		int[] oldArray = new int[] {1,2,3}; 
		int[] newArray = new int[5];
		
		for(int i=0;i<oldArray.length;i++) {
			newArray[i] = oldArray[i];
		}
		
		for(int i=0; i<newArray.length;i++) {
			System.out.println(newArray[i]);
		}

		//System.arraycopy 로 복사하기
		//메소드설명
		//System.arraycopy(복사할대상,복사할대상을 어디부터 복사할지,복사한걸 담을 그릇,새 그릇의 어디부터 넣을지, 복사항목의 수);
		//길이가 3인 배열
		String[] oldarray = new String[] {"java","array","copy"};
		//길이가 5인 배열
		String[] newarray = new String[5];
		//배열 항목 복사
		System.arraycopy(oldarray, 0, newarray, 1, oldarray.length);
		//출력
		for(int i=0;i<newarray.length;i++) {
			System.out.println(newarray[i]);
		}	
	}

}
