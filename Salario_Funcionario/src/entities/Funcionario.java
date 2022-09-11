package entities;

public class Funcionario {
	
	private String nome;
	private double salarioBruto;
	private double tax;
	
	public Funcionario(String nome, double salarioBruto, double tax) {
		this.nome = nome;
		this.salarioBruto = salarioBruto;
		this.tax = tax;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public double getSalarioBruto() {
		return salarioBruto;
	}

	public void setSalarioBruto(double salarioBruto) {
		this.salarioBruto = salarioBruto;
	}

	public double getTax() {
		return tax;
	}

	public void setTax(double tax) {
		this.tax = tax;
	}

	public double salarioLiquido() {
		return salarioBruto - tax;
	}
	
	public void aumento(double porcentagem) {
		salarioBruto += salarioBruto * porcentagem / 100.0;
	}
	
	public String toString() {
		return nome + ", $ " + String.format("%.2f", salarioLiquido());
		}

}
