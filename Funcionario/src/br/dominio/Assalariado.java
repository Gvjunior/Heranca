package br.dominio;

public class Assalariado extends Funcionario {
	
	private double salarioSemanal;

	public Assalariado(int codigo, String nome, long cpf, double salarioSemanal) {
		super(codigo, nome, cpf);
		this.salarioSemanal = salarioSemanal;
	}

	public double getSalarioSemanal() {
		return salarioSemanal;
	}

	public void setSalarioSemanal(double salarioSemanal) {
		this.salarioSemanal = salarioSemanal;
	}

}
