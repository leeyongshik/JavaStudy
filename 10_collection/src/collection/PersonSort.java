package collection;

import java.util.ArrayList;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;

public class PersonSort {

	public static void main(String[] args) {
	
		String[] ar = {"orange", "apple", "banana", "pear", "peach", "applemango"};
		
		System.out.print("정렬 전 = ");
		for (String data : ar) {
			System.out.print(data+ " ");
		}
		System.out.println();
		
		Arrays.sort(ar);
		
		System.out.print("정렬 후 = ");
		for (String data : ar) {
			System.out.print(data+ " ");
		}
		System.out.println();
		
		PersonDTO aa = new PersonDTO("홍길동",25);
		PersonDTO bb = new PersonDTO("프로도",40);
		PersonDTO cc = new PersonDTO("죠르디",30);
		
		ArrayList<PersonDTO> list = new ArrayList<PersonDTO>();
		
		list.add(aa);
		list.add(bb);
		list.add(cc);
		
		System.out.println();
		System.out.println("정렬 전 = ");
		for (PersonDTO personDTO : list) {
			System.out.println("이름 = " + personDTO.getName()+ " 나이 = " + personDTO.getAge());
		}
		System.out.println();
		System.out.println("나이로 오름차순");
		Collections.sort(list);
		System.out.println("정렬 후 = ");
		for (PersonDTO personDTO : list) {
			System.out.println("이름 = " + personDTO.getName()+ " 나이 = " + personDTO.getAge());
		}
		
		System.out.println();
		System.out.println("이름으로 내림차순");
		
		
		// 이름으로 정렬
		Comparator<PersonDTO> com = new Comparator<PersonDTO>() { // 익명 Inner Class
			@Override
			public int compare(PersonDTO p1, PersonDTO p2) {
				return p1.getName().compareTo(p2.getName()) * -1;
			}
		}; 
		Collections.sort(list, com);
		
		
		
		System.out.println("정렬 후 = ");
		for (PersonDTO personDTO : list) {
			System.out.println("이름 = " + personDTO.getName()+ " 나이 = " + personDTO.getAge());
		}
		
		
	}

}
