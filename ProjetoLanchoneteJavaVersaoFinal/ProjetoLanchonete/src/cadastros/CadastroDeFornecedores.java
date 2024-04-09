package cadastros;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import exibirDados.ExibirDados;
import entidades.Fornecedor;
import interfaces.CadRemLis;
import pedidosAoFornecedor.PedidoAoFornecedor;
import utilitarios.LimparTela;

public class CadastroDeFornecedores implements CadRemLis {

	private static List<Fornecedor> fornecedores = new ArrayList<Fornecedor>();

	public List<Fornecedor> getFornecedores() {
		return fornecedores;
	}

	public void setFornecedores(List<Fornecedor> fornecedores) {
		this.fornecedores = fornecedores;
	}

	// Cadastrar Fornecedores
	@Override
	public void Cadastrar() {

		Scanner sc = new Scanner(System.in);

		LimparTela.DeixarVazio();

		System.out.println("\n--------- Cadastro de Fornecedor ---------\n");
		System.out.print("Nome completo do fornecedor: ");
		String nome = sc.nextLine();

		System.out.print("CNPJ do fornecedor (00.000.000/0001-00): ");
		String cnpj = sc.nextLine();

		System.out.print("Endereço do fornecedor (rua, bairro, cidade): ");
		String endereco = sc.nextLine();

		System.out.print("Telefone do fornecedor (00 00000-0000): ");
		String telefone = sc.nextLine();

		System.out.print("E-mail do fornecedor: ");
		String email = sc.nextLine();

		System.out.print("Produto(s) fornecido pelo fornecedor (separe por vírgula): ");
		String produtoFornecido = sc.nextLine();

		Fornecedor fornecedor = new Fornecedor(nome, cnpj, endereco, telefone, email, produtoFornecido);
		fornecedores.add(fornecedor);

		System.out.println("\nSituação: Fornecedor cadastrado com sucesso!\n");
		ExibirDados.exibirDadosFornecedor(fornecedor);
		System.out.println("\n------------------------------------------");
	}

	@Override
	public void Remover() {

		Scanner sc = new Scanner(System.in);
		LimparTela.DeixarVazio();

		if (fornecedores.isEmpty()) {
			System.out.println("Nenhum fornecedor cadastrado para excluir.");
			System.out.println("\n------------------------------------------");
		} else {
			System.out.print("Digite o CNPJ do fornecedor que deseja remover: ");
			String cnpj = sc.nextLine();

			Fornecedor fornecedorParaRemover = null;

			for (Fornecedor fornecedor : fornecedores) {
				if (fornecedor.getCnpj().equals(cnpj)) {
					fornecedorParaRemover = fornecedor;
					break;
				}
			}
			if (fornecedorParaRemover != null) {
				String nomeFornecedor = fornecedorParaRemover.getNomeEmpresa();
				fornecedores.remove(fornecedorParaRemover);
				System.out.println("\nSituação: Fornecedor " + nomeFornecedor + " com CNPJ " + cnpj
						+ " foi excluído com sucesso!");
				System.out.println("\n------------------------------------------");
			} else {
				System.out.println("\nSituação: Fornecedor não encontrado!");
				System.out.println("\n------------------------------------------");
			}
		}
	}

	@Override
	public void Listar() {

        if (fornecedores.isEmpty()) {
            System.out.println("Nenhum fornecedor cadastrado no banco de dados.");
        } else {
            System.out.println("Lista de fornecedores:");
            for (Fornecedor fornecedor : fornecedores) {
                ExibirDados.exibirDadosFornecedor(fornecedor); // Você pode usar seu método de exibição aqui
                System.out.println("------------------------------------------");
            }
        }

		
	}
	
	// Método para exibir todos os fornecedores
    public void exibirTodosFornecedores() {
        
    }

