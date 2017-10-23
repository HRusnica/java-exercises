package com.techelevator;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.techelevator.model.NameFormatter;

@Controller
public class NameOrderController {
	
	
			@RequestMapping(path="/NameOrder", method=RequestMethod.GET)
			public String nameInput() {
			return "NameOrderInput";
			}
			
			@RequestMapping(path="/NameOrderResult", method=RequestMethod.POST)
			public String nameResult(@RequestParam String firstName, @RequestParam String middleName, @RequestParam String lastName, 
					ModelMap modelHolder){
				NameFormatter nameFormat = new NameFormatter(firstName, middleName, lastName, order);
				modelHolder.put("NameFormatter", nameFormat);
				return "redirect:/NameOrderResult";
			}
			
		
	}


