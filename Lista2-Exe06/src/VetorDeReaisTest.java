import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class VetorDeReaisTest {

	@Test
	final void testCase01_dividir() {
		VetorDeReais vetor1 = new VetorDeReais(3);
		vetor1.setValor(2, 0);
		vetor1.setValor(-1, 1);
		vetor1.setValor(3.5, 2);
		VetorDeReais vetor2 = new VetorDeReais(1);
		vetor2.setValor(3, 0);
		assertNull(vetor1.dividir(vetor2));
	}

	@Test
	final void testCase02_dividir() {
		// Arrange
		VetorDeReais vetor1 = new VetorDeReais(3);
		vetor1.setValor(2, 0);
		vetor1.setValor(-1, 1);
		vetor1.setValor(3.5, 2);
		VetorDeReais vetor2 = new VetorDeReais(3);
		vetor2.setValor(3, 0);
		vetor2.setValor(2, 1);
		vetor2.setValor(1, 2);
		VetorDeReais expected = new VetorDeReais(3);
		expected.setValor(0.666666666666, 0);
		expected.setValor(-0.5, 1);
		expected.setValor(3.5, 2);
		
		//Act
		VetorDeReais result = vetor1.dividir(vetor2);
		
		//Assert
		assertEquals(expected.getTamanho(), result.getTamanho());
		for (int i = 0; i < expected.getTamanho(); i++) {
			assertEquals(expected.getValor(i), result.getValor(i), 0.00000001);
		}
	}
}
