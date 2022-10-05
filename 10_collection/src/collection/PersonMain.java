package collection;

import java.util.ArrayList;
import java.util.List;

public class PersonMain {
	
	public void init(ArrayList<PersonDTO> list) {
		PersonDTO aa = new PersonDTO("홍길동",25);
		PersonDTO bb = new PersonDTO("프로도",40);
		PersonDTO cc = new PersonDTO("죠르디",30);
		
		list.add(aa);
		list.add(bb);
		list.add(cc);
		
		
	}

	public static void main(String[] args) {
		ArrayList<PersonDTO> list = new ArrayList<PersonDTO>();
		
		PersonMain personMain = new PersonMain();
		personMain.init(list);
		
		for(int i=0;i<list.size();i++) {
			System.out.println("이름 = " + list.get(i).getName()+ " 나이 = " + list.get(i).getAge());
			
		}
		
		
		
		
	}

}
