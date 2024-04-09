package menu;

import java.util.Scanner;

import pedidos.EfetuarPedido;

public class MenuPedidos {
	
	public static void menuPedidos(String nomeUsuario){
		
		Scanner sc = new Scanner(System.in);

		int escolha;
		do {
			System.out.println("\nPedidos da Lanchonete Salgados & Cia\n");
			System.out.println("Selecione uma opção:\n");
			System.out.println("1. Efetuar Pedido");
			System.out.println("2. Cancelar Pedido");
			System.out.println("3. Histórico de Pedidos");
			System.out.println("4. Finalizar pedido");
			System.out.println("5. Retroceder ao menu anterior");
			System.out.println("6. Encerrar programa\n");
			escolha = sc.nextInt();

			switch (escolha) {
			case 1:
				EfetuarPedido.efetuarPedido();
				break;
			case 2:
				EfetuarPedido.cancelarPedido();
				break;
			case 3:
				EfetuarPedido.exibirHistorico();
				break;
			case 4:
				EfetuarPedido.finalizarPedidos();
				break;
			case 5:
				MenuGeral.menuGeral(nomeUsuario);
			case 6:
				System.out.println("Programa finalizado");
				System.exit(0);
			}
		} while (escolha != 6);
	}
}