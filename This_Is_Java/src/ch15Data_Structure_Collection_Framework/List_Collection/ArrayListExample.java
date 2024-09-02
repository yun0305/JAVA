package ch15Data_Structure_Collection_Framework.List_Collection;

import java.util.ArrayList;

public class ArrayListExample {
	
	public static void main(String[] args) {
		
		//ArrayList 컬랙션 생성
		ArrayList<Border> list = new ArrayList<Border>();
		
		
		//ArrayList에 객체 추가
		list.add(new Border("제목1","내용1","글쓴이1"));
		list.add(new Border("제목2","내용2","글쓴이2"));
		list.add(new Border("제목3","내용3","글쓴이3"));
		list.add(new Border("제목4","내용4","글쓴이4"));
		
		//저장된 총 객체 수 얻기
		
		System.out.println("저장된 객체의 수 " + list.size());
		
		//특정 인덱스 객체 가져오기
		Border border = list.get(0);
		System.out.println("0번 인덱스의 글쓰니 " + border.getSubject());
		
		//모든 객체를 하나씩 가져오기 
		for(int i=0;i<list.size();i++) {
			
			Border b = list.get(i);
			
			System.out.println("제목 :" + b.getSubject() + ", 내용 :" + b.getContent()+" "
					+ "글쓴이 : " + b.getWriter());
			
			
		}
		System.out.println();
		//객체 삭제
		list.remove(1);
		list.remove(1);
		
		for(Border a : list) {
			
			System.out.println("제목 :" + a.getSubject() + ", 내용 :" + a.getContent()+" "
					+ "글쓴이 : " + a.getWriter());
		}
	
	}
	
}
