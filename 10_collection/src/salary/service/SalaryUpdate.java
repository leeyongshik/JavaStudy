package salary.service;

import java.util.ArrayList;
import java.util.Scanner;

import salary.bean.SalaryDTO;

public class SalaryUpdate implements Salary  {

	@Override
	public void excute(ArrayList<SalaryDTO> list) {
		Scanner s = new Scanner(System.in);
		int sw = 0;
		
		System.out.println();
		System.out.print("변경할 사원번호 입력 : ");
		int num = s.nextInt();
		
		for(SalaryDTO salaryDTO : list) {
			if(salaryDTO.getNum() == num) {
				
				sw = 1;
				
				System.out.println();
				System.out.println("사원번호\t이름\t직급\t기본급\t수당\t세율\t월급");
				System.out.println(salaryDTO);
				System.out.println();
				
				
				System.out.print("수정 할 직급 입력 : ");
				String rank = s.next();
				System.out.print("수정 할 기본급 입력 : ");
				int basic = s.nextInt();
				System.out.print("수정 할 수당 입력 : ");
				int extra = s.nextInt();
				
				salaryDTO.setRank(rank);
				salaryDTO.setBasic(basic);
				salaryDTO.setExtra(extra);
				
				
				salaryDTO.calc();
				
				System.out.println();
				System.out.println("수정하였습니다.");
				break;
				
				
				
			}
			if(sw == 0)System.out.println("찾는 사원번호가 없습니다.");
			
		}
		
		
		
		
	}

}
