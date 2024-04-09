package entidades;

public abstract class Pessoa {

	// Class Pessoa;
	private String nome;
    private String cpf;
    private String endereco;
    private String dataNascimento;
    private String telefone;
    private String email;
    
	public Pessoa(String nome, String dataNascimento, String cpf, String endereco, String telefone, String email) {
		this.nome = nome;
		this.cpf = cpf;
		this.endereco = endereco;
		this.dataNascimento = dataNascimento;
		this.telefone = telefone;
		this.email = email;
	}
	// Métodos para acessar os atributos de cliente
	public String getNome(){
		return nome;
	}
	public String getCpf(){
		return cpf;
	}
	public String getEndereco(){
		return endereco;
	}
	public String getDataNascimento(){
		return dataNascimento;
	}
	public String getTelefone(){
		return telefone;
	}
	public String getEmail(){
		return email;
	}
}