package org.zerock.controller.lecture.p01mapping;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("ex06")
public class Controller06 {
	// /ex06/sub01
	
	// 좀 더 구체적으로 requestmapping을 작성한 메소드가 우선권을 가짐
	// @RequestMapping(value = "sub01", method = RequestMethod.GET)
	
	@GetMapping("sub01")
	public void method1() {
		System.out.println("method1 !!!!");
	}
}
