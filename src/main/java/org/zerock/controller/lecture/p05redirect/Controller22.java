package org.zerock.controller.lecture.p05redirect;

import javax.servlet.http.HttpSession;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.zerock.domain.lecture.Student;

@Controller
@RequestMapping("ex22")
public class Controller22 {
	// Model: JSP에 컨트롤러에서 생성된 데이터를 담아서 전달하는 역할
	@RequestMapping("sub01")
	public String method1(Model model) {
		model.addAttribute("name", "Selru");
		
		return "redirect:/ex22/sub02";
	}
	
	@RequestMapping("sub02")
	public void method2(Model model) {
		boolean hasName = model.containsAttribute("name");
		System.out.println(hasName);
	}
	
	@RequestMapping("sub03")
	public String method3(HttpSession session) {
		session.setAttribute("name", "Selru");
		
		return "redirect:/ex22/sub04";
	}
	
	@RequestMapping("sub04")
	public void method4(HttpSession session) {
		String name = (String) session.getAttribute("name");
		System.out.println(name);
	}
	
	// sub05 요청
	// /ex22/sub06 redirect
	// session에 attr 코드 추가 (Student)
	@RequestMapping("sub05")
	public String method5(HttpSession session) {
		Student student = new Student();
		student.setName("selru");
		student.setClassName("soccer");
		student.setStudentNumber("26");
		
		session.setAttribute("student", student);
		
		return "redirect:/ex22/sub06";
	}
	
	@RequestMapping("sub06")
	public void method6(HttpSession session) {
		Student student = (Student) session.getAttribute("student");
		System.out.println(student.getName());
		System.out.println(student.getClassName());
		System.out.println(student.getStudentNumber());
	}
	
	
	
}
