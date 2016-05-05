package com.dynamic.tutorial;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class IndexController {
	
	@RequestMapping(value="/index.do")
	public ModelAndView indexPage(){
		ModelAndView mav = new ModelAndView("/WEB-INF/views/index.jsp");
		
		return mav;
	}
}
