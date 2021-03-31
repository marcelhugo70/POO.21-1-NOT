import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class InteiroPositivoTest {

	@Test
	void testFatorial_Caso01() {
		InteiroPositivo i = new InteiroPositivo();
		i.setValor(10);
		long fatorial = i.fatorial();
		assertEquals(3628800, fatorial);
	}

	@Test
	void testFatorial_Caso02() {
		InteiroPositivo i = new InteiroPositivo();
		i.setValor(20);
		assertEquals(2432902008176640000L, i.fatorial());
	}
	
	@Test
	void testDivisoresInteiros_Caso03() {
		InteiroPositivo i = new InteiroPositivo();
		i.setValor(14);
		assertEquals("Os divisores são 1, 2, 7, 14 e a quantidade de divisores é 4", i.divisoresInteiros());
	}

	@Test
	void testDivisoresInteiros_Caso04() {
		InteiroPositivo i = new InteiroPositivo();
		i.setValor(18);
		assertEquals("Os divisores são 1, 2, 3, 6, 9, 18 e a quantidade de divisores é 6", i.divisoresInteiros());
	}
	
	//{ 1, 1, 2, 3, 5, 8, 13, 21, 34}
	@Test
	void testFibonacci_Caso05() {
		InteiroPositivo i = new InteiroPositivo();
		i.setValor(9);
		int[] vetorResultante = i.fibonacci();
		int[] vetorEsperado = { 1, 1, 2, 3, 5, 8, 13, 21, 34};
		assertArrayEquals(vetorEsperado, vetorResultante);
	}
	
	@Test
	void testFibonacci_Caso06() {
		InteiroPositivo i = new InteiroPositivo();
		i.setValor(15);
		int[] vetorResultante = i.fibonacci();
		int[] vetorEsperado = { 1, 1, 2, 3, 5, 8, 13, 21, 34, 55, 89, 144, 233, 377, 610};
		assertArrayEquals(vetorEsperado, vetorResultante);
	}
}
