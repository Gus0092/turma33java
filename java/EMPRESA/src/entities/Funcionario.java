package entities;

public class Funcionario {
	
	protected String matricula;
	protected int horasTrabalhadas;
	protected double valorHora;
	protected String nome;
	
	
	
	
	public Funcionario(String matricula, String nome) {
		super();
		this.matricula = matricula;
		this.nome = nome;
	}
	
	
	public Funcionario(String matricula, String nome, int horasTrabalhadas, double valorHora) {
		super();
		this.matricula = matricula;
		this.horasTrabalhadas = horasTrabalhadas;
		this.valorHora = valorHora;
		this.nome = nome;
	}


	public int getHorasTrabalhadas() {
		return horasTrabalhadas;
	}
	public void setHorasTrabalhadas(int horasTrabalhadas) {
		this.horasTrabalhadas = horasTrabalhadas;
	}
	public double getValorHora() {
		return valorHora;
	}
	public void setValorHora(double valorHora) {
		this.valorHora = valorHora;
	}
	public String getMatricula() {
		return matricula;
	}
	public String getNome() {
		return nome;
	}
	
	public double salario() {
		return (this.horasTrabalhadas * this.valorHora);
	}
	
	
}
