package salary.service;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

import salary.bean.SalaryDTO;

public class SalaryDelete implements Salary  {

	@Override
	public void excute(ArrayList<SalaryDTO> list) {
		Scanner s = new Scanner(System.in);
		boolean a = false;
		
		System.out.println();
		System.out.print("삭제 할 사원번호 입력 : ");
		int num = s.nextInt();
		
		for(int i=0;i<list.size();i++) {
			if(list.get(i).getNum() == num) {
				a=true;
			}
		}
		
		Iterator<SalaryDTO> it = list.iterator();
		while(it.hasNext()) {
			if(it.next().getNum() == num) {
				it.remove();
			}
		}
		
		if( a == false) System.out.println("삭제할 이름이 없습니다.");
		else System.out.println(num+"의 사원 모든 데이터를 삭제했습니다.");
		
		
		
	}

}
