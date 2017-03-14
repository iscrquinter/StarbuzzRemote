package testsc;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import starbuzz.beverage.HouseBlend;

public class THouseBlend {
	HouseBlend coffe;

	@Before
	public void setUp() throws Exception {
		coffe = new HouseBlend();
	}

	@Test
	public void testCost() {
		assertTrue(coffe.cost()==0.89);
	}

}
