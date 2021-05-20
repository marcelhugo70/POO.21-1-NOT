import static org.junit.jupiter.api.Assertions.*;

import java.time.LocalDate;

import org.junit.jupiter.api.Test;

class TransatlanticoEBoteTest {

	@Test
	void testVerificaSeguranca01() {
		BoteSalvaVidas b = new BoteSalvaVidas("BSV001", 28, true,5,28);
		assertEquals("Bote OK",b.verificaSeguranca());
	}

	@Test
	void testVerificaSeguranca02() {
		BoteSalvaVidas b = new BoteSalvaVidas("BSV244", 122, false,12,120);
		assertEquals("Insuficiência de 2 coletes salva-vidas",b.verificaSeguranca());
	}
	
	@Test
	void testVerificaSeguranca03() {
		Transatlantico t = new Transatlantico("FTR 1267", 2365, "Titanic II", LocalDate.of(2010, 05, 10));
		
		BoteSalvaVidas b = new BoteSalvaVidas("BSV244", 122, false,12,120);
		t.addBote(b);
		
		t.addBote("BSV201", 28, true,5,28);
		
		assertEquals("CUIDADO: navio em perigo",t.verificaSeguranca());
	}

	@Test
	void testVerificaSeguranca04() {
		Transatlantico t = new Transatlantico("FTR 1267", 2365, "Titanic II", LocalDate.of(2022, 05, 10));
		
		BoteSalvaVidas b = new BoteSalvaVidas("BSV244", 122, false,12,120);
		t.addBote(b);
		
		t.addBote("BSV201", 28, true,5,28);
		
		assertEquals("ALERTA: navio necessitando de mais botes!",t.verificaSeguranca());
	}
	
	@Test
	void testVerificaSeguranca05() {
		Transatlantico t = new Transatlantico("FTR 1267", 236, "Titanic II", LocalDate.of(2022, 05, 10));
		
		BoteSalvaVidas b = new BoteSalvaVidas("BSV244", 122, false,12,120);
		t.addBote(b);
		
		t.addBote("BSV201", 114, true,5,28);
		
		assertEquals("Está em condições adequadas de segurança",t.verificaSeguranca());
	}
	
	

}
