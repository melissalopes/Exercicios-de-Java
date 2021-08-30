package model;

public class Jogador {
	
	private String nome;
	
	public Jogador() {};
	
	public Jogador(String nome) {
		this.nome = nome;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String escolha(int numero) {	
		switch(numero) {
		case 1:
			return "Pedra";
		case 2:
			return "Papel";
		case 3:
			return "Tesoura";
		}
		return "Escolha inválida";
	}
}
