package Teste;

import entidades.Cliente;
import entidades.Fornecedor;
import entidades.Funcionario;
import org.junit.Test;
import utilitarios.LimparTela;

import java.util.ArrayList;
import java.util.List;

public class TesteRemocoes {

    //Teste OK!

    @Test
    public void RemoverCliente(){

        List<Cliente> clientes = new ArrayList<Cliente>();

        Cliente cli = new Cliente("Felipe", "000.000.000-00", "0", "0", "0", "0");
        clientes.add(cli);

        System.out.println("--------- Remover Cliente ---------\n");

        // Verifica se a lista de clientes está vazia
        if (clientes.isEmpty()){
            System.out.println("Não há clientes cadastrados para remover.\n");
            System.out.println("-------------------------------------\n");
        }
        else {
            String cpf = "000.000.000-00";
            System.out.println("O CPF do cliente a ser removido (000.000.000-00): " + cpf);

            Cliente clienteParaRemover = null; //Null enquanto o cliente não for encontrado

            for (Cliente cliente : clientes) { // For each para percorrer todos os clientes da lista
                if (cliente.getCpf().equals(cpf)) { // Verifica se o CPF digitado correspondente ao CPF do cliente que deseja ser excluído
                    clienteParaRemover = cliente; // Cliente desejado excluído da lista
                    break;
                }
            }
            if (clienteParaRemover != null) { //Null enquanto o cliente não for encontrado
                String nomeCliente = clienteParaRemover.getNome(); //Obtém o nome do cliente que deseja ser excluído
                clientes.remove(clienteParaRemover); // Cliente excluído da lista
                System.out.println("\nSituação: Cliente " + nomeCliente + " com CPF " + cpf + " foi excluído com sucesso!\n");
                System.out.println("-------------------------------------\n");
            } else {
                System.out.println("\nSituação: Cliente não encontrado!\n");
                System.out.println("-------------------------------------\n");
            }
        }

    }

    //Teste OK!
    @Test
    public void RemoverFornecedor(){

        List<Fornecedor> fornecedores = new ArrayList<Fornecedor>();

        Fornecedor forn = new Fornecedor("00000000-0000", "SalgadosXX", "0", "0", "0", "0");
        fornecedores.add(forn);

        if (fornecedores.isEmpty()) {
            System.out.println("Nenhum fornecedor cadastrado para excluir.");
            System.out.println("\n------------------------------------------");
        } else {
            String cnpj = "00000000-0000";
            System.out.println("Digite o CNPJ do fornecedor que deseja remover: " + cnpj);

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

    //Teste OK!
    @Test
    public void RemoverFuncionario(){

        List<Funcionario> funcionarios = new ArrayList<Funcionario>();

        Funcionario func = new Funcionario("000.000.000-00", "José Yuri", 0, "0", "0", "0", "0", "0", "0", "0", "0");
        funcionarios.add(func);

        LimparTela.DeixarVazio();
        System.out.println("--------- Remover Funcionário ---------\n");
        String cpf = "000.000.000-00";
        System.out.println("Digite o CPF do funcionário a ser removido: " + cpf);

        Funcionario funcionarioParaRemover = null; // Indicar que nenhum funcionário foi encontrado para remoção
        for (Funcionario funcionario : funcionarios) { //For each para percorrer os funcionários da lista, um por um
            if (funcionario.getCpf().equals(cpf)) { //Verifica se o CPF digitado pelo usuário corresponde ao CPF do funcionário que deseja excluir da lista
                funcionarioParaRemover = funcionario; // Já ciente qual é o funcionário a ser excluído da lista
                break;
            }
        }

        if (funcionarioParaRemover != null) { // Verifica se o funcionário foi encontrado na lista
            String nomeFuncionario = funcionarioParaRemover.getNome(); // Obtém o nome do funcionário que vai ser excluído
            funcionarios.remove(funcionarioParaRemover); // Remove o funcionário da lista
            System.out.println("\nSituação: Funcionário " + nomeFuncionario + " com CPF " + cpf + " foi excluído com sucesso!\n");
            System.out.println("-------------------------------------\n");
        } else {
            System.out.println("\nSituação: Funcionário não encontrado!\n");
            System.out.println("-------------------------------------\n");
        }
    }
}
