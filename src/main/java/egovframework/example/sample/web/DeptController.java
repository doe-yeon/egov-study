package egovframework.example.sample.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

// @ : Annotation(시스템 주석, 기능 부여)
@Controller
public class DeptController {
	
	@RequestMapping(value="/deptWrite.do")
	public String deptWrite() {
		return "dept/deptWrite";
	}
	@RequestMapping(value="deptWriteSave.do")
	public String deptWriteSave(String deptno, String dname, String loc ) {
		
		System.out.println("부서번호: " + deptno);
		System.out.println("부서이름: " + dname);
		System.out.println("부서위치: " + loc);
		
		return "";
	}
}
