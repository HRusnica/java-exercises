package com.techelevator;

import org.junit.*;
import static org.junit.Assert.*;

import java.util.ArrayList;

public class KataRomanNumeralsTest {

KataRomanNumerals sut;

	@Before
	public void setUp(){
	sut = new KataRomanNumerals();
	}
	
	@Test
public void testConvertOne(){
		assertEquals("IV", sut.convertOnes(4));
	}

	@Test
	public void testConvertFive(){
			assertEquals("V", sut.convertOnes(5));
		}
	
	@Test
	public void testConvertEight(){
			assertEquals("VIII", sut.convertOnes(8));
		}
	
	@Test
	public void testConvertNine(){
			assertEquals("IX", sut.convertOnes(9));
		}
	@Test
	public void testConvertToArray(){
			assertArrayEquals(new int[] {1, 0}, sut.convertToNumArray(10));
		}
	
	@Test
	public void testFindValues(){
			assertEquals("I", sut.findValues(1));
}
	@Test
	public void testConver30(){
			assertEquals("XXX", sut.convertTens(3));
		}
	
	@Test
	public void testConvert500(){
		assertEquals("D", sut.convertHundreds(5));
	}
	
	@Test
	public void testConvert2000(){
		assertEquals("MM", sut.convertThousands(2));
	}
	
	@Test
	public void testEverything(){
		assertEquals("CXI", sut.findValues(111));
	}
	
	@Test
	public void testEverything100(){
		assertEquals("C", sut.findValues(100));
	}
	
	@Test
	public void testEverything1537(){
		assertEquals("MDXXXVII", sut.findValues(1537));
	}
	
	@Test
	public void testEverything15(){
		assertEquals("XV", sut.findValues(15));
	}
	
	@Test
	public void testRomanNumeralToList(){
		assertArrayEquals({"X", "X"}, sut.convertToArray("xx", new ArrayList<String>()));
	}
	
}
