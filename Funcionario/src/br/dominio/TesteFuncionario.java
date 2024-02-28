package br.dominio;

public class TesteFuncionario {
	public static void main(String[] args) {
		Funcionario f = new Funcionario(1, "Regina", 94290056857L);
		f.setSetor("TI");
		f.aumentaSalario(12_000.00);
		System.out.println(f.imprime());
		}
}
