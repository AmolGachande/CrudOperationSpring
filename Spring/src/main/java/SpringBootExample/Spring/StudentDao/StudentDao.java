package SpringBootExample.Spring.StudentDao;

import org.springframework.data.jpa.repository.JpaRepository;

import SpringBootExample.Spring.Student.Student;

public interface StudentDao extends JpaRepository<Student,Integer>{
	

}
