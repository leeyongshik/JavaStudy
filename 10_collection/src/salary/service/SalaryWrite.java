package salary.service;

import java.util.ArrayList;
import java.util.Scanner;

import salary.bean.SalaryDTO;

public class SalaryWrite implements Salary {

	@Override
	public void excute(ArrayList<SalaryDTO> list) {
		Scanner s = new Scanner(System.in);
		SalaryDTO salaryDTO = new SalaryDTO();
		
		System.out.println();
		System.out.print("사원번호 입력 : ");
		int num = s.nextInt();
		System.out.print("이름 입력 : ");
		String name = s.next();
		System.out.print("직급 입력 : ");
		String rank = s.next();
		System.out.print("기본급 입력 : ");
		int basic = s.nextInt();
		System.out.print("수당 입력 : ");
		int extra = s.nextInt();
		
		salaryDTO.setNum(num);
		salaryDTO.setName(name);
		salaryDTO.setRank(rank);
		salaryDTO.setBasic(basic);
		salaryDTO.setExtra(extra);
		salaryDTO.calc();
		
		list.add(salaryDTO);
		
	}

}
