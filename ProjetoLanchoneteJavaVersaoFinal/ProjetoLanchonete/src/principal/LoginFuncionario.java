package principal;

import menu.MenuGeral;
import utilitarios.LimparTela;

import java.util.Scanner;

public class LoginFuncionario{
	
	private String[] nomes;
    private String[] senhas;

    public LoginFuncionario(int capacidade) {
        nomes = new String[capacidade];
        senhas = new String[capacidade];
    }

    public void adicionarCredencial(String nome, String senha, int indice) {
        nomes[indice] = nome;
        senhas[indice] = senha;
    }

    public boolean autenticar(String nome, String senha) {
        for (int i = 0; i < nomes.length; i++) {
            if (nome.equals(nomes[i]) && senha.equals(senhas[i])) {
                return true;
            }
        }
        return false;
    }

    public static void login(){
    	
        LoginFuncionario sistemaFuncionario = new LoginFuncionario(2);

        sistemaFuncionario.adicionarCredencial("atendente", "atend123", 0);
        sistemaFuncionario.adicionarCredencial("gerente", "ger123", 1);

        Scanner sc = new Scanner(System.in);
        String nomeUsuario;
        String senhaUsuario;

        boolean autenticado = false;

        do {
        	LimparTela.DeixarVazio();
        	
            System.out.println("Olá, seja bem-vindo à lanchonete Salgados & Cia!");
            System.out.println("\n-------------------- Login --------------------\n");

            System.out.print("Nome de Usuário: ");
            nomeUsuario = sc.nextLine();
            System.out.print("Senha: ");
            senhaUsuario = sc.nextLine();

            if (sistemaFuncionario.autenticar(nomeUsuario, senhaUsuario)) {
                if (nomeUsuario.equals("atendente")) {
                    System.out.println("\nFuncionário autenticado com sucesso!");
                    MenuGeral.menuGeral(nomeUsuario);
                } else if (nomeUsuario.equals("gerente")) {
                    System.out.println("\nGerente autenticado com sucesso!");
                    MenuGeral.menuGeral(nomeUsuario);
                }
                autenticado = true;
            } else {
                System.out.println("\nFalha no login, dados incorretos. Tente novamente.\n");
            }
        } while (!autenticado);
    }
}