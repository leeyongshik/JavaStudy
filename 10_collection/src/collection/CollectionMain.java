package collection;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class CollectionMain {

	public static void main(String[] args) {
		
		Collection<String> coll = new ArrayList<String>(); // 부모 = 자식
		
		coll.add("호랑이");
		coll.add("사자");
		coll.add("호랑이"); // 중복 허용, 순서
		//coll.add(25);
		//coll.add(43.8);
		coll.add("기린");
		coll.add("코끼리");
		
		
		//coll.get(0); - error 자식 클래스에만 있기때문에 사용 불가
		Iterator<String> it = coll.iterator(); // 생성
		
		while(it.hasNext()) {
			System.out.println(it.next());
		}//while
		 
		
		//1. it.hasNext() - 현재 위치에 항목이 있으면 참, 없으면 거짓
		//2. it.next() - 현재 위치에 항목을 꺼내서 저장하고 다음 위치로 이동
		
		
	}

}
