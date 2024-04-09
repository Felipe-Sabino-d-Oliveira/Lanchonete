package menu;

import java.util.Scanner;

import principal.LoginFuncionario;
import utilitarios.LimparTela;

public class MenuGeral{

	//menu geral;
	public static void menuGeral(String nomeUsuario) {
		
		LimparTela.DeixarVazio();
		Scanner sc = new Scanner(System.in);
		int escolha;
		do{
			System.out.println("----------Menu----------");
			System.out.println("1-Pedidos");
			System.out.println("2-Clientes");
			if(nomeUsuario.equals("gerente")) {
				System.out.println("3-Funcionários");
				System.out.println("4-Estoque");
				System.out.println("5-Fornecedores");
			}
			System.out.println("6- Desconectar");
			System.out.println("7-Encerrar programa ");
			
			escolha = sc.nextInt();
			switch (escolha) {
			case 1:
				MenuPedidos.menuPedidos(nomeUsuario);
				break;
			case 2:
				MenuCliente.menuCliente(nomeUsuario);
				break;
			case 3:
				if(nomeUsuario.equals("gerente")) {
					MenuFuncionario.menuFuncionario(nomeUsuario);
				}
				break;
			case 4:
				if(nomeUsuario.equals("gerente")) {
					MenuEstoque.menuEstoque(nomeUsuario);
				}
				break;
			case 5:
				if(nomeUsuario.equals("gerente")) {
					MenuFornecedor.menuFornecedor(nomeUsuario);
				}
				break;
			case 6:
				LoginFuncionario.login();
			case 7:
				System.out.println("Programa Finalizado");
				System.exit(0);
			}
		}while (escolha != 7);
	}
}