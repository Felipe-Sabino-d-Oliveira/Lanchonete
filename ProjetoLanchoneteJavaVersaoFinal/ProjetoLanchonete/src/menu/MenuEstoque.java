package menu;

import java.util.Scanner;

import cadastros.CadastroDeProdutosNoEstoque;

public class MenuEstoque {

	public static void menuEstoque(String nomeUsuario) {

		Scanner sc = new Scanner(System.in);
		CadastroDeProdutosNoEstoque acoesEstoque = new CadastroDeProdutosNoEstoque();

		int escolha;

		do {
			System.out.println("Estoque da Lanchonete Salgados & Cia\n");
			System.out.println("Escolha uma opção:\n");
			System.out.println("1. Adicionar produto no estoque");
			System.out.println("2. Visualizar produtos do estoque");
			System.out.println("3. Excluir produto do estoque");
			System.out.println("4. Retroceder ao menu anterior");
			System.out.println("5. Encerrar programa\n");

			escolha = sc.nextInt();
			sc.nextLine();

			switch (escolha) {
			case 1:
				acoesEstoque.Cadastrar();
				break;
			case 2:
				acoesEstoque.Listar();
				break;
			case 3:
				acoesEstoque.Remover();
				break;
			case 4:
				MenuGeral.menuGeral(nomeUsuario);
			case 5:
				System.out.println("Programa encerrado.");
				System.exit(0);
			}
		} while (escolha != 5);
	}
}