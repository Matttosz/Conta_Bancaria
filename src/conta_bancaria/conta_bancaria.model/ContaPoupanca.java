package conta_bancaria.model;

public class ContaPoupanca extends Conta{
	private int aniversario;

	public ContaPoupanca(int numero, int agencia, int tipo, String titular, float saldo, int limite) {
		super(numero, agencia, tipo, titular, saldo);
		this.aniversario = limite;
	}

	public int getAniversario() {
		return aniversario;
	}

	public void setAniversario(int aniversario) {
		this.aniversario = aniversario;
	}
	
	@Override
	public void visualizar() {
			super.visualizar();
			System.out.println("Limite da Conta: " + this.getAniversario());
	}
	
	

}
