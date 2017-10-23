package com.techelevator;

import java.time.LocalDateTime;
import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.techelevator.model.Review;
import com.techelevator.model.ReviewDao;


	@Controller
	public class SquirrelPartiesForDummiesController {
		
		@Autowired
		ReviewDao reviewDao;
		
		@RequestMapping(path="/squirrelPartyForDummies", method=RequestMethod.GET)
		public String showAllPosts(ModelMap modelHolder) {
			List<Review> reviews = reviewDao.getAllReviews();
			modelHolder.put("allReviews", reviews);
			return "squirrelPartyForDummies";
		}
		
		@RequestMapping(path="/squirrelPartyForm", method=RequestMethod.GET)
		public String goToNewPage() {
			return "squirrelPartyForm";
		}
		
		@RequestMapping(path="/squirrelPartyForm", method=RequestMethod.POST)
		public String processReviewForm(@Valid @ModelAttribute Review review, BindingResult result,
				RedirectAttributes flash) {
			
			flash.addFlashAttribute("Review", review);
			
			if(result.hasErrors()){
				flash.addFlashAttribute(BindingResult.MODEL_KEY_PREFIX + "review", result);
				return "redirect:/squirrelPartyForm";
			}
			review.setDateSubmitted(LocalDateTime.now());
			reviewDao.save(review);
			return "redirect:/squirrelPartyForDummies";
		}
		
}
