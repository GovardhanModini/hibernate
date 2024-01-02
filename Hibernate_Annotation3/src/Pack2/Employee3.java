package Pack2;
import javax.persistence.*;
@Entity
@Table(name="Employee300")

public class Employee3 
{
	@Id
	private int empid;
	private String empname,empjob;
	private int empsal;
	public int getEmpid() {
		return empid;
	}
	public void setEmpid(int empid) {
		this.empid = empid;
	}
	public String getEmpname() {
		return empname;
	}
	public void setEmpname(String empname) {
		this.empname = empname;
	}
	public String getEmpjob() {
		return empjob;
	}
	public void setEmpjob(String empjob) {
		this.empjob = empjob;
	}
	public int getEmpsal() {
		return empsal;
	}
	public void setEmpsal(int empsal) {
		this.empsal = empsal;
	}
	
	

}
