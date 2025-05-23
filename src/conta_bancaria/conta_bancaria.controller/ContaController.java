package conta_bancaria.controller;

import java.util.ArrayList;

import conta_bancaria.model.Conta;
import conta_bancaria.repository.ContaRepository;

public class ContaController implements ContaRepository{
	
	//Criar colettion ArrayList
	private ArrayList<Conta> listaContas = new ArrayList<Conta>();
	
	//varialvel para controlar os numeros das contas
	int numero = 0;
	
	@Override
	public void procurarPorNumero(int numero) {
		var conta = buscarNaCollection(numero);
		
		if(conta != null) 
			conta.visualizar();
		else
			System.out.printf("\n A conta número¢d não foi encontrada ", numero);
	}

	@Override
	public void listarTodas() {
		for(var conta : listaContas) 
		{
			conta.visualizar();
		}
	}

	@Override
	public void cadastrar(Conta conta) {
		listaContas.add(conta);
		System.out.println("Conta adicionada com Sucesso!");		
	}

	@Override
	public void atualizar(Conta conta) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deletar(int numero) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void sacar(int numero, float valor) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void depositar(int numero, float valor) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void transferir(int numeroOrigem, int numeroDestino, float valor) {
		// TODO Auto-generated method stub
		
	}
	
	//metodos auxiliares
	public int gerarNumero() {
		return ++ numero;
	}
	
	public Conta buscarNaCollection(int numero) 
	{
		for(var conta :  listaContas ) 
		{
			if(conta.getNumero() == numero)
			return conta;
		}
		return null;
	}


}