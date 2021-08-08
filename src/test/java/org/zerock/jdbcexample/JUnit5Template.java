package org.zerock.jdbcexample;

import java.sql.SQLException;
import java.util.concurrent.TimeUnit;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.MethodOrderer.OrderAnnotation;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;
import org.junit.jupiter.api.Timeout;

import lombok.NoArgsConstructor;
import lombok.extern.log4j.Log4j2;


@Log4j2
//@Log4j
@NoArgsConstructor

@TestMethodOrder(OrderAnnotation.class)
class JUnit5Template {

	
	
	@BeforeAll
	public static void beforeAll() {
		log.debug("beforeAll() invoked.");
		
	} // beforeAll
	
	
	@BeforeEach
	public void beforeEach() {
		log.debug("beforeEach() invoked.");
		
	} // beforeEach
	

	@Order(2)
	@Test
	@DisplayName("Test1.")
	@Timeout(value=3, unit=TimeUnit.SECONDS)
	public void testMethod1() throws SQLException {
		log.debug("testMethod1() invoked.");
		
	} // testMethod1
	

	@Order(1)
	@Test
	@DisplayName("Test2.")
	@Timeout(value=3, unit=TimeUnit.SECONDS)
	public void testMethod2() throws SQLException {
		log.debug("testMethod2() invoked.");
		
	} // testMethod2
	
	
	@AfterEach
	public void afterEach() {
		log.debug("afterEach() invoked.");
		
	} // afterEach
	
	
	@AfterAll
	public static void afterAll() {
		log.debug("afterAll() invoked.");
		
	} // afterAll
	

} // end class
