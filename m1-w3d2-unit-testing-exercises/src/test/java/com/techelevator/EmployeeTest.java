package com.techelevator;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class EmployeeTest {

	Employee sut;
	
	@Before
	public void setUp() throws Exception {
		sut = new Employee(200, "Heather", "Rusnica", 100);
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void testFullName() {
		String result = sut.FullName();
		assertEquals("Rusnica, Heather", result);
	}
	
	@Test
	public void testAnnualSalary() {	
		sut.RaiseSalary(25.0);
		assertEquals(125, sut.getAnnualSalary(), 0.01);
	}
	
	@Test
	public void testAnnualSalaryZero() {	
		sut.RaiseSalary(0.0);
		assertEquals(100, sut.getAnnualSalary(), 0.01);
	}
	
	@Test
	public void testAnnualSalaryDoubleIncrease() {	
		sut.RaiseSalary(100.0);
		assertEquals(200, sut.getAnnualSalary(), 0.01);
	}
	

}
