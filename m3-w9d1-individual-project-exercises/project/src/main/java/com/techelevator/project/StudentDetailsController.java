package com.techelevator.project;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import com.techelevator.model.Student;
import com.techelevator.model.StudentDao;
import com.techelevator.model.SwimClass;
import com.techelevator.model.SwimClassDao;


@Controller
public class StudentDetailsController {

	@Autowired
	SwimClassDao swimClassDao;
	StudentDao studentDao;
	JdbcTemplate jdbcTemplate;
	
	@RequestMapping("/student")
	public String displayStudents(ModelMap modelHolder) {
		List<Student> allStudents = new ArrayList<Student>();
		allStudents = studentDao.getAllStudentsInClass(1L);
		modelHolder.put("StudentDetails", allStudents);
		SwimClass swimClass = swimClassDao.getClassDetails(1L);
		modelHolder.put("classDetails", swimClass);
		return "studentDetails";
	}
	
	@RequestMapping(path="/teacherHomePage", method=RequestMethod.POST)
	public String processAccomplishedSkills(@ModelAttribute Student student){	
		studentDao.updateStudent(student);
		return "teacherHomePage";
	}
}