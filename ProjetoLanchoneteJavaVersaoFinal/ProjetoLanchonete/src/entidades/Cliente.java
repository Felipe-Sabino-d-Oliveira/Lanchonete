package entidades;

//Classe cliente
public class Cliente extends Pessoa{

	// Construtor para inicializar os atributos de cliente;
	public Cliente(String nome, String cpf, String dataNascimento, String endereco, String telefone, String email){
		super(nome, dataNascimento, cpf, endereco, telefone, email);
	}
}