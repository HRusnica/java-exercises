package com.techelevator;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.techelevator.model.ColorizedName;

@Controller
public class ColorizedNameController {
	
	@RequestMapping(path="/colorizedName", method=RequestMethod.GET)
	public String showForm() {
		return "colorizedNameForm";
	}
	
	@RequestMapping(path="/colorizedResult", method=RequestMethod.GET)
	public String printPrettyColors(@ModelAttribute ColorizedName colorizedParameters, ModelMap modelHolder) {
		modelHolder.put("colorizedName", colorizedParameters);
		return "colorizedResult";
	}

}
