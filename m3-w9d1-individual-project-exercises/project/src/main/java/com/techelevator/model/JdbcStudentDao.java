package com.techelevator.model;

import java.util.ArrayList;
import java.util.List;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.support.rowset.SqlRowSet;

public class JdbcStudentDao implements StudentDao {

	private JdbcTemplate jdbcTemplate;

	@Autowired
	public JdbcStudentDao(DataSource dataSource) {
		this.jdbcTemplate = new JdbcTemplate(dataSource);
	}

	@Override
	public List<Student> getAllStudentsInClass(Long classId) {
		List<Student> allStudents = new ArrayList<>();
		String sqlSelectStudent = "SELECT * FROM student WHERE class_id = ?";
		SqlRowSet studentInfo= jdbcTemplate.queryForRowSet(sqlSelectStudent, classId);
		if(studentInfo.next()) {
			Student student = new Student();
			student.setStudentId(studentInfo.getLong("student_id"));
			student.setClassId(studentInfo.getLong("class_id"));
			student.setFirstName(studentInfo.getString("first_name"));
			student.setLastName(studentInfo.getString("last_name"));
			student.setSkill1Accomplished(studentInfo.getBoolean("skill1_accomplished"));
			student.setSkill2Accomplished(studentInfo.getBoolean("skill2_accomplished"));
			student.setSkill3Accomplished(studentInfo.getBoolean("skill3_accomplished"));
			student.setSkill4Accomplished(studentInfo.getBoolean("skill4_accomplished"));
			student.setSkill5Accomplished(studentInfo.getBoolean("skill5_accomplished"));
			student.setSkill6Accomplished(studentInfo.getBoolean("skill6_accomplished"));
			student.setSkill7Accomplished(studentInfo.getBoolean("skill7_accomplished"));
			student.setSkill8Accomplished(studentInfo.getBoolean("skill8_accomplished"));
			student.setSkill9Accomplished(studentInfo.getBoolean("skill9_accomplished"));
			allStudents.add(student);
		}
		return allStudents;
	}
	

	public Student getStudentInfo(Long studentId){
		Student student = new Student();
		String sqlSelectStudent = "SELECT * FROM student WHERE student_id=?";
		SqlRowSet studentInfo= jdbcTemplate.queryForRowSet(sqlSelectStudent, studentId);
		if(studentInfo.next()) {
			student.setStudentId(studentInfo.getLong("student_id"));
			student.setClassId(studentInfo.getLong("class_id"));
			student.setFirstName(studentInfo.getString("first_name"));
			student.setLastName(studentInfo.getString("last_name"));
			student.setSkill1Accomplished(studentInfo.getBoolean("skill1_accomplished"));
			student.setSkill2Accomplished(studentInfo.getBoolean("skill2_accomplished"));
			student.setSkill3Accomplished(studentInfo.getBoolean("skill3_accomplished"));
			student.setSkill4Accomplished(studentInfo.getBoolean("skill4_accomplished"));
			student.setSkill5Accomplished(studentInfo.getBoolean("skill5_accomplished"));
			student.setSkill6Accomplished(studentInfo.getBoolean("skill6_accomplished"));
			student.setSkill7Accomplished(studentInfo.getBoolean("skill7_accomplished"));
			student.setSkill8Accomplished(studentInfo.getBoolean("skill8_accomplished"));
			student.setSkill9Accomplished(studentInfo.getBoolean("skill9_accomplished"));
		}
		return student;
	}
	

	@Override
	public void updateStudent(Student student) {
		String sqlUpdateStudent = "Update student SET skill1_accomplished = ?, skill2_accomplished = ?, skill3_accomplished = ?, skill4_accomplished = ?,"
				+ "skill5_accomplished = ?, skill6_accomplished = ?, skill7_accomplished = ?, skill8_accomplished = ?, skill9_accomplished = ? WHERE"
				+ "studentId = ?";
		jdbcTemplate.update (sqlUpdateStudent, 
				student.getSkill1Accomplished(),
				student.getSkill2Accomplished(),
				student.getSkill3Accomplished(),
				student.getSkill4Accomplished(),
				student.getSkill5Accomplished(),
				student.getSkill6Accomplished(),
				student.getSkill7Accomplished(),
				student.getSkill8Accomplished(),
				student.getSkill9Accomplished(),
				student.getStudentId());
	}
	
}
