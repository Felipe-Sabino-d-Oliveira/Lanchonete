package menu;

import java.util.Scanner;

import cadastros.CadastroDeFuncionarios;

public class MenuFuncionario{

	public static void menuFuncionario(String nomeUsuario){
		
		CadastroDeFuncionarios acoesFuncionario = new CadastroDeFuncionarios();
		int escolha;
		do {
			Scanner sc = new Scanner(System.in);
			
			System.out.println("\nFuncionários da Lanchonete Salgados & Cia\n");
			System.out.println("\nSelecione uma opção: \n");
			System.out.println("1. Cadastrar Funcionário");
		    System.out.println("2. Listar Funcionários");
		    System.out.println("3. Remover Funcionário");
		    System.out.println("4. Retroceder ao menu anterior");
		    System.out.println("5. Encerrar programa\n");
	
		    escolha = sc.nextInt();
		
		    sc.nextLine();
	
		    switch (escolha) {
		    case 1:
		    	acoesFuncionario.Cadastrar();
		        break;
		    case 2:
		    	acoesFuncionario.Listar();
		        break;
		    case 3:
		    	acoesFuncionario.Remover();
		        break;
		    case 4:
		    	MenuGeral.menuGeral(nomeUsuario);
		    case 5:
		    	System.out.println("Programa finalizado.");
		    	System.exit(0);
		    }
		} while (escolha != 5);
	}
}