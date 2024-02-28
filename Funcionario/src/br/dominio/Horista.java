package br.dominio;

public class Horista extends Funcionario {

	private double valorhora;
	private double horasTrabalhadas;

	public Horista(int codigo, String nome, long cpf, double valorhora, double horasTrabalhadas) {
		super(codigo, nome, cpf);
		this.valorhora = valorhora;
		this.horasTrabalhadas = horasTrabalhadas;
	}

	public double getValorhora() {
		return valorhora;
	}

	public void setValorhora(double valorhora) {
		this.valorhora = valorhora;
	}

	public double getHorasTrabalhadas() {
		return horasTrabalhadas;
	}

	public void setHorasTrabalhadas(double horasTrabalhadas) {
		this.horasTrabalhadas = horasTrabalhadas;
	}

}
