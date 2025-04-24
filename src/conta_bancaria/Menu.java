package conta_bancaria;

import java.util.Scanner;

import conta_bancaria.util.Cores;

public class Menu{
		public static void main(String[] args){
			
		Scanner read = new Scanner(System.in);
		int opcao;
		
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
			System.out.println("\nBanco do Brazil com Z - O seu Futuro começa aqui!");
			sobre();
			read.close();
			System.exit(0);
		 }
		 switch (opcao) 
		 {
			case 1:
				System.out.println("Criar Conta\n\n");

			break;
			case 2:
				System.out.println("Listar todas as Contas\n\n");

			break;
			case 3:
				System.out.println("Consultar dados da Conta - por número\n\n");

			break;
			case 4:
				System.out.println("Atualizar dados da Conta\n\n");

			break;
			case 5:
				System.out.println("Apagar a Conta\n\n");

			break;
			case 6:
				System.out.println("Saque\n\n");

			break;
			case 7:
				System.out.println("Depósito\n\n");

			break;
			case 8:
				System.out.println("Transferência entre Contas\n\n");

			break;
			default:
				System.out.println("\nOpção Inválida!\n");
			break;
		 }
		}

}
	public static void sobre() {
		System.out.println("\n*********************************************************");
		System.out.println("Projeto Desenvolvido por: Muris ");
		System.out.println("Generation Brasil - murilom@generation.org");
		System.out.println("https://github.com/Matttosz");
		System.out.println("**********************************************************");
		}
		
}
