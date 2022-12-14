package org.zerock.controller.lecture.p02param;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("ex10")
public class Controller10 {
	
	// /ex10/sub01?name=mickey
	@GetMapping(path = "sub01", params = "name")
	public void method1(@RequestParam("name") String name) {
		System.out.println(name);
	}
	
	// /ex10/sub01
	@GetMapping("sub01")
	public void method2() {
		System.out.println("name 파라미터없을 때 일함");
	}
	
	// ex10/sub02?city=seoul
	@GetMapping("sub02")
	public void method3(@RequestParam(name = "city", required = false) String c) {
		System.out.println(c);
	}
	
	// ex10/sub03?address=korea
//	@GetMapping("sub03")
	public void method4(@RequestParam(name = "address", required = false) String d) {
		System.out.println(d);
	}
	// ex10/sub03
	@GetMapping("sub03")
	public void method5() {
		System.out.println(" ");
	}
	
	// ex10/sub05?address=korea     address -> korea
	// ex10/sub05                   address -> seoul
	@GetMapping("sub04")
	public void method5(@RequestParam(name = "address", defaultValue = "seoul") String c) {
		System.out.println(c);
	}
}
