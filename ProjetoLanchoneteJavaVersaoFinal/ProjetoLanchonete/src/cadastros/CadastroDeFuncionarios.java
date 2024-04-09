package cadastros;

import java.util.List;
import java.util.ArrayList;
import java.util.Scanner;

import exibirDados.ExibirDados;
import entidades.Funcionario;
import interfaces.CadRemLis;
import utilitarios.LimparTela;

public class CadastroDeFuncionarios implements CadRemLis{
	
   	List<Funcionario> funcionarios = new ArrayList<Funcionario>();
	// Cadastrar funcionário 
	@Override
	public void Cadastrar() {
    	Scanner sc = new Scanner(System.in);

        LimparTela.DeixarVazio();
        
        System.out.println("\n--------- Cadastro de Funcionário ---------\n");
        System.out.print("Nome completo do funcionário: ");
        String nome = sc.nextLine();
        
        System.out.print("CPF do funcionário (000.000.000-00): ");
        String cpf = sc.nextLine();
        
        System.out.print("Endereço do funcionário (rua, bairro, cidade): ");
        String endereco = sc.nextLine();
        
        System.out.print("Data de nascimento do funcionário (00/00/0000): ");
        String dataNascimento = sc.nextLine();
        
        System.out.print("Cargo do funcionário: ");
        String cargo = sc.nextLine();
        
        System.out.print("Data de admissão do funcionário (00/00/0000): ");
        String dataAdmissao = sc.nextLine();
        
        System.out.print("Telefone do funcionário (00 00000-0000): ");
        String telefone = sc.nextLine();
        
        System.out.print("E-mail do funcionário: ");
        String email = sc.nextLine();
        
        System.out.print("Salário do funcionário: ");
        double salario = sc.nextDouble();
        sc.nextLine();
        
        System.out.print("Tipo de contrato do funcionário (integral/indeterminado/meio período/temporário/estágio/jovem aprendiz): ");
        String tipoContrato = sc.nextLine();
        
        System.out.print("Turno do funcionário (manhã/tarde/noite): ");
        String turno = sc.nextLine();

        Funcionario funcionario = new Funcionario(nome, dataNascimento, salario, cpf, endereco, cargo, dataAdmissao, telefone, email, turno, tipoContrato);
        funcionarios.add(funcionario);
        
        System.out.println("\nSituação: Funcionário cadastrado com sucesso!\n");
        ExibirDados.exibirDadosFuncionario(funcionario);       
	}

	@Override
	public void Remover() {
		
		Scanner sc = new Scanner(System.in);
    	
	    LimparTela.DeixarVazio();
	    System.out.println("--------- Remover Funcionário ---------\n");
	    System.out.print("Digite o CPF do funcionário a ser removido: ");
	    String cpf = sc.nextLine();
	
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

	@Override
	public void Listar() {
		
		LimparTela.DeixarVazio();        
        System.out.println("--------- Funcionários Cadastrados --------- \n");
        
        int numeroFuncionario = 1; // Inicializa o contador de funcionários
    
	    for (Funcionario funcionario : funcionarios) { // For each para percorrer os funcionários da lista 
	        System.out.println("Funcionário " + numeroFuncionario + "\n"); // Exibe o número do funcionário
	        ExibirDados.exibirDadosFuncionario(funcionario);//Exibe os dados do funcionário 
	        System.out.println("\n------------------------------------------\n");
	        numeroFuncionario++; // Incrementa o contador para o próximo funcionário
	    }
	}
}