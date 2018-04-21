/**
 * 
 */
package com.sy.romannums.service;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.fail;

import org.junit.Before;
import org.junit.Test;

/**
 * @author sinan.yumak
 *
 */
public class RomanNumsServiceTest {

	private RomanNumsService numsService;
	
	
	@Before
	public  void setUp() {
		numsService = new RomanNumsService();
	}
	
	
	@Test
	public void givenAValidRangedNumber_ThenItShouldReturnRomanNumber() {
		
		// given 
		Integer number = 1231;
		
		// when
		String result = numsService.toRomanNumber( number );

		// then 
		assertEquals( result, "MCCXXXI" );
	}


	@Test
	public void givenAnExceptionalNumber_ThenItShouldReturnRomanNumber() {
	
		// given 
		Integer number = 90;
		
		// when 
		String result = numsService.toRomanNumber( number );

		// then 
		assertEquals( result, "XC" );
	}
	
	
	@Test
	public void givenAnInvalidRangedNumber_ThenItShouldThrowException() {
		
		// given 
		Integer number = 5000;
		
		try {
			// when
			numsService.toRomanNumber( number );
			
			// then 
			fail();
		} catch ( Exception ex ) {
			
		}

	}


}
