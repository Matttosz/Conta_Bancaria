package conta_bancaria.model;

import java.text.NumberFormat;

public class Conta {
	
	//Atributos da classe
	private int numero;
	private int agencia;
	private int tipo;
	private String titular;
	private float saldo;
	
	//Método Construtor
	public Conta(int numero, int agencia, int tipo, String titular, float saldo) {
		this.numero = numero;
		this.agencia = agencia;
		this.tipo = tipo;
		this.titular = titular;
		this.saldo = saldo;
	}

	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}

	public int getAgencia() {
		return agencia;
	}

	public void setAgencia(int agencia) {
		this.agencia = agencia;
	}

	public int getTipo() {
		return tipo;
	}

	public void setTipo(int tipo) {
		this.tipo = tipo;
	}

	public String getTitular() {
		return titular;
	}

	public void setTitular(String titular) {
		this.titular = titular;
	}

	public float getSaldo() {
		return saldo;
	}
	//Método Bancário
	public void setSaldo(float saldo) {
		this.saldo = saldo;
	}
	
	public boolean sacar(float valor) 
	{
		if (this.saldo < valor ) {
			System.out.println("\nSaldo é Insuficiente");
			return false;
		}
		this.setSaldo(this.saldo - valor);
		return true;
	}
	
	public void visualizar() {
		
		String tipo = "";
		
		switch(this.tipo) {
			case 1  ->  tipo = "Conta Correte";
			case 2  ->  tipo = "Conta Poupança";
			default ->  tipo = "Inválido";
		}
		
		NumberFormat nfMoeda = NumberFormat.getCurrencyInstance();
		System.out.println("***************************************"); 
		System.out.println("Dados Da Conta Atual");
		System.out.println("***************************************");
		System.out.println("Número da Conta: " + this.numero);
		System.out.println("Número da agencia: " + this.agencia);
		System.out.println("Número da tipo: " + this.tipo);
		System.out.println("Número da titular: " + this.titular);
		System.out.println("Número da saldo: " + nfMoeda.format(this.saldo));
	}
	
	
}
