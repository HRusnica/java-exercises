package com.techelevator;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class TelevisionTest {

	Television sut;
	
	@Before
	public void setUp() throws Exception {
		sut = new Television();
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void testTurnOn() {
		sut.TurnOn();
		assertEquals(true, sut.IsOn());	
	}
	
	@Test
	public void testChangeChannel() {
		sut.TurnOn();
		sut.ChangeChannel(12);
		assertEquals(12, sut.getSelectedChannel());	
	}
	
	@Test
	public void testChangeChannel19() {
		sut.TurnOn();
		sut.ChangeChannel(19);
		assertEquals(3, sut.getSelectedChannel());	
	}
	
	@Test
	public void testChangeChannel2() {
		sut.TurnOn();
		sut.ChangeChannel(2);
		assertEquals(3, sut.getSelectedChannel());	
	}
	
	@Test
	public void testResets() {
		sut.TurnOn();
		assertEquals(3, sut.getSelectedChannel());
		assertEquals(2, sut.getCurrentVolume());
	}
	@Test
	public void testIncreaseVolume() {
		sut.TurnOn();
		sut.RaiseVolume();
		assertEquals(3, sut.getCurrentVolume());
	}
	
	@Test
	public void testDecreaseVolume() {
		sut.TurnOn();
		sut.LowerVolume();
		assertEquals(1, sut.getCurrentVolume());
	}
	
	@Test
	public void testDecreaseVolumeMin() {
		sut.TurnOn();
		sut.LowerVolume();
		sut.LowerVolume();
		sut.LowerVolume();
		assertEquals(0, sut.getCurrentVolume());
	}
	
	@Test
	public void testIncreaseVolumeMax() {
		sut.TurnOn();
		sut.RaiseVolume();
		sut.RaiseVolume();
		sut.RaiseVolume();
		sut.RaiseVolume();
		sut.RaiseVolume();
		sut.RaiseVolume();
		sut.RaiseVolume();
		sut.RaiseVolume();
		sut.RaiseVolume();
		assertEquals(10, sut.getCurrentVolume());
	}
	
	
}
