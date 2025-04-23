package egovframework.example.sample.service;

public class DeptVO {
	
	//객체지향: 캡슐화(접근지정자 세팅)
	//변수명을 HTML name과 똑같이 지정해줘야 인식이 됨
	//VO는 데이터를 캡슐화하는 객체로, 특정 데이터를 표현하는 역할을 합니다. 주로 **불변성(immutable)**을 가지며, 값을 변경할 수 없고, 생성될 때만 값이 결정됩니다.
	private String deptno; //html(deptWrite.jsp)의 name 속성값과 같아야함
	private String dname;
	private String loc;
	
	public String getDeptno() { //전역 메소드 설정 
		return deptno;
	}
	public void setDeptno(String deptno) {
		this.deptno = deptno;
	}
	public String getDname() {
		return dname;
	}
	public void setDname(String dname) {
		this.dname = dname;
	}
	public String getLoc() {
		return loc;
	}
	public void setLoc(String loc) {
		this.loc = loc;
	}
	 
}
