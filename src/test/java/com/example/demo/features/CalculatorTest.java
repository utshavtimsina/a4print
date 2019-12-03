/*Copyright Information, This coded Section Was Originally desined by @UtshavTimsina
*/
/**
 * 
 */
package com.example.demo.features;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.Before;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;
import org.springframework.test.web.servlet.setup.StandaloneMockMvcBuilder;

import com.example.demo.controller.ViewController;
/**
 * @author utshav
 *
 */
@RunWith(SpringJUnit4ClassRunner.class)
class CalculatorTest {

	/**
	 * Test method for {@link com.example.demo.features.Calculator#addData(int, int)}.
	 */
	private StandaloneMockMvcBuilder mockMvc;
	
	@InjectMocks
	ViewController view;
	@Before
	public void init() {
		mockMvc = MockMvcBuilders.standaloneSetup(view);
		
	}
	@Test
	void testAddData() {
		Calculator calc = new Calculator();
		assertEquals(4, calc.addData(1, 3),"Test Failure Due to Unmatched Expected Vs Actual Data");
		//fail("Not yet implemented");
	}

}
