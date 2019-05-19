package com.Movie.BookMyShow;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.MovieService.AddLogic;

@Controller
public class RegistrationController {

	
	@RequestMapping("/Registration")  
    public ModelAndView register(HttpServletRequest request, HttpServletResponse response)
    {  
        String a = request.getParameter("box1");
        String b = request.getParameter("box2");
        String c = request.getParameter("box3");
        String d = request.getParameter("box4");
        
        
		AddLogic cx = new AddLogic();
		int status = cx.verification(a,b,c,d);
		
		ModelAndView cbr = new ModelAndView();
		cbr.setViewName("Result");
		cbr.addObject("result",status);
		
		
		return cbr;
    }     
	
	
}
