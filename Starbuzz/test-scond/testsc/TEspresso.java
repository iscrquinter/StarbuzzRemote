package testsc;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import starbuzz.beverage.Espresso;

public class TEspresso {
	Espresso coffe;

	@Before
	public void setUp() throws Exception {
		coffe = new Espresso();
	}

	@Test
	public void testCost() {
		assertTrue(coffe.cost()==1.99);
	}

}
