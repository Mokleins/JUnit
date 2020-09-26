import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class GradeBookTester {
	GradeBook g1, g2;
	@BeforeEach
	public void setUp() throws Exception {
		g1 = new GradeBook(5);
		g1.addScore(50.0);
		g1.addScore(75.0);
		g1.addScore(60.0);
		g1.addScore(30.0);
		g1.addScore(22.0);
		
		g2 = new GradeBook(5);
		g2.addScore(54.0);
		g2.addScore(70.0);
		g2.addScore(63.0);
		g2.addScore(39.0);
		g2.addScore(21.0);
	}

	@AfterEach
	public void tearDown() throws Exception {
		g1 = null;
		g2 = null;
	}

	@Test
	public void testAddScore() {
		assertTrue(g1.toString().equals(" 50.0 75.0 60.0 30.0 22.0 "));
		assertTrue(g2.toString().equals(" 54.0 70.0 63.0 39.0 21.0 "));

	}

	@Test
	public void testSum() {
		assertEquals(237, g1.sum(), .0001);
		assertEquals(247, g2.sum(), .0001);
	}

	@Test
	public void testMinimum() {
		assertEquals(22.0, g1.minimum(), .0001);
		assertEquals(21.0, g2.minimum(), .0001);
	}

	@Test
	public void testFinalScore() {
		assertEquals(215.0, g1.finalScore(), .001);
		assertEquals(226.0, g2.finalScore(), .001);
	}

}
