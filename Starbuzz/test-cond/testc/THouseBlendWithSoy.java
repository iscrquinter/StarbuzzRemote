package testc;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import starbuzz.beverage.Beverage;
import starbuzz.beverage.HouseBlend;
import starbuzz.decorator.Soy;

public class THouseBlendWithSoy {
	Beverage coffee;

	@Before
	public void setUp() throws Exception {
		coffee = new HouseBlend();
		
		coffee = new Soy(coffee);
	}

	@Test
	public void testCost() {
		assertTrue(coffee.cost()==1.04);
	}

}
