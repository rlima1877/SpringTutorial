package com.luv2code.springdemo.mvc;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("/hello")
public class HelloWorldController {
	
	@RequestMapping("showForm")
	public String showForm() {
		return "helloworld-form";
	}
	
	@RequestMapping("processForm")
	public String processForm() {
		return "helloworld";
	}
	
	//new controller method to read form data
	// add data to the model
	
	@RequestMapping("processFormVersionTwo")
	public String letsShoutDude(HttpServletRequest request, Model model) {
		
		// read the request parameter from the HTML form
		String theName = request.getParameter("studentName");
		
		String theAge = request.getParameter("studentAge");
		
		// convert the data to all caps
		theName = theName.toUpperCase();
		
		//create the message
		String result = "Yo! " + theName;
		
		String ageMessage = "You're young!";
		
		if(Integer.parseInt(theAge) > 60) {
			ageMessage = "wow you're old!";
		}
		
		
		//add message to the model
		model.addAttribute("message",result);
		model.addAttribute("ageMessage",ageMessage);
		
		
		return "helloworld";
	}
	
	@RequestMapping("processFormVersionTwoThree")
	public String processFormVersionTwoThree(@RequestParam("studentName") String theName, Model model) {
		
		// convert the data to all caps
		theName = theName.toUpperCase();
	
		//create the message
		String result = "Hey my friend from V3 " + theName;
				
		//add message to the model
		model.addAttribute("message",result);
		
		return "helloworld";
	}
	

}
