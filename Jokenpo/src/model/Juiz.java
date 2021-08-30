package model;

public class Juiz {
	//1 Pedra
	//2 Papel
	//3 Tesoura
	
	public String jogo(int escolhaJogador, int escolhaOponente) {
		int resultado = escolhaJogador - escolhaOponente;
		
		if(escolhaJogador == escolhaOponente) {
			return "Empate";
		}else if(resultado == -1 || resultado == 2) {
			return "Oponente Venceu!";
		}else {
			return "Jogador Venceu!";
		}
	}

}
