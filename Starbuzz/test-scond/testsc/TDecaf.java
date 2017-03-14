package testsc;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import starbuzz.beverage.Decaf;

public class TDecaf {
	Decaf coffe;

	@Before
	public void setUp() throws Exception {
		coffe = new Decaf();
	}

	@Test
	public void testCost() {
		assertTrue(coffe.cost()==1.05);
	}

}
