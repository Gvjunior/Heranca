package br.dominio;

public class ComissionadoAssalariado extends Comissionado {
	
	private double salarioMensal;

	public ComissionadoAssalariado(int codigo, String nome, long cpf, double vendaBruta, double porcentagemComissao,
			double salarioMensal) {
		super(codigo, nome, cpf, vendaBruta, porcentagemComissao);
		this.salarioMensal = salarioMensal;
	}

	public double getSalarioMensal() {
		return salarioMensal;
	}

	public void setSalarioMensal(double salarioMensal) {
		this.salarioMensal = salarioMensal;
	}

}
