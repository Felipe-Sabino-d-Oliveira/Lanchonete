package menu;

import java.util.Scanner;

import cadastros.CadastroDeClientes;

public class MenuCliente {

	//menu do cliente;
	
    public static void menuCliente(String nomeUsuario){
    	
        Scanner sc = new Scanner(System.in);
        CadastroDeClientes acoesCliente = new CadastroDeClientes();

        int escolha;
        
		do{
            System.out.println("Clientes da Lanchonete Salgados & Cia");
            System.out.println("\nSelecione uma opção: \n");
            System.out.println("1. Cadastrar Cliente");
            System.out.println("2. Listar Clientes");
            System.out.println("3. Remover Cliente");
            System.out.println("4. Retroceder ao menu anterior");
            System.out.println("5. Encerrar Programa\n");

            escolha = sc.nextInt();
            sc.nextLine();

            switch (escolha) {
                case 1:
                    acoesCliente.Cadastrar();
                    break;
                case 2:
                	acoesCliente.Listar();
                    break;
                case 3:
                    acoesCliente.Remover();
                    break;
                case 4:
                	MenuGeral.menuGeral(nomeUsuario);
                case 5:
                    System.out.println("Programa finalizado.");
                    System.exit(0);
            }
        }while(escolha != 5);
    }
}