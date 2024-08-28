package in.infinite.hibernate.dao;

import java.util.List;

import in.infinite.hibernate.model.Student;

public interface IStudentDao {

	void saveStudent(Student student);

	void updateStudent(Student student);

	Student getStudentById(long id);

	List<Student> getAllStudents();

	void deleteStudent(long id);

}