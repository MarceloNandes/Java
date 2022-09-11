package entities;

public class Company extends TaxPayer{
	
	private Integer numberOfEmployees;
	
	public Company () {
	}

	public Company(String name, Double anualIncome, Integer numberOfEmployess) {
		super(name, anualIncome);
		this.numberOfEmployees = numberOfEmployess;
	}

	public Integer getNumberOfEmployess() {
		return numberOfEmployees;
	}

	public void setNumberOfEmployess(Integer numberOfEmployess) {
		this.numberOfEmployees = numberOfEmployess;
	}

	@Override
	public double Tax() {
		if (numberOfEmployees > 10) {
			return getAnualIncome() * 0.14;
		}else {
			return getAnualIncome() * 0.16;
		}
	}
	
	

}
