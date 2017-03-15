package testc;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import starbuzz.beverage.Beverage;
import starbuzz.beverage.DarkRoast;
import starbuzz.decorator.Milk;

public class TDarkRoastWithMilk {
	
	Beverage coffee;

	@Before
	public void setUp() throws Exception {
		coffee = new DarkRoast();
		coffee = new Milk(coffee);
	}

	@Test
	public void testCost() {
		assertTrue(coffee.cost()==1.09);
	}

}
