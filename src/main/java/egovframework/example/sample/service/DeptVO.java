package egovframework.example.sample.service;

public class DeptVO {
	
	//객체지향: 캡슐화(접근지정자 세팅)
	//변수명을 HTML name과 똑같이 지정해줘야 인식이 됨
	private String deptno;
	private String dname;
	private String loc;
	
	public String getDeptno() {
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
