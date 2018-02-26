package br.alura.refatoracao.cap4;

public class ContaPJ extends ContaBancaria{

	public ContaPJ(String titular, double saldoInicial) {
		super(titular, saldoInicial);
	}
	
	public void saca(double valor) {
		super.saca(valor + 0.2);
	}
	
	public void deposita(double valor) {
		super.depositar(valor - 0.2);
	}
	
}
