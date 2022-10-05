package collection;

import java.util.Iterator;
import java.util.Vector;

public class VectorMain {

	public static void main(String[] args) {
		Vector<String> v = new Vector<String>();
		System.out.println("벡터 크기 = "+v.size()); // 0 
		System.out.println("벡터 용량 = "+v.capacity()); // 기본용량 10, 추가로는 10개씩 증가
		System.out.println();
		
		System.out.println("항목 추가");
		for (int i = 1; i<=10; i++) {
			v.add(i + "");
			System.out.print(v.get(i-1) + " "); // index는 0부터 시작
		}//for
		System.out.println();
		System.out.println("벡터 크기 = "+v.size()); // 10
		System.out.println("벡터 용량 = "+v.capacity()); // 기본용량 10, 추가로는 10개씩 증가
		System.out.println();
		
		v.addElement(5 + ""); // 중복 허용
		System.out.println("벡터 크기 = "+v.size()); // 10
		System.out.println("벡터 용량 = "+v.capacity()); // 기본용량 10, 추가로는 10개씩 증가
		System.out.println();
		
		for (int i = 0; i<v.size(); i++) System.out.print(v.get(i) + " "); 
		
		System.out.println();
		System.out.println("마지막 항목 삭제");
		//v.remove("5"); - 앞에 있는 "5"가 삭제
		v.remove(10); // 뒤에있는 10번에 있는 index가 삭제
		
		System.out.println();
		
		Iterator<String> it = v.iterator(); // 생성 - 메소드 이용 
		while(it.hasNext()) {
			System.out.print(it.next()+ " ");
		}
		System.out.println();
		
		
	}

}
