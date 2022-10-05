package collection;

class GenericTest<T>{
	private T a;
	
	public void setA(T a) {
		this.a = a;
	}
	
	public T getA() {
		return a;
	}
	
	
	
}

//---------------------

public class GenericMain {

	public static void main(String[] args) {
		GenericTest<String> genericTest = new GenericTest<String>();
		genericTest.setA("홍길동");
		System.out.println("이름 = " + genericTest.getA());
		
		GenericTest<Integer> genericTest2 = new GenericTest<Integer>();
		genericTest2.setA(10);
		System.out.println("숫자 = " + genericTest2.getA());
		
		
		
		
	}

}
