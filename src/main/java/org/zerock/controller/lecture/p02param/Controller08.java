package org.zerock.controller.lecture.p02param;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("ex08")
public class Controller08 {

	
	//참고
//	https://docs.spring.io/spring-framework/docs/current/reference/html/web.html#mvc-ann-methods

	@GetMapping("sub01")
	public void method1 () {
		System.out.println("method1 !!!");
	}
	
	@GetMapping("sub02")
	public void method2 (HttpServletRequest request) {
		System.out.println("method2 !!!");
		
		String name = request.getParameter("name");
		String age = request.getParameter("age");
		
		System.out.println(name);
		System.out.println(age);
	}
	
	@GetMapping("sub03")
	public void method3 (HttpServletRequest req) {
		System.out.println("method3 !!!");
		
		String address = req.getParameter("address");
		
		System.out.println(address);
	
	}
}
