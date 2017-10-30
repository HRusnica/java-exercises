package com.techelevator.model;

import java.util.List;

public interface StudentDao {

	public List<Student> getAllStudentsInClass(Long classId);
	public Student getStudentInfo(Long studentId);
	public void updateStudent(Student student);

}
