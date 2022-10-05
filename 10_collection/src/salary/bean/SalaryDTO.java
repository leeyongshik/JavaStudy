package salary.bean;

public class SalaryDTO implements Comparable<SalaryDTO> {
	private int num, basic, extra, tax, salary;
	private String name, rank;
	
	public SalaryDTO() {}
	
	public SalaryDTO(int num, String name, String rank, int basic, int extra) {
		this.num = num;
		this.name = name;
		this.rank = rank;
		this.basic = basic;
		this.extra = extra;
		this.tax = (int) ((basic + extra) * 0.03);
		this.salary = basic + extra - tax;
		
	}
	
	public void calc() {
		if(basic+extra > 4000000) tax=(int) ((basic+extra)*0.03);
		else if (basic+extra > 2000000) tax=(int) ((basic+extra)*0.02);
		else tax=(int) ((basic+extra)*0.01);
		
		salary = basic + extra - tax;
	}
	
	
	public int getNum() {
		return num;
	}
	public void setNum(int num) {
		this.num = num;
	}
	public int getBasic() {
		return basic;
	}
	public void setBasic(int basic) {
		this.basic = basic;
	}
	public int getExtra() {
		return extra;
	}
	public void setExtra(int extra) {
		this.extra = extra;
	}
	public int getTax() {
		return tax;
	}
	public void setTax(int tex) {
		this.tax = tex;
	}
	public int getSalary() {
		return salary;
	}
	public void setSalary(int salary) {
		this.salary = salary;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getRank() {
		return rank;
	}
	public void setRank(String rank) {
		this.rank = rank;
	}
	
	@Override
	public String toString() {
		return num + "\t" + name  + "\t" + rank  + "\t" +  basic  + "\t" + extra  + "\t" +  tax  + "\t" +  salary;
	}


	@Override
	public int compareTo(SalaryDTO o) {
		return this.name.compareTo(o.name);
	}
	
}
