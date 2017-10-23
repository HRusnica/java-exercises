package com.techelevator;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import com.techelevator.model.FizzBuzz;

@Controller
public class FizzBuzzController {
		
		@RequestMapping(path="/fizzBuzz", method=RequestMethod.GET)
		public String showForm() {
			return "fizzBuzzForm";
		}
		
		@RequestMapping(path="/fizzBuzzResult", method=RequestMethod.GET)
		public String showFizzBuzzResults(@ModelAttribute FizzBuzz fizzBuzz,
				ModelMap modelHolder) {
			
			modelHolder.put("fizzBuzz", fizzBuzz);
			
			return "fizzBuzzResult";
		}
}
