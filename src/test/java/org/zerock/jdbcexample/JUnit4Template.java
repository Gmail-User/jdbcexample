package org.zerock.jdbcexample;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import lombok.NoArgsConstructor;
import lombok.extern.log4j.Log4j;


//@Log4j2
@Log4j
@NoArgsConstructor
public class JUnit4Template {
	
	
	
	@Before
	public void setup() {
		log.debug("setup() inovked.");
		
	} // setup
	
	
	@Test
//	@Test(timeout=3000)
	public void testXXX1() {
		log.debug("testXXX1() inovked.");
		
	} // testXXX1
	
	
	@Test
	public void testXXX2() {
		log.debug("testXXX2() inovked.");
		
	} // testXXX2
	
	
	@After
	public void tearDown() {
		log.debug("tearDown() inovked.");
		
	} // tearDown
    
	
} // end class
