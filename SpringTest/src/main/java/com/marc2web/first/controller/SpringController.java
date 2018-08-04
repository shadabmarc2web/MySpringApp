package com.marc2web.first.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMethod;

@RestController

public class SpringController {
	
	@GetMapping(value= {"/","/home"})
public String hello()
{
		
return "hello.jsp";
}

}
