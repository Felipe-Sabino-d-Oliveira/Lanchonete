package menu;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import cadastros.CadastroDeFornecedores;
import entidades.Fornecedor;

public class MenuFornecedor {

    public static void menuFornecedor(String nomeUsuario){
    	
        Scanner sc = new Scanner(System.in);
        List<Fornecedor> fornecedores = new ArrayList<>();
        CadastroDeFornecedores acoesFornecedor = new CadastroDeFornecedores();
        int escolha;
		do{
            System.out.println("\nFornecedores da Lanchonete Salgados & Cia\n");
            System.out.println("Selecione uma opção:\n");
            System.out.println("1. Cadastrar Fornecedor");
            System.out.println("2. Listar Fornecedores");
            System.out.println("3. Remover Fornecedor");
            System.out.println("4. Pedidos para Fornecedor");
            System.out.println("5. Acompanhar Pedidos");
            System.out.println("6. Cancelar Pedidos para Fornecedor"); 
            System.out.println("7. Histórico de Pedidos"); 
            System.out.println("8. Retroceder ao menu anterior");
            System.out.println("9. Encerrar Programa\n");

            escolha = sc.nextInt();
            sc.nextLine();

            switch (escolha) {
                case 1:
                    acoesFornecedor.Cadastrar();
                    break;
                case 2:
                    acoesFornecedor.Listar();
                    break;
                case 3:
                    acoesFornecedor.Remover();
                    break;
                case 4:
                    CadastroDeFornecedores.efetuarPedidoAoFornecedor(sc);
                    break;
                case 5:
                	CadastroDeFornecedores.acompanharPedidos(sc);
                    break;
                case 6:
                	CadastroDeFornecedores.cancelarPedidosParaFornecedor(sc);
                    break;
                case 7:
                	CadastroDeFornecedores.historicoPedidos(sc);
                    break;
                case 8:
                	MenuGeral.menuGeral(nomeUsuario);
                case 9:
                    System.out.println("Programa finalizado.");
                    System.exit(0);
        	}
    	}while (escolha != 9);
    }
}