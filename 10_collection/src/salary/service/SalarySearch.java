package salary.service;

import java.util.ArrayList;
import java.util.Scanner;

import salary.bean.SalaryDTO;

public class SalarySearch implements Salary  {

	@Override
	public void excute(ArrayList<SalaryDTO> list) {
		Scanner s = new Scanner(System.in);
		
		int sw = 0;
		
		System.out.println();
		System.out.print("검색할 이름을 입력 : ");
		String name = s.next();
		
		for(SalaryDTO salaryDTO : list) {
			if(salaryDTO.getName().equals(name)) {
				
				sw = 1;
				
				System.out.println();
				System.out.println("사원번호\t이름\t직급\t기본급\t수당\t세율\t월급");
				System.out.println(salaryDTO);
				System.out.println();
				break;
			}
			if(sw == 0)System.out.println("찾는 사원이름이 없습니다.");
		}
	}

}
