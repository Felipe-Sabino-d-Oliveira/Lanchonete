package Teste;

import static org.junit.jupiter.api.Assertions.*;
import entidades.Cliente;
import entidades.Fornecedor;
import entidades.Funcionario;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

public class TesteListagens {

    @Test
    void ListarClientes(){
        List<Cliente> clientes = new ArrayList<Cliente>();

        Cliente cliente = new Cliente("João Silva","123.456.789-00","17/01/2004",
                "Rua João Guimarães,Peixinho,Xique-Xique","93 2395-7237","Joaozinho17@gmail.com");

        clientes.add(cliente);
        assertNotNull(clientes);
    }

    @Test
    void ListaFuncionarios(){
        List<Funcionario> funcionarios = new ArrayList<Funcionario>();

        Funcionario funcionario = new Funcionario("987.654.321-01","Carlos Cesar",1277.58,
                "25/03/1999","94 985403-5525","Rua Cornélio Barros, Jardim Planalto, Xique-Xique","Cozinheiro","01/05/2015","carlinhosgera@gmail.com","Integral","CLT");

        funcionarios.add(funcionario);
        assertNotNull(funcionarios);
    }

    @Test
    void ListaFornecedores(){
        List<Fornecedor> fornecedores = new ArrayList<Fornecedor>();

        Fornecedor fornecedor = new Fornecedor("74.551.464/0001-22","SalgadoXX","Rua Aqueduto Reinaldinho,Lar dos Mariscos,Xique-Xique",
                "93 2341-1824","salgadoscia@gmail.com","Coxinha");


        fornecedores.add(fornecedor);
        assertNotNull(fornecedores);
    }
    @Test
    void ListaProdutos(){
        List<Produto> produtosDisponiveis = new ArrayList<>();

        Produto produto = new Produto("Coxinha",15,50,"12/12/1999",
                "Beyond");


        produtosDisponiveis.add(produto);
        assertNotNull(produtosDisponiveis);

    }
}
}