	// Pedidos para fornecedor
	public static void efetuarPedidoAoFornecedor(Scanner sc) {

		LimparTela.DeixarVazio();
		if (fornecedores.isEmpty()) {
			System.out.println("Nenhum fornecedor cadastrado para fazer pedidos.");
			System.out.println("\n------------------------------------------");
		} else {
			System.out.println("Empresas Cadastradas:\n");

			int numeroEmpresa = 1;
			for (Fornecedor fornecedor : fornecedores) {
				System.out.println("Empresa " + numeroEmpresa);
				System.out.println("Nome: " + fornecedor.getNomeEmpresa());
				System.out.println("CNPJ: " + fornecedor.getCnpj());
				System.out.println("Produtos fornecidos: " + fornecedor.getProdutoFornecido());
				System.out.println("\n------------------------------------------");
				numeroEmpresa++;
			}
			System.out.print("Digite o CNPJ da empresa para fazer o pedido: ");
			String cnpj = sc.nextLine();

			Fornecedor fornecedorSelecionado = null;

			for (Fornecedor fornecedor : fornecedores) {
				if (fornecedor.getCnpj().equals(cnpj)) {
					fornecedorSelecionado = fornecedor;
					break;
				}
			}
			if (fornecedorSelecionado != null) {
				System.out.print("Digite os produtos a serem pedidos (separados por vírgula): ");
				String produtosPedidos = sc.nextLine();

				String[] produtosSolicitados = produtosPedidos.split(",");

				System.out.println();

				int totalQuantidade = 0;
				boolean produtoNaoEncontrado = false;
				List<String> produtosEQuantidades = new ArrayList<>();

				for (String produtoSolicitado : produtosSolicitados) {
					produtoSolicitado = produtoSolicitado.trim();
					String[] produtosFornecidos = fornecedorSelecionado.getProdutoFornecido().split(", ");
					boolean produtoEncontrado = false;

					for (String produtoFornecido : produtosFornecidos) {
						if (produtoFornecido.equalsIgnoreCase(produtoSolicitado)) {
							produtoEncontrado = true;
							break;
						}
					}

					if (produtoEncontrado) {
						System.out.print("Produto: " + produtoSolicitado + "\n");
						System.out.print("Digite a quantidade desejada do produto: ");
						int quantidadeProdutos = sc.nextInt();
						sc.nextLine();

						PedidoAoFornecedor pedido = new PedidoAoFornecedor(produtoSolicitado, quantidadeProdutos);
						fornecedorSelecionado.getPedidosEmAndamento().add(pedido);

						System.out.println("Quantidade: " + quantidadeProdutos);
						totalQuantidade += quantidadeProdutos;
						produtosEQuantidades.add(produtoSolicitado + " = " + quantidadeProdutos);
					} else {
						System.out.println("Produto " + produtoSolicitado + " não encontrado");
						produtoNaoEncontrado = true;
					}

					System.out.println();
				}

				if (!produtoNaoEncontrado) {
					System.out.println("\nPedido para a " + fornecedorSelecionado.getNomeEmpresa() + " com o CNPJ: "
							+ cnpj + " enviado com sucesso!");
					System.out.println("\n-------- Resumo do Pedido --------");
					System.out.println("\nEmpresa: " + fornecedorSelecionado.getNomeEmpresa());
					System.out.println("CNPJ: " + cnpj);
					System.out.println("Produtos solicitados:");

					for (String produtoQuantidade : produtosEQuantidades) {
						System.out.println(produtoQuantidade);
					}

					System.out.println("Quantidade total de produtos pedidos: " + totalQuantidade);
					System.out.println("\n------------------------------------------");
				} else {
					System.out.println("\nAlguns produtos não foram encontrados. Pedido não foi enviado.");
					System.out.println("\n------------------------------------------");
				}
			} else {
				System.out.println("\nCNPJ do fornecedor não encontrado.");
				System.out.println("\n------------------------------------------");
			}
		}
	}

	// Cancelar pedidos
	public static void cancelarPedidosParaFornecedor(Scanner sc) {

		LimparTela.DeixarVazio();
		if (fornecedores.isEmpty()) {

			System.out.println("Nenhum fornecedor cadastrado para cancelar pedidos.");
			System.out.println("\n------------------------------------------\n");
		} else {

			System.out.print("\nDigite o CNPJ do fornecedor para cancelar o pedido: ");
			String cnpj = sc.nextLine();

			Fornecedor fornecedorSelecionado = null;

			for (Fornecedor fornecedor : fornecedores) {

				if (fornecedor.getCnpj().equals(cnpj)) {
					fornecedorSelecionado = fornecedor;
					break;
				}
			}
			if (fornecedorSelecionado != null) {

				List<PedidoAoFornecedor> pedidosEmAndamento = fornecedorSelecionado.getPedidosEmAndamento();

				if (pedidosEmAndamento.isEmpty()) {

					System.out.println("Não há pedidos em andamento para esta empresa.");
				} else {

					System.out.println("Pedidos em andamento para a empresa com CNPJ: " + cnpj);
					System.out.println("\n-------- Pedidos em Andamento --------");

					int numeroPedido = 1;
					for (PedidoAoFornecedor pedido : pedidosEmAndamento) {

						System.out.println("Pedido " + numeroPedido + ":");
						System.out.println("Produto: " + pedido.getProduto());
						System.out.println("Quantidade: " + pedido.getQuantidade());
						numeroPedido++;
					}

					System.out.print("Digite o número do pedido que deseja cancelar: ");
					int numeroPedidoCancelar = sc.nextInt();
					sc.nextLine();

					if (numeroPedidoCancelar > 0 && numeroPedidoCancelar <= pedidosEmAndamento.size()) {

						PedidoAoFornecedor pedidoCancelar = pedidosEmAndamento.get(numeroPedidoCancelar - 1);
						pedidosEmAndamento.remove(pedidoCancelar);
						System.out.println("\nPedido cancelado com sucesso!");
					} else {

						System.out.println("Número de pedido inválido. Pedido não foi cancelado.");
					}
				}
			} else {
				System.out.println("A empresa com CNPJ: " + cnpj + " não foi encontrada.");
				System.out.println("\n------------------------------------------");
			}
		}
	}

