package org.zerock.controller.lecture.p02param;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("ex09")
public class Controller09 {
	
	@GetMapping("sub01")
	public void method1(@RequestParam(name = "address") String a) {
		System.out.println(a);
	}
	
	@GetMapping("sub02")
	public void method2(@RequestParam(name = "name") String b) {
		System.out.println(b);
	}
	
	@GetMapping("sub08")
	public void method2(@RequestParam("num1") int num1
						 , @RequestParam("num2") int num2) 
	{
		System.out.println(num1+num2);
	}
	
}
