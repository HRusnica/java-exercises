package com.techelevator;


import java.time.LocalDateTime;
import java.util.List;

import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.techelevator.model.LastTwoList;
import com.techelevator.model.Review;


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
	
