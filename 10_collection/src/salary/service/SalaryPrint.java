package salary.service;

import java.util.ArrayList;

import salary.bean.SalaryDTO;

public class SalaryPrint implements Salary  {

	@Override
	public void excute(ArrayList<SalaryDTO> list) {
		
		System.out.println();
		
		System.out.println("사원번호\t이름\t직급\t기본급\t수당\t세율\t월급");
		for (int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i).toString());
			
			
		}
		
	}

}
