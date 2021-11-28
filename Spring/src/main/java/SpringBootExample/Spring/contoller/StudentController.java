package SpringBootExample.Spring.contoller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import SpringBootExample.Spring.Student.Student;
import SpringBootExample.Spring.interfaceSrvice.StudentService;

@RestController
public class StudentController {

	@Autowired
	public StudentService studentservice;

	// get the all student
	@GetMapping("/student")
	public List<Student> getStudent() {
		return this.studentservice.getStudent();
	}

	// get the single student
	@GetMapping("/student/{roll}")
	public Student getStudents(@PathVariable int roll) {
		return this.studentservice.getStudents(roll);

	}

	// here add student
	@PostMapping("/students")
	public Student addStudent(@RequestBody Student student) {
		return this.studentservice.addStudent(student);
	}

	// update student
	@PutMapping("/student")
	public Student updateStudent(@RequestBody Student student) {
		return this.studentservice.updateStudent(student);
	}

	// delete student
	@DeleteMapping("/student/{rollnumber}")
	public ResponseEntity<HttpStatus> deleteStudent(@PathVariable int rollnumber) {
		try {
			this.studentservice.deleteStudent(rollnumber);
			return new ResponseEntity<>(HttpStatus.OK);
		} catch (Exception e) {
			return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
		}
	}

}
