package testsc;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import starbuzz.beverage.DarkRoast;

public class TDarkRoast {
	DarkRoast coffe;

	@Before
	public void setUp() throws Exception {
		coffe = new DarkRoast();
	}

	@Test
	public void testCost() {
		assertTrue(coffe.cost()==0.99);
	}

}