	// Acompanhar pedidos
	public static void acompanharPedidos(Scanner sc) {

		LimparTela.DeixarVazio();

		if (fornecedores.isEmpty()) {
			System.out.println("Nenhum fornecedor cadastrado.");
		} else {
			System.out.println("\n--------- Acompanhar Pedidos ---------\n");
			System.out.print("\nDigite o CNPJ da empresa para acompanhar os pedidos: ");
			String cnpj = sc.nextLine();

			Fornecedor fornecedorSelecionado = null;

			for (Fornecedor fornecedor : fornecedores) {
				if (fornecedor.getCnpj().equals(cnpj)) {
					fornecedorSelecionado = fornecedor;
					break;
				}
			}
			if (fornecedorSelecionado != null) {
				List<PedidoAoFornecedor> pedidosEmAndamento = fornecedorSelecionado.getPedidosEmAndamento();

				if (pedidosEmAndamento.isEmpty()) {
					System.out.println("Não há pedidos em andamento para esta empresa.");
				} else {
					System.out.println("Pedidos em andamento para a empresa com CNPJ: " + cnpj);
					System.out.println("\n-------- Pedidos em Andamento --------");

					int numeroPedido = 1;
					for (PedidoAoFornecedor pedido : pedidosEmAndamento) {
						System.out.println("Pedido " + numeroPedido + ":");
						System.out.println("Produto: " + pedido.getProduto());
						System.out.println("Quantidade: " + pedido.getQuantidade());
						System.out.println("----------------------------");
						numeroPedido++;
					}
				}
			} else {
				System.out.println("A empresa com CNPJ: " + cnpj + " não foi encontrada.");
			}
		}
		System.out.println("\n------------------------------------------");
	}

	// Histórico de pedidos
	public static void historicoPedidos(Scanner sc) {

		LimparTela.DeixarVazio();
		if (fornecedores.isEmpty()) {
			System.out.println("Nenhum fornecedor cadastrado.");
		} else {
			System.out.println("----------Histórico de Pedidos------------\n");
			System.out.print("Digite o CNPJ da empresa para ver o histórico de pedidos: ");
			String cnpj = sc.nextLine();

			Fornecedor fornecedorSelecionado = null;

			for (Fornecedor fornecedor : fornecedores) {
				if (fornecedor.getCnpj().equals(cnpj)) {
					fornecedorSelecionado = fornecedor;
					break;
				}
			}
			if (fornecedorSelecionado != null) {
				List<PedidoAoFornecedor> historicoPedidos = fornecedorSelecionado.getPedidosEmAndamento();
				if (historicoPedidos.isEmpty()) {
					System.out.println("Não há histórico de pedidos para esta empresa.");
				} else {
					System.out.println("Histórico de Pedidos para a empresa com CNPJ: " + cnpj);
					System.out.println("\n-------- Histórico de Pedidos --------");

					int numeroPedido = 1;
					for (PedidoAoFornecedor pedido : historicoPedidos) {
						System.out.println("Pedido " + numeroPedido + ":");
						System.out.println("Produto: " + pedido.getProduto());
						System.out.println("Quantidade: " + pedido.getQuantidade());
						System.out.println("----------------------------");
						numeroPedido++;
					}
				}
			} else {
				System.out.println("A empresa com CNPJ: " + cnpj + " não foi encontrada.");
			}
		}
		System.out.println("\n------------------------------------------");
	}
}