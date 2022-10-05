package salary.service;

import java.util.ArrayList;
import java.util.Scanner;

import salary.bean.SalaryDTO;

public class SalaryService {
	private ArrayList<SalaryDTO> list = new ArrayList<SalaryDTO>();
	
	public void menu() {
		Scanner s = new Scanner(System.in);
		Salary salary = null;
		SalaryDTO salaryDTO = new SalaryDTO();
		list.add(new SalaryDTO(1, "홍길동", "차장", 2000000, 100000));
		list.add(new SalaryDTO(2, "강호동", "차장", 5000000, 400000));
		list.add(new SalaryDTO(3, "유재석", "차장", 1000000, 300000));
		list.add(new SalaryDTO(4, "노홍철", "차장", 4000000, 200000));
		list.add(new SalaryDTO(5, "강현수", "차장", 3000000, 700000));
		
		while(true) {
			System.out.println();
			System.out.println("***************");
			System.out.println("   1. 등록 ");
			System.out.println("   2. 출력 ");
			System.out.println("   3. 수정 ");
			System.out.println("   4. 검색 ");
			System.out.println("   5. 삭제 ");
			System.out.println("   6. 정렬 ");
			System.out.println("   7. 종료 ");
			System.out.println("***************");
			System.out.print("  번호 : " );
			int num = s.nextInt();
			
			if(num == 7) {
				System.out.println("프로그램 종료 합니다.");
				break;
			}
			
			if(num == 1) {
				salary = new SalaryWrite();
			}
			
			else if(num == 2) {
				salary = new SalaryPrint();
			}
			
			else if(num == 3) {
				salary = new SalaryUpdate();
			}
			
			else if(num == 4) {
				salary = new SalarySearch();
			}
			
			else if(num == 5) {
				salary = new SalaryDelete();
			}
			
			else if(num == 6) {
				salary = new SalarySort();
			}
			
			else System.out.println("1 ~ 7번 까지 입력 해주세요.");
			
			salary.excute(list);
		}
	}
	

}
