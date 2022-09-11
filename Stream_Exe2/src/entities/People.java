package entities;

public class People {
	
	private String name;
	private String email;
	private Double salary;
	
	public People() {
		
	}

	public People(String name, String emial, Double salary) {
		super();
		this.name = name;
		this.email = emial;
		this.salary = salary;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String emial) {
		this.email = emial;
	}

	public Double getSalary() {
		return salary;
	}

	public void setSalary(Double salary) {
		this.salary = salary;
	}
	
	
}
	
	
