package conta_bancaria;

import java.text.NumberFormat;

import conta_bancaria.model.Conta;

public class ContaCorrente extends Conta {

	private float limite;

	public ContaCorrente(int numero, int agencia, int tipo, String titular, float saldo, float limite) {
		super(numero, agencia, tipo, titular, saldo);
		this.limite = limite;
	}

	public float getLimite() {
		return limite;
	}

	public void setLimite(float limite) {
		this.limite = limite;
	}
	
	@Override
	public void visualizar() {
		NumberFormat nfMoeda = NumberFormat .getCurrencyInstance();
		super.visualizar();
		System.out.println("Limite da Conta: " + nfMoeda.format(this.limite));
	}
}
