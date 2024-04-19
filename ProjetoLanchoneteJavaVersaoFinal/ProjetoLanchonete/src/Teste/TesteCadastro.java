package Teste;

import entidades.Cliente;
import entidades.Fornecedor;
import entidades.Funcionario;
import exibirDados.ExibirDados;
import org.junit.jupiter.api.Test;
import produto.Produto;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.assertNotNull;

public class TesteCadastro {

    //Test OK!

    @Test
    void TesteCadastroCliente() {

        List<Cliente> clientes = new ArrayList<Cliente>();
        System.out.println("\n--------- Cadastro de Cliente ---------\n");

        String cpf = "123.456.789-00";
        System.out.println("CPF do cliente (000.000.000-00): " + cpf);

        String nome = "João Silva";
        System.out.println("Nome completo do cliente: " + nome);

        String dataNascimento = "17/01/2004";
        System.out.println("Data de nascimento do cliente (00/00/0000): " + dataNascimento);

        String endereco = "Rua João Guimarães,Peixinho,Xique-Xique";
        System.out.println("Endereço do cliente (rua, bairro, cidade): " + endereco);

        String telefone = "93 2395-7237";
        System.out.println("Telefone do cliente (00 00000-0000): " + telefone);

        String email = "Joaozinho17@gmail.com";
        System.out.println("E-mail do cliente: " + email);

        Cliente cliente = new Cliente(nome, cpf, dataNascimento, endereco, telefone, email);
        clientes.add(cliente);

        System.out.println("\nSituação: Cliente cadastrado com sucesso!\n");
        ExibirDados.exibirDadosCliente(cliente);
        assertNotNull(clientes);
    }


    //Test OK!
    @Test
    void TesteCadastroFuncionario() {
        List<Funcionario> funcionarios = new ArrayList<Funcionario>();

        System.out.println("\n--------- Cadastro de Funcionário ---------\n");


        String nome = "Carlos Cesar";
        System.out.println("Nome completo do funcionário: " + nome);

        String cpf = "987.654.321-01";
        System.out.println("CPF do funcionário (000.000.000-00): " + cpf);

        String endereco ="Rua Cornélio Barros, Jardim Planalto, Xique-Xique";
        System.out.println("Endereço do funcionário (rua, bairro, cidade): " + endereco);

        String dataNascimento ="25/03/1999";
        System.out.println("Data de nascimento do funcionário (00/00/0000): " + dataNascimento);

        String cargo = "Cozinheiro";
        System.out.println("Cargo do funcionário: " + cargo);

        String dataAdmissao = "01/05/2015";
        System.out.println("Data de admissão do funcionário (00/00/0000): " + dataAdmissao);

        String telefone = "94 985403-5525";
        System.out.println("Telefone do funcionário (00 00000-0000): " + telefone);

        String email = "carlinhosgera@gmail.com";
        System.out.println("E-mail do funcionário: " + email);

        double salario = 1277.58;
        System.out.printf("Salário do funcionário: R$ %.2f", salario);

        String tipoContrato = "Integral";
        System.out.println("Tipo de contrato do funcionário (integral/indeterminado/meio período/temporário/estágio/jovem aprendiz): " + tipoContrato);

        String turno = "Manhã";
        System.out.println("Turno do funcionário (manhã/tarde/noite): " + turno);

        Funcionario funcionario = new Funcionario(cpf, nome, salario, dataNascimento, telefone, endereco, cargo, dataAdmissao, email, turno, tipoContrato);
        funcionarios.add(funcionario);
        assertNotNull(funcionarios);

        System.out.println("\nSituação: Funcionário cadastrado com sucesso!\n");
        ExibirDados.exibirDadosFuncionario(funcionario);
    }

    //Test OK!
    @Test
    void TesteCadastroFornecedor() {

        List<Fornecedor> fornecedores = new ArrayList<Fornecedor>();

        System.out.println("\n--------- Cadastro de Fornecedor ---------\n");

        String nomeEmpresa = "SalgadoXX";
        System.out.println("Nome completo do fornecedor: " + nomeEmpresa);

        String cnpj =  "74.551.464/0001-22";
        System.out.println("CNPJ do fornecedor (00.000.000/0001-00): " + cnpj);

        String endereco = "Rua Aqueduto Reinaldinho,Lar dos Mariscos,Xique-Xique";
        System.out.println("Endereço do fornecedor (rua, bairro, cidade): " + endereco);

        String telefone = "93 2341-1824";
        System.out.println("Telefone do fornecedor (00 00000-0000): " + telefone);

        String email =  "salgadoscia@gmail.com";
        System.out.println("E-mail do fornecedor: " + email);

        String produtoFornecido = "Coxinha";
        System.out.println("Produto(s) fornecido pelo fornecedor (separe por vírgula): " + produtoFornecido);

        Fornecedor fornecedor = new Fornecedor(cnpj, nomeEmpresa, endereco, telefone, email, produtoFornecido);
        fornecedores.add(fornecedor);

        System.out.println("\nSituação: Fornecedor cadastrado com sucesso!\n");
        ExibirDados.exibirDadosFornecedor(fornecedor);

        assertNotNull(fornecedores);
        System.out.println("\n------------------------------------------");
    }

    //Teste OK!
    @Test
    void TesteCadastrarProdutoNoEstoque(){

        List<Produto> produtos = new ArrayList<>();

        String nome = "Pizza brotinho";
        System.out.println("Nome do produto: " + nome);

        double preco = 6.50;
        System.out.printf("Preço do produto: R$ %.2f\n", preco);

        int quantidade = 15;
        System.out.println("Quantidade do produto no estoque: " + quantidade);

        String validade = "19/07/2024";
        System.out.println("Validade do produto (00/00/0000): " + validade);

        String fornecedor = "SalgadosXX";
        System.out.println("Fornecedor do produto: " + fornecedor);

        produtos.add(new Produto(nome, preco, quantidade, validade, fornecedor));
        System.out.println("\nProduto adicionado ao estoque.");
        System.out.println("\n------------------------------------------");
    }
}