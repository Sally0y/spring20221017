package org.zerock.controller.lecture.p05redirect;

import java.io.IOException;

import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("ex19")
public class Controller19 {
	// 1. 요청받고
	// 2. request parameter 수집
	// 3. request parametr 가공
	// 4. busniess logic
	// 5. add attribute
	// 6. forward / *redirect
	
	@RequestMapping("sub01")
	public void method1(HttpServletResponse response) throws IOException {
		// redirect response
		String location = "sub02";
		response.sendRedirect(location);
	}
	
	@RequestMapping("sub03")
	public String method3() {
		return "redirect:sub04";
	}
	
	// sub05 요청
	// sub06 redirect
	@RequestMapping("sub05")
	public String method5() {
		return "redirect:sub06";
	}
	
	@RequestMapping("sub07")
	public void method7()
	
	
}
