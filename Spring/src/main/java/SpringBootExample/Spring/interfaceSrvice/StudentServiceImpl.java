package SpringBootExample.Spring.interfaceSrvice;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;

import SpringBootExample.Spring.Student.Student;
import SpringBootExample.Spring.StudentDao.StudentDao;

@Service
public class StudentServiceImpl implements StudentService {

	@Autowired
	private StudentDao studentDao;

	public StudentServiceImpl() {

	}

	@Override
	public List<Student> getStudent() {
		return studentDao.findAll();
	}

	@Override
	public Student getStudents(int roll) {
		return studentDao.getOne(roll);
	}

	@Override
	public Student addStudent(@RequestBody Student student) {
		studentDao.save(student);
		return student;
	}

	@Override
	public Student updateStudent(Student student) {
		studentDao.save(student);
		return student;
	}

	@Override
	public void deleteStudent(int Int) {
		Student entity = studentDao.getOne(Int);
		studentDao.delete(entity);
	}
}
