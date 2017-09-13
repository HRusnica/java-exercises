package com.techelevator;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class SmartPhoneTest {

	SmartPhone sut;
	
	@Before
	public void setUp() throws Exception {
		sut = new SmartPhone("5558675309", "Verizon");
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void testBatteryCharge() {
		sut.RechargeBattery();
		int result = sut.getBatteryCharge();
		assertEquals(100, result);
	}
	
	@Test
	public void testCarrier(){
		sut.getCarrier();
		assertEquals("Verizon", sut.getCarrier());
	}
	
	@Test
	public void testPhoneNumber(){
		sut.getPhoneNumber();
		assertEquals("5558675309", sut.getPhoneNumber());
	}
	
	@Test
	public void testHangUp(){
		sut.HangUp();
		assertEquals(false, sut.isOnCall());
	}

	@Test
	public void testPickUpCall(){
		sut.AnswerPhone();
		assertEquals(true, sut.isOnCall());
	}
	
	@Test
	public void testTimeToBatteryDrain(){
		sut.Call("1234567890", 100);
		assertEquals(true, sut.isOnCall());
		assertEquals(0, sut.getBatteryCharge());
	}
	
	@Test
	public void testTimeToBatteryDrainMin(){
		sut.Call("1234567890", 0);
		assertEquals(false, sut.isOnCall());
		assertEquals(100, sut.getBatteryCharge());
	}
	
	@Test
	public void testTimeToBatteryDrainOverMax(){
		sut.Call("1234567890", 150);
		assertEquals(false, sut.isOnCall());
		assertEquals(0, sut.getBatteryCharge());
	}
	
	@Test
	public void testShortNumber(){
		sut.Call("1234567", 50);
		assertEquals(false, sut.isOnCall());
		assertEquals(100, sut.getBatteryCharge());
	}
	
}
