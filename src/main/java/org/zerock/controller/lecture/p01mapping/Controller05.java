package org.zerock.controller.lecture.p01mapping;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("ex05")
public class Controller05 {
	
	@GetMapping("sub04")
	public void method1 () {
		
		System.out.println("method1 !!!");
			
	}
	
	@PostMapping("sub05")
	public void method2 () {
		
		System.out.println("method2 !!!");
			
	} 



}


