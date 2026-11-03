package com.mvc;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class MVCController {
	@GetMapping("/welcome")
	public ModelAndView welcome() {
		  
		
		ModelAndView mv=new ModelAndView();
		mv.addObject("msg","Welcome!");
		mv.setViewName("message");
		return mv;
		
	}
	@GetMapping("/Hello")
	public ModelAndView Hello(){
		 ModelAndView mv= new ModelAndView();
		 mv.addObject("msg","Hello Kalyani");
		 mv.setViewName("message");
		 return mv;
		 
	}

}
