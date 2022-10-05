package exception;

import java.util.Scanner;

public class ExceptionMain2 {
	private int x,y;
	private int z =1;
	
	public void input() {
		Scanner s = new Scanner(System.in);
		
		System.out.print("x 입력 : ");
		x = s.nextInt();
		System.out.print("y 입력 : ");
		y = s.nextInt();
		
	}
	public void output() {
		
		if(y >= 0) {
			for (int i = 1; i<=y; i++) {
				z *= x;
				
			}
		
			System.out.println("------------------");
			System.out.println(x+"의 "+y+"승은 "+z);
			
		}else {
			//System.out.println("y는 0보다 크거나 같아야 한다.");
			
			//개발자가 강제로 Exception 발생
			try {
				throw new Exception("y는 0보다 크거나 같아야 한다.");
			}catch(Exception e) {
				e.printStackTrace();
			}
		}
	}
	

	public static void main(String[] args) {
		
		ExceptionMain2 exceptionMain2 = new ExceptionMain2();
		exceptionMain2.input();
		exceptionMain2.output();
	}

}
