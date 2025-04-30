package conta_bancaria;

import java.io.IOException;
import java.util.Scanner;

import conta_bancaria.controller.ContaController;
import conta_bancaria.model.Conta;
import conta_bancaria.model.ContaCorrente;
import conta_bancaria.model.ContaPoupanca;
import conta_bancaria.util.Cores;

public class Menu{
		public static void main(String[] args){
			
		Scanner read = new Scanner(System.in);
		
		ContaController contas = new ContaController();
		int opcao, numero, agencia, tipo, aniversario;
		String titular;
		float saldo, limite;
		
		 ContaCorrente cc1 = new ContaCorrente(contas.gerarNumero(), 888, 1, "Muris Mattos", 1000.00f, 100.00f);
			contas.cadastrar(cc1);
		ContaPoupanca cp1 = new ContaPoupanca(contas.gerarNumero(), 222, 2, "Clark the Menace", 1000.00f, 12);
			contas.cadastrar(cp1);
		 
		while(true) 
		{
			
		 System.out.println(Cores.TEXT_GREEN_BOLD_BRIGHT  + "*******************************************************");
		 System.out.println("                                                     ");
		 System.out.println(Cores.TEXT_PURPLE_BOLD_BRIGHT + "*                BANCO DO BRAZIL COM Z                *");
		 System.out.println("                                                     ");
		 System.out.println(Cores.TEXT_GREEN_BOLD_BRIGHT  + "*******************************************************");
		 System.out.println("                                                     ");
		 System.out.println(Cores.TEXT_PURPLE_BOLD_BRIGHT + "*            1 - Criar Conta                          *");
		 System.out.println(Cores.TEXT_PURPLE_BOLD_BRIGHT + "*            2 - Listar todas as Contas               *");
		 System.out.println(Cores.TEXT_PURPLE_BOLD_BRIGHT + "*            3 - Buscar Conta por Numero              *");
		 System.out.println(Cores.TEXT_PURPLE_BOLD_BRIGHT + "*            4 - Atualizar Dados da Conta             *");
		 System.out.println(Cores.TEXT_PURPLE_BOLD_BRIGHT + "*            5 - Apagar Conta                         *");
		 System.out.println(Cores.TEXT_PURPLE_BOLD_BRIGHT + "*            6 - Sacar                                *");
		 System.out.println(Cores.TEXT_PURPLE_BOLD_BRIGHT + "*            7 - Depositar                            *");
		 System.out.println(Cores.TEXT_PURPLE_BOLD_BRIGHT + "*            8 - Transferir valores entre Contas      *");
		 System.out.println(Cores.TEXT_PURPLE_BOLD_BRIGHT + "*            9 - Sair                                 *");
		 System.out.println(Cores.TEXT_PURPLE_BOLD_BRIGHT + "*                                                     *");
		 System.out.println(Cores.TEXT_GREEN_BOLD_BRIGHT  + "*******************************************************");
		 System.out.println("Entre com a opção desejada:                          ");
		 System.out.println("                                                     ");

		 opcao = read.nextInt();
			
		 if (opcao == 9 ) 
		 {
			System.out.println(Cores.TEXT_PURPLE_BOLD_BRIGHT + "\nBanco do Brazil com Z - O seu Futuro começa aqui!");
			sobre();
			read.close();
			System.exit(0);
		 }
		 switch (opcao) 
		 {
			case 1:
				System.out.println(Cores.TEXT_PURPLE_BOLD_BRIGHT + "Criar Conta\n\n");
				
				System.out.println("Digite o número da agencia: ");
				agencia = read.nextInt();
				
				System.out.println("Digite o nome do titular: ");
				read.skip("\\r");
				titular = read.next();
				
				System.out.println("Digite o tipo da conta (1 -CC | 2 - CP: ");
				tipo = read.nextInt();
				
				System.out.println("Digite o valor inicial do saldo: ");
				saldo = read.nextFloat();
				
				switch(tipo) 
				{
				case 1 -> 
					{
						System.out.println("Digite o Limite da conta: ");
						limite = read.nextFloat();
						contas.cadastrar(new ContaCorrente(contas.gerarNumero(), agencia, tipo, titular, saldo, limite));
					}
				case 2 -> 
					{
					System.out.println("Digite a data do aniversário: ");
					aniversario = read.nextInt();
					contas.cadastrar(new ContaPoupanca(contas.gerarNumero(), agencia, tipo, titular, saldo, aniversario));	
					}
				}
				
			keypress();	
			break;
			case 2:
				System.out.println(Cores.TEXT_PURPLE_BOLD_BRIGHT + "Listar todas as Contas\n\n");
				contas.listarTodas();
			keypress();	
			break;
			case 3:
				System.out.println(Cores.TEXT_PURPLE_BOLD_BRIGHT + "Consultar dados da Conta - por número\n\n");
				
				System.out.println("Digite o número da conta: ");
				numero = read.nextInt();
				
				contas.procurarPorNumero(numero);
				
			keypress();
			break;
			case 4:
				System.out.println(Cores.TEXT_PURPLE_BOLD_BRIGHT + "Atualizar dados da Conta\n\n");
			keypress();
			break;
			case 5:
				System.out.println(Cores.TEXT_PURPLE_BOLD_BRIGHT + "Apagar a Conta\n\n");
			keypress();	
			break;
			case 6:
				System.out.println(Cores.TEXT_PURPLE_BOLD_BRIGHT + "Saque\n\n");
			keypress();		
			break;
			case 7:
				System.out.println(Cores.TEXT_PURPLE_BOLD_BRIGHT + "Depósito\n\n");
			keypress();	
			break;
			case 8:
				System.out.println(Cores.TEXT_PURPLE_BOLD_BRIGHT + "Transferência entre Contas\n\n");
			keypress();	
			break;
			default:
				System.out.println(Cores.TEXT_PURPLE_BOLD_BRIGHT + "\nOpção Inválida!\n");
			keypress();	
			break;
		 }
		}

}
	public static void sobre() {
		System.out.println("\n*********************************************************");
		System.out.println(Cores.TEXT_PURPLE_BOLD_BRIGHT +"Projeto Desenvolvido por: Muris ");
		System.out.println(Cores.TEXT_PURPLE_BOLD_BRIGHT +"Generation Brasil - murilom@generation.org");
		System.out.println(Cores.TEXT_PURPLE_BOLD_BRIGHT +"https://github.com/Matttosz");
		System.out.println("**********************************************************");
		}
	
	public static void keypress() 
	{
		
		try 
		{
			System.out.println(Cores.TEXT_RESET + "\n\nPressione Enter para Continuar");
			System.in.read();
		} catch(IOException e ) {
			
			System.out.println("Você pressionou um tecla diferente de 'Enter'! ");
		}
		
	}
		
}