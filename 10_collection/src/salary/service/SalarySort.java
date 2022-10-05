package salary.service;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

import salary.bean.SalaryDTO;

public class SalarySort implements Salary  {

	@Override
	public void excute(ArrayList<SalaryDTO> list) {
		Scanner s = new Scanner(System.in);
		
		
		while(true) {
		System.out.println();
		System.out.println("1. 이름으로 오름차순");
		System.out.println("2. 월급으로 내림차순");
		System.out.println("3. 이전 메뉴 ");
		System.out.print("   번호 : ");
		int a = s.nextInt();
		
		if(a==3) break;
		if(a==1) {
			Collections.sort(list);
			System.out.println();
			System.out.println("사원번호\t이름\t직급\t기본급\t수당\t세율\t월급");
			for(SalaryDTO salaryDTO : list) {
				System.out.println(salaryDTO);
			}
		}
		else if(a==2) {
			Comparator<SalaryDTO> com = new Comparator<SalaryDTO>() {
				@Override
				public int compare(SalaryDTO o1, SalaryDTO o2) {
					return (o1.getSalary() - o2.getSalary()) * -1;
				}
			};
			Collections.sort(list,com);
			System.out.println();
			System.out.println("사원번호\t이름\t직급\t기본급\t수당\t세율\t월급");
			for(SalaryDTO salaryDTO : list) {
				System.out.println(salaryDTO);
			}
			
		}
		
		
		
		
		}
		
		
		
		
		
	}

}
