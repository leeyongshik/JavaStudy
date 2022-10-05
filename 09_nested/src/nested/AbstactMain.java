package nested;

public class AbstactMain{
	

	public static void main(String[] args) {
		AbstactTest at = new AbstactTest() { // 익명 Inner Class
			@Override
			public void setName(String name) { 
				this.name = name;
			}
		};
		
		InterA ia = new InterA() {
			public void aa() {}
			public void bb() {}
		};
		
		AbstactExam ae = new AbstactExam() {
			//추상메소드가 없기 때문에 원하는 메소드를 골라서 Override
		};

	}


}
