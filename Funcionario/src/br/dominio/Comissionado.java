package br.dominio;

public class Comissionado extends Funcionario{
	
	private double vendaBruta;
	private  double porcentagemComissao;
	public Comissionado(int codigo, String nome, long cpf, double vendaBruta, double porcentagemComissao) {
		super(codigo, nome, cpf);
		this.vendaBruta = vendaBruta;
		this.porcentagemComissao = porcentagemComissao;
	}
	public double getVendaBruta() {
		return vendaBruta;
	}
	public void setVendaBruta(double vendaBruta) {
		this.vendaBruta = vendaBruta;
	}
	public double getPorcentagemComissao() {
		return porcentagemComissao;
	}
	public void setPorcentagemComissao(double porcentagemComissao) {
		this.porcentagemComissao = porcentagemComissao;
	}

}
