package egovframework.example.sample.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import egovframework.example.sample.service.DeptVO;

// @ : Annotation(시스템 주석, 기능 부여)
@Controller //웹주소 인식 기능
public class DeptController {
	
	@RequestMapping(value="/deptWrite.do") //직접 웹주소 적는 설정
	public String deptWrite() { //위 주소에 대한 실행은 메서드가 담당
		return "dept/deptWrite"; //jsp파일 경로(화면 뜰 수 있게)
	}
	
	@RequestMapping(value="/deptWriteSave.do") //저장버튼 클릭시 (form태그의 action속성에 지정되어있음)
	public String deptWriteSave(DeptVO vo) { //데이터가 매개변수로 들어옴 (DeptVO.java 클래스)
		
		System.out.println("부서번호: " + vo.getDeptno()); //DeptVO.java클래스의 전역메서트 호출
		System.out.println("부서이름: " + vo.getDname());
		System.out.println("부서위치: " + vo.getLoc());
		
		return "";
	}
}