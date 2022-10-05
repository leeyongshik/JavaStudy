package exception;

import java.util.Scanner;

public class ExceptionMain {

	public static void main(String[] args) {
		if(args.length > 0) System.out.println("args[0] = " + args[0]);
		
		
		try {
			Scanner s = new Scanner(System.in);
			
			System.out.print("숫자 입력 : ");
			int num2 = s.nextInt();
			int num = Integer.parseInt(args[0]);
			
			System.out.println(num + "/" + num2 + " = " + (num/num2));
		}catch(NumberFormatException e) {
			System.out.println("반드시 숫자만 가능합니다.");
			e.printStackTrace();
		}catch(ArithmeticException e) {
			System.out.println("0으로 나눌 수 없습니다.");
			e.printStackTrace();
		}finally {
			System.out.println("error 있건 없건 무조건 실행!!");
		}
	}

}
