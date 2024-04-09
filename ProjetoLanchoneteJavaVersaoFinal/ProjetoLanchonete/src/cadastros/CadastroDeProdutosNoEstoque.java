package cadastros;

import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;

import interfaces.CadRemLis;
import produto.Produto;
import utilitarios.LimparTela;

public class CadastroDeProdutosNoEstoque implements CadRemLis {
	private static List<Produto> produtos = new ArrayList<>();

	// Adicionar produto (opção 1)
	@Override
	public void Cadastrar() {
		Scanner sc = new Scanner(System.in);
		LimparTela.DeixarVazio();

		System.out.print("Nome do produto: ");
		String nome = sc.nextLine();

		System.out.print("Preço do produto: R$ ");
		double preco = sc.nextDouble();

		System.out.print("Quantidade do produto no estoque: ");
		int quantidade = sc.nextInt();
		sc.nextLine();

		System.out.print("Validade do produto (00/00/0000): ");
		String validade = sc.nextLine();

		System.out.print("Fornecedor do produto: ");
		String fornecedor = sc.nextLine();

		produtos.add(new Produto(nome, preco, quantidade, validade, fornecedor));
		System.out.println("\nProduto adicionado ao estoque.");
		System.out.println("\n------------------------------------------");
		// sc.close();
	}

	@Override
	public void Remover() {
		
		LimparTela.DeixarVazio();
		Scanner sc = new Scanner(System.in);

		if (produtos.isEmpty()) {
			System.out.println("Nenhum produto cadastrado para excluir.");
			System.out.println("\n------------------------------------------");
		} else {
			System.out.println("Digite o número do produto a ser excluído: \n");
			int numeroProdutoExclusao = 1;

			for (Produto produto : produtos) {
				System.out.println(numeroProdutoExclusao + ". " + produto.getNome() + "\n");
				numeroProdutoExclusao++;
			}

			int escolhaExcluir = sc.nextInt();

			if (escolhaExcluir >= 1 && escolhaExcluir <= produtos.size()) {
				Produto produtoExcluido = produtos.remove(escolhaExcluir - 1);
				System.out.println("\n" + produtoExcluido.getNome() + " removido do estoque!\n");
				System.out.println("------------------------------------------");
			} else {
				System.out.println("\nEscolha inválida. Tente novamente.\n");
				System.out.println("------------------------------------------");
			}
		}
	}

	@Override
	public void Listar() {
		
    	LimparTela.DeixarVazio();
        
        if (produtos.isEmpty()) {
            System.out.println("Nenhum produto cadastrado para visualizar.");
            System.out.println("\n------------------------------------------");
        } else {
            System.out.println("Produtos cadastrados no estoque:\n");
            int numeroProduto = 1;

            for (Produto produto : produtos) {
                System.out.println("\nProduto " + numeroProduto + "\n");
                System.out.println("Nome: " + produto.getNome());
                System.out.printf("Preço: R$ %.2f%n", produto.getPreco());
                System.out.println("Quantidade: " + produto.getQuantidade());
                System.out.println("Validade: " + produto.getValidade());
                System.out.println("Fornecedor: " + produto.getFornecedor());
                System.out.println("\n------------------------------------------");
                numeroProduto++;
            }
        }
	}
}