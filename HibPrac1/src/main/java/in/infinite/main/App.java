package in.infinite.main;




import java.util.List;

import in.infinite.hibernate.dao.IStudentDao;
import in.infinite.hibernate.dao.StudentDao;
import in.infinite.hibernate.model.Student;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	IStudentDao studentDao = new StudentDao();
      Student student = new Student("Akash", "Kadam", "Akashkadam@gmail.com");
      
      student.setFirstname("chetan");
      studentDao.updateStudent(student);
      
      
      Student student2 = studentDao.getStudentById(student.getId());
      
      List<Student> students = studentDao.getAllStudents();
      students.forEach(student1 -> System.out.println(student1.getId()));
      
      studentDao.deleteStudent(student.getId());
    }
}
