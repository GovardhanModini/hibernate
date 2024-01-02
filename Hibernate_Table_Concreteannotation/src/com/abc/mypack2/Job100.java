package com.abc.mypack2;
import javax.persistence.*;
import org.hibernate.annotations.GeneratorType;
@Entity
@Table(name="jobx100")
@AttributeOverrides({
	@AttributeOverride(name="id",column=@Column(name="id")),
	@AttributeOverride(name="name",column=@Column(name="nmae"))
})
public class Job100 extends Employee100
{
	private int salary;
	@Column(name="desg")
	private String desg;
	public int getSalary() {
		return salary;
	}
	public void setSalary(int salary) {
		this.salary = salary;
	}
	public String getDesg() {
		return desg;
	}
	public void setDesg(String desg) {
		this.desg = desg;
	}
	

}
