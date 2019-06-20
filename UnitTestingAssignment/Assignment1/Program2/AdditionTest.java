package au2019.assignments;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.After;
import org.junit.Before;
import org.junit.jupiter.api.Test;


public class AdditionTest {
	private Addition addition;

	@Before
	public void setUp() {
		addition = new Addition();
	}

	@Test
	public void test() {
		int i = addition.add(3, 7);
		assertEquals(10, i);
	}

	/** * destroy the object */
	@After
	public void tearDown() {
		addition = null;
	}
}