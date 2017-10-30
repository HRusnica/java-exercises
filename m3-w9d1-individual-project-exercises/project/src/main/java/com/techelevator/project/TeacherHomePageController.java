package com.techelevator.project;



import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;



@Controller 
public class TeacherHomePageController {

	
	@RequestMapping(path="/teacher", method=RequestMethod.GET)
	public String displayTeacherHomePage() {	
		return "teacherHomePage";
	}
}
