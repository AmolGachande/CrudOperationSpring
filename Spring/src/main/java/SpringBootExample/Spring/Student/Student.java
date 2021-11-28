package SpringBootExample.Spring.Student;

import javax.persistence.Entity;
import javax.persistence.Id;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@Entity
@JsonIgnoreProperties({ "hibernateLazyInitializer", "handler" })
public class Student {

	@Id
	private int rollnumber;
	private String name;
	private String dob;
	private String doj;

	public Student(int rollnumber, String name, String dob, String doj) {
		super();
		this.rollnumber = rollnumber;
		this.name = name;
		this.dob = dob;
		this.doj = doj;
	}

	public int getRollnumber() {
		return rollnumber;
	}

	public void setRollnumber(int rollnumber) {
		this.rollnumber = rollnumber;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDob() {
		return dob;
	}

	public void setDob(String dob) {
		this.dob = dob;
	}

	public String getDoj() {
		return doj;
	}

	public void setDoj(String doj) {
		this.doj = doj;
	}

	@Override
	public String toString() {
		return "Student [rollnumber=" + rollnumber + ", name=" + name + ", dob=" + dob + ", doj=" + doj + "]";
	}

	public Student() {
		super();
	}

}
