package nested;

public class Outer {
	private String name;
	
	
	public void output() {
		Inner in = new Inner();
		System.out.println("이름 = " + this.name + "\t나이 = " + in.age);
	}
	
	class Inner{
		private int age;
		
		public void disp() {
			System.out.println("이름 = " + Outer.this.name + "\t나이 = " + this.age);
		}
		
	}

	public static void main(String[] args) {
		Outer ou = new Outer();
		ou.name = "홍길동";
		ou.output();
		System.out.println();
		
		Outer.Inner in2 = ou.new Inner();
		in2.age = 25;
		
		in2.disp();
		
		Outer.Inner in3 = ou.new Inner();
		in3.age = 30;
		ou.name = "코난";
		//in3.name = "코난" -> error 클래스 안에서만 적용 가능
		in3.disp();
		System.out.println();
		
		Outer.Inner in4 = new Outer().new Inner();
		in4.age = 40;
		in4.disp();
		
		
	}

}
