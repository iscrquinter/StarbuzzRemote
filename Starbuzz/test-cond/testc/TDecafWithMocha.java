package testc;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import starbuzz.beverage.Beverage;
import starbuzz.beverage.Decaf;
import starbuzz.decorator.Mocha;

public class TDecafWithMocha {
	
	Beverage coffee;

	@Before
	public void setUp() throws Exception {
		coffee = new Decaf();
		coffee = new Mocha(coffee);
	}

	@Test
	public void testCost() {
		assertTrue(coffee.cost()==1.25);
	}

}
