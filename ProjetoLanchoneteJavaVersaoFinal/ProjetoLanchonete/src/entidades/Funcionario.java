package entidades;

public class Funcionario extends Pessoa{
	//Classe Funcionario;
    private String cargo;
    private String dataAdmissao;
    private double salario;
    private String turno;
    private String tipoContrato;

    //Construtor para inicializar os atributos de funcionário
    public Funcionario(String cpf, String nome, double salario, String dataNascimento, String telefone, String endereco, String cargo, String dataAdmissao, String email, String turno, String tipoContrato){
		super(nome, dataNascimento, cpf, endereco, telefone, email);

    	this.cargo = cargo;
    	this.dataAdmissao = dataAdmissao;
    	this.salario = salario;
    	this.turno = turno;
    	this.tipoContrato = tipoContrato;
    }

	//Métodos para acessar os atributos de funcionário
	public String getCargo(){
    	return cargo;
	}

    public String getDataAdmissao(){
    	return dataAdmissao;
	}

	public double getSalario(){
    	return salario;
	}

    public String getTurno(){
    	return turno;
	}

    public String getTipoContrato(){
    	return tipoContrato;
    }
}