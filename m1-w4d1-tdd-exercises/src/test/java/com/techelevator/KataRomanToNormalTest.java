package com.techelevator;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class KataRomanToNormalTest {

	KataRomanToNormal sut;
	
	@Before
	public void setUp() throws Exception {
		sut = new KataRomanToNormal();
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void testConvertI() {	
		assertEquals(1, sut.main("I"));
		}

	@Test
	public void testConvertV() {	
		assertEquals(5, sut.main("V"));
		}

	@Test
	public void testConvertX() {	
		assertEquals(10, sut.main("X"));
		}

	
	@Test
		public void testtoFindFour(){
		assertEquals(true, sut.findFour("IV"));
	}
	
	@Test
		public void testtoFindNine(){
		assertEquals(true, sut.findNine("IX"));
	}
	
	@Test
		public void testtoFindForty(){
		assertEquals(true, sut.findForty("XL"));
	}
	
	@Test
		public void testtoFindNinety(){
		assertEquals(true, sut.findNinety("XC"));
	}
	
	@Test
		public void testtoFindFourhundred(){
		assertEquals(true, sut.findFourhundred("CD"));
	}
	
	@Test
		public void testtoFindFourhundredInBig(){
		assertEquals(true, sut.findFourhundred("CCDII"));
	}
	
	@Test
	public void testtoFindFourInBig(){
	assertEquals(true, sut.findFour("CLXXXIV"));
}

	@Test
		public void testtoFindNinehundred(){
		assertEquals(true, sut.findNinehundred("CM"));
	}

	@Test
		public void testFindEight(){
		assertEquals(8, sut.findValue("VIII"));
	}
	
	@Test
		public void testFindEighteight(){
		assertEquals(88, sut.findValue("LXXXVIII"));
	}
	
	@Test
		public void testFind184(){
		assertEquals(184, sut.main("CLXXXIV"));
	}

	@Test
		public void testFind2306(){
		assertEquals(2306, sut.findValue("MMCCCVI"));
	}

	@Test
	public void testFind3000(){
	assertEquals(3000, sut.findValue("MMM"));
}

	@Test
	public void testFind1892(){
	assertEquals(1892, sut.main("MDCCCXCII"));
}

	
}
