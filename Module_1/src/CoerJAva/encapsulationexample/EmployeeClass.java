package encapsulationexample;

public class EmployeeClass {
	
	//Member Variables
	private int eid=109;
	private String ename="Shubham";
	private int esal=10000;
	private int atmpin=1283;
	
	//Getters and Setters
	public int getEid() {
		return eid;
	}
	public void setEid(int eid) {
		this.eid = eid;
	}
	public String getEname() {
		return ename;
	}
	public void setEname(String ename) {
		this.ename = ename;
	}
	public int getEsal() {
		return esal;
	}
	public void setEsal(int esal) {
		this.esal = esal;
	}
}
