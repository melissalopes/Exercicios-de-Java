import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

import model.Jogador;
import model.Juiz;

public class JokenpoTest {
	
	private Jogador jogador;
	private Juiz juiz;
	
	@Before
	public void update() {
		jogador = new Jogador();
		juiz = new Juiz();
	}
	
	@Test
	public void deveRetornarOQueOJogadorEscolheu() throws Exception {
		assertEquals("Tesoura", jogador.escolha(3));
	}
	 
	@Test
	public void deveRetornarEmpate() throws Exception {
		assertEquals("Empate", juiz.jogo(1, 1));
	}
	 
	@Test 
	public void deveRetornarQueOJogadorVenceu() throws Exception {
		assertEquals("Jogador Venceu!", juiz.jogo(2, 1));
		assertEquals("Jogador Venceu!", juiz.jogo(3, 2));
		assertEquals("Jogador Venceu!", juiz.jogo(1, 3));
	}
	
	@Test
	public void deveRetornarQueOOponenteVenceu() throws Exception {
		assertEquals("Oponente Venceu!", juiz.jogo(1, 2));
		assertEquals("Oponente Venceu!", juiz.jogo(2, 3));
		assertEquals("Oponente Venceu!", juiz.jogo(3, 1));
	}
}
