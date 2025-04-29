package conta_bancaria;

import java.io.IOException;
import java.util.Scanner;

import conta_bancaria.model.Conta;
import conta_bancaria.model.ContaCorrente;
import conta_bancaria.util.Cores;

public class Menu{
		public static void main(String[] args){
			
		Scanner read = new Scanner(System.in);
		int opcao;
		
		 Conta c1 = new Conta(1, 123 , 1 , "Jahseh Onfroy" , 500000);
		 c1.sacar(100);
		 
		// Sacar
		c1.sacar(100);
		c1.visualizar();
		
		// Depositar
		c1.depositar(1000);
		c1.visualizar();
		
		// Alterar a propriedade titular
		c1.setTitular("Jahseh Onfroy");
		c1.visualizar(); 
		 
		ContaCorrente cc1 = new ContaCorrente(2, 888, 5, "Jorge Ben", 600000, 60000);
		cc1.visualizar();
		 
		cc1.sacar(659000);
		cc1.visualizar();
			
		cc1.depositar(50000);
		cc1.visualizar();
		 
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
			break;
			case 2:
				System.out.println(Cores.TEXT_PURPLE_BOLD_BRIGHT + "Listar todas as Contas\n\n");

			break;
			case 3:
				System.out.println(Cores.TEXT_PURPLE_BOLD_BRIGHT + "Consultar dados da Conta - por número\n\n");

			break;
			case 4:
				System.out.println(Cores.TEXT_PURPLE_BOLD_BRIGHT + "Atualizar dados da Conta\n\n");

			break;
			case 5:
				System.out.println(Cores.TEXT_PURPLE_BOLD_BRIGHT + "Apagar a Conta\n\n");

			break;
			case 6:
				System.out.println(Cores.TEXT_PURPLE_BOLD_BRIGHT + "Saque\n\n");

			break;
			case 7:
				System.out.println(Cores.TEXT_PURPLE_BOLD_BRIGHT + "Depósito\n\n");

			break;
			case 8:
				System.out.println(Cores.TEXT_PURPLE_BOLD_BRIGHT + "Transferência entre Contas\n\n");

			break;
			default:
				System.out.println(Cores.TEXT_PURPLE_BOLD_BRIGHT + "\nOpção Inválida!\n");
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