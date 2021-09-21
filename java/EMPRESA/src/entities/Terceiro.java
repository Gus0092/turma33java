package entities;

public class Terceiro extends Funcionario {

	private double adcional;

	public Terceiro(String matricula, String nome) {
		super(matricula, nome);
		// TODO Auto-generated constructor stub
	}

	public Terceiro(String matricula, String nome, int horasTrabalhadas, double valorHora) {
		super(matricula, nome, horasTrabalhadas, valorHora);
		// TODO Auto-generated constructor stub
	}

	public Terceiro(String matricula, String nome, int horasTrabalhadas, double valorHora, double adcional) {
		super(matricula, nome, horasTrabalhadas, valorHora);
		this.adcional = adcional;
		// TODO Auto-generated constructor stub
	}

	public double getAdcional() {
		return adcional;
	}

	public void setAdcional(double adcional) {
		this.adcional = adcional;
	}

	@Override
	public double salario() {
		return ((this.horasTrabalhadas * this.valorHora) + this.adcional);
	}

}
