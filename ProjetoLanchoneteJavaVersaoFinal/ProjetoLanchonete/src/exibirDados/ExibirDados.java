package exibirDados;

import entidades.Cliente;
import entidades.Funcionario;
import entidades.Fornecedor;

public class ExibirDados{
	
    // Método para exibir os dados do cliente;
    public static void exibirDadosCliente(Cliente cliente) {
        System.out.println("Nome: " + cliente.getNome());
        System.out.println("CPF: " + cliente.getCpf());
        System.out.println("Endereço: " + cliente.getEndereco());
        System.out.println("Data de Nascimento: " + cliente.getDataNascimento());
        System.out.println("Telefone: " + cliente.getTelefone());
        System.out.println("E-mail: " + cliente.getEmail());
    }
    
    // Método para exibir os dados do funcionário
    public static void exibirDadosFuncionario(Funcionario funcionario) {
        System.out.println("Nome: " + funcionario.getNome());
        System.out.println("CPF: " + funcionario.getCpf());
        System.out.println("Endereço: " + funcionario.getEndereco());
        System.out.println("Data de Nascimento: " + funcionario.getDataNascimento());
        System.out.println("Cargo: " + funcionario.getCargo());
        System.out.println("Data de Admissão: " + funcionario.getDataAdmissao());
        System.out.println("Telefone: " + funcionario.getTelefone());
        System.out.println("E-mail: " + funcionario.getEmail());
        System.out.println("Salário: " + funcionario.getSalario());
        System.out.println("Turno: " + funcionario.getTurno());
        System.out.println("Tipo de Contrato: " + funcionario.getTipoContrato());
    }
    // Exibir as informações dos fornecedores 
    public static void exibirDadosFornecedor(Fornecedor fornecedor) {
        System.out.println("Nome: " + fornecedor.getNomeEmpresa());
        System.out.println("CNPJ: " + fornecedor.getCnpj());
        System.out.println("Endereço: " + fornecedor.getEndereco());
        System.out.println("Telefone: " + fornecedor.getTelefone());
        System.out.println("E-mail: " + fornecedor.getEmail());
        System.out.println("Produto(s) fornecido: " + fornecedor.getProdutoFornecido());
    }
}