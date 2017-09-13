package com.techelevator;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class AirplaneTest {
	
	Airplane sut;

	@Before
	public void setUp() throws Exception {
		sut = new Airplane(25, 75);
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void testAvailableFirstClassSeats(){
			int result = sut.getAvailableFirstClassSeats() - sut.getBookedFirstClassSeats();
			assertEquals(25, result);	
		}
	
	@Test
	public void testAvailableCoachSeats(){
			int result = sut.getAvailableCoachSeats() - sut.getBookedCoachSeats();
			assertEquals(75, result);	
		}
	
	@Test
	public void testOverbookFirstClass(){
		boolean result = sut.reserveSeats(true, 26);
		assertEquals(false, result);
	}
	
	@Test
	public void testOverbookCoach(){
		boolean result = sut.reserveSeats(false, 76);
		assertEquals(false, result);
	}
	
	@Test
	public void testAccurateCount(){
		boolean result = sut.reserveSeats(true, 1);
		assertEquals(true, result);
		assertEquals(24, sut.getAvailableFirstClassSeats());
	}
	
	@Test
	public void testAccurateCountHi(){
		boolean result = sut.reserveSeats(true, 25);
		assertEquals(true, result);
		assertEquals(0, sut.getAvailableFirstClassSeats());
	}
	
	@Test
	public void testAccurateCoachCount(){
		boolean result = sut.reserveSeats(false, 1);
		assertEquals(true, result);
		assertEquals(74, sut.getAvailableCoachSeats());
	}
	
	@Test
	public void testAccurateCoachCountLow(){
		boolean result = sut.reserveSeats(false, 0);
		assertEquals(true, result);
		assertEquals(75, sut.getAvailableCoachSeats());
	}
	
	@Test
	public void testAccurateCoachCountHi(){
		boolean result = sut.reserveSeats(false, 75);
		assertEquals(true, result);
		assertEquals(0, sut.getAvailableCoachSeats());
	}
	
	@Test
	public void testAccurateCoachCountTwice(){
		boolean result = sut.reserveSeats(false, 15);
		assertEquals(true, result);
		assertEquals(60, sut.getAvailableCoachSeats());
	
		boolean result2 = sut.reserveSeats(false, 60);
		assertEquals(true, result2);
		assertEquals(0, sut.getAvailableCoachSeats());
		}
	}
	

