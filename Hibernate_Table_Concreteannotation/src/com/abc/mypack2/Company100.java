package com.abc.mypack2;
import javax.persistence.*;
import org.hibernate.annotations.GeneratorType;
@Entity
@Table(name="companyx100")
@AttributeOverrides({
	@AttributeOverride(name="id",column=@Column(name="id")),
	@AttributeOverride(name="name",column=@Column(name="nmae"))
})

public class Company100 extends Employee100
{
	@Column(name="cname")
	private String cname;
	private String loc;
	public String getCname() {
		return cname;
	}
	public void setCname(String cname) {
		this.cname = cname;
	}
	public String getLoc() {
		return loc;
	}
	public void setLoc(String loc) {
		this.loc = loc;
	}
	

}
