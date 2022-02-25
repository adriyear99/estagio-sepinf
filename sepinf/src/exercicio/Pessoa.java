package exercicio;

public class Pessoa {
	
	public String nome;
	public int idade;
	
	// construtor
	public Pessoa(String nome) {
		this.nome = nome;
	}
	
	// getters e setters
	public String getNome() {
		return this.nome;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public int getIdade() {
		return this.idade;
	}
	
	public void setIdade(int idade) {
		this.idade = idade;
	}

}
