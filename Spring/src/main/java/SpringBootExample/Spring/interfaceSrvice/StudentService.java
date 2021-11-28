package SpringBootExample.Spring.interfaceSrvice;

import java.util.List;

import SpringBootExample.Spring.Student.Student;

public interface StudentService {

	public List<Student> getStudent();

	public Student getStudents(int roll);

	public Student addStudent(Student student);

	public Student updateStudent(Student student);

	public void deleteStudent(int Int);
}
