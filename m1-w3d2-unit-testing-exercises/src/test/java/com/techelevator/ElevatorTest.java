package com.techelevator;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class ElevatorTest {
	Elevator sut;
	@Before
	public void setUp() throws Exception {
		sut = new Elevator(1, 10);
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void testShaftNumber() {
		sut.getShaftNumber();
		assertEquals(1, sut.getShaftNumber());
		}
		
	@Test
	public void testCurrentLevel() {
		sut.getCurrentLevel();
		assertEquals(1, sut.getCurrentLevel());
	}
		
	@Test
	public void testMoving() {
		sut.isMoving();
		assertEquals(false, sut.isMoving());
	}	
	
	@Test
	public void testCanGoUpOne() {
		sut.CloseDoor();
		boolean result = sut.GoUp(2);
		assertEquals(true, result);
		assertEquals(2, sut.getCurrentLevel());
	}	
	@Test
	public void testCanGoUpThroughCeiling() {
		sut.CloseDoor();
		boolean result = sut.GoUp(12);
		assertEquals(false, result);
		assertEquals(1, sut.getCurrentLevel());
	}
	@Test
	public void testCanGoDownThroughFloor() {
		sut.CloseDoor();
		boolean result = sut.GoDown(-1);
		assertEquals(false, result);
		assertEquals(1, sut.getCurrentLevel());
	}
	@Test
	public void testUpAndDown() {
		sut.CloseDoor();
		boolean result = sut.GoUp(5);
		assertEquals(true, result);
		assertEquals(5, sut.getCurrentLevel());
		
		sut.CloseDoor();
		boolean result2 = sut.GoDown(4);
		assertEquals(true, result2);
		assertEquals(4, sut.getCurrentLevel());
		}	
	@Test
	public void testGoUpWithDoorOpen() {
		sut.OpenDoor();
		boolean result = sut.GoUp(3);
		assertEquals(false, result);
		assertEquals(1, sut.getCurrentLevel());
	}
	
	}
