import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class ContribuinteTest {

	@Test
	void testSetUf_Caso06_SC() {
		// Arrange
		Contribuinte c = new Contribuinte("Maria", "123", "SC", 40000);

		// Act
		String uf = c.getUf();

		// Assert
		assertEquals("SC", uf);
	}

	@Test
	void testSetUf_Caso07_PR() {
		// Arrange
		Contribuinte c = new Contribuinte("Maria", "123", "SC", 40000);

		// Act
		c.setUf("PR");

		// Assert
		assertEquals("PR", c.getUf());
	}
	
	@Test
	void testSetUf_Caso08_RS() {
		// Arrange
		Contribuinte c = new Contribuinte("Maria", "123", "RS", 40000);

		// Act
		String uf = c.getUf();

		// Assert
		assertEquals("RS", uf);
	}
	
	@Test
	void testSetUf_Caso09_rejeitaSP() {
		// Arrange
		Contribuinte c = new Contribuinte("Maria", "123", "SP", 40000);

		// Act
		String uf = c.getUf();

		// Assert
		assertNull(uf);
	}

	@Test
	void testSetUf_Caso10_rejeitaRJ() {
		// Arrange
		Contribuinte c = new Contribuinte("Maria", "123", "SC", 40000);

		// Act
		c.setUf("RJ");

		// Assert
		assertEquals("SC", c.getUf());
	}
	
	@Test
	void testSetRendaAnualNegativa() {
		// Arrange
		Contribuinte c = new Contribuinte("Maria", "123", "SC", 40000);

		// Act
		c.setRendaAnual(-818.50);

		// Assert
		assertEquals(40000, c.getRendaAnual());
	}

	@Test
	void testGetImpostoAPagar_Caso01_Renda3000_Imposto0() {
		// Arrange
		Contribuinte c = new Contribuinte("Maria", "123", "SC", 3000);

		// Act
		double imposto = c.getImpostoAPagar();

		// Assert
		assertEquals(0, imposto);
	}

	@Test
	void testGetImpostoAPagar_Caso02_Renda9000_Imposto522() {
		// Arrange
		Contribuinte c = new Contribuinte("Maria", "123", "SC", 9000);

		// Act
		double imposto = c.getImpostoAPagar();

		// Assert
		assertEquals(522, imposto);
	}

	@Test
	void testGetImpostoAPagar_Caso03_Renda10000_Imposto1500() {
		// Arrange
		Contribuinte c = new Contribuinte("Maria", "123", "SC", 10000);

		// Act
		double imposto = c.getImpostoAPagar();

		// Assert
		assertEquals(1500, imposto);
	}

	@Test
	void testGetImpostoAPagar_Caso04_Renda34911_Imposto9600() {
		// Arrange
		Contribuinte c = new Contribuinte("Maria", "123", "SC", 34911.73);

		// Act
		double imposto = c.getImpostoAPagar();

		// Assert
		assertEquals(9600.72, imposto, 0.009);
	}
}
