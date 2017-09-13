package com.techelevator;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class HomeworkAssignmentTest {

	HomeworkAssignment sut;
	
	@Before
	public void setUp() throws Exception {
	sut = new HomeworkAssignment(100);
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void testLetterGradeAPlus() {
		// Arrange

		sut.setTotalMarks(101);
		
		// Act
		String grade = sut.getLetterGrade();
		
		//Assert
		assertEquals("A", grade);
	}
	
	@Test
	public void testLetterGradeAHi() {
		// Arrange

		sut.setTotalMarks(100);
		
		// Act
		String grade = sut.getLetterGrade();
		
		//Assert
		assertEquals("A", grade);
	}
	
	@Test
	public void testLetterGradeALow() {
		// Arrange

		sut.setTotalMarks(90);
		
		// Act
		String grade = sut.getLetterGrade();
		
		//Assert
		assertEquals("A", grade);
	}
	
	@Test
	public void testLetterGradeBHi() {
		// Arrange
		sut.setTotalMarks(89);
		
		// Act
		String grade = sut.getLetterGrade();
		
		//Assert
		assertEquals("B", grade);
	}
	
	@Test
	public void testLetterGradeBLow() {
		// Arrange

		sut.setTotalMarks(80);
		
		// Act
		String grade = sut.getLetterGrade();
		
		//Assert
		assertEquals("B", grade);
	}
	
	@Test
	public void testLetterGradeCHi() {
		// Arrange

		sut.setTotalMarks(79);
		
		// Act
		String grade = sut.getLetterGrade();
		
		//Assert
		assertEquals("C", grade);
	}
	
	@Test
	public void testLetterGradeCLow() {
		// Arrange

		sut.setTotalMarks(70);
		
		// Act
		String grade = sut.getLetterGrade();
		
		//Assert
		assertEquals("C", grade);
	}
	
	@Test
	public void testLetterGradeDHi() {
		// Arrange

		sut.setTotalMarks(69);
		
		// Act
		String grade = sut.getLetterGrade();
		
		//Assert
		assertEquals("D", grade);
	}
	
	@Test
	public void testLetterGradeDLow() {
		// Arrange

		sut.setTotalMarks(60);
		
		// Act
		String grade = sut.getLetterGrade();
		
		//Assert
		assertEquals("D", grade);
	}
	
	@Test
	public void testLetterGradeF() {
		// Arrange

		sut.setTotalMarks(59);
		
		// Act
		String grade = sut.getLetterGrade();
		
		//Assert
		assertEquals("F", grade);
	}
	
	@Test
	public void testLetterGradeBelowZero() {
		// Arrange

		sut.setTotalMarks(-2);
		
		// Act
		String grade = sut.getLetterGrade();
		
		//Assert
		assertEquals("F", grade);
	}

}
