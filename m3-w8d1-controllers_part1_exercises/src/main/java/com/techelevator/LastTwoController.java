package com.techelevator;


import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.techelevator.model.LastTwoList;


@Controller
public class LastTwoController {

	@RequestMapping(path="/lastTwo", method=RequestMethod.GET)
	public String showForm(ModelMap modelHolder) {
		modelHolder.put("wordToReverse", new LastTwoList());
		return "lastTwo";
	}


	
	@RequestMapping(path="/lastTwoResults", method=RequestMethod.POST)
	public String processPost(@ModelAttribute LastTwoList lastTwolist) {
	
			return "lastTwoResults";
		}
	

}
	
