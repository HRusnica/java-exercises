package com.techelevator.project;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import com.techelevator.model.SwimClass;
import com.techelevator.model.SwimClassDao;

@Controller
public class ClassDetailsController {

	@Autowired
	SwimClassDao swimClassDao;
	JdbcTemplate jdbcTemplate;
	
	@RequestMapping("/class")
	public String displayClassDetailsPage(ModelMap modelHolder) {
		SwimClass swimClass = swimClassDao.getClassDetails(1L);
		modelHolder.put("classDetails", swimClass);
		return "classDetails";
	}
	
	@RequestMapping(path="/teacherHome", method=RequestMethod.POST)
	public String processIntroducedSkills(@ModelAttribute SwimClass swimClass){	
		swimClassDao.update(swimClass);
		return "teacherHomePage";
	}
	
}
