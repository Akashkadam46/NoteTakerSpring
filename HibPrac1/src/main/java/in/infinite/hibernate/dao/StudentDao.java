package in.infinite.hibernate.dao;



import java.util.List;

import org.hibernate.Session;
import org.hibernate.Transaction;

import in.infinite.hibernate.model.Student;
import in.infinite.hibernate.util.HibernateUtil;

public class StudentDao implements IStudentDao {
	
	/* (non-Javadoc)
	 * @see in.infinite.hibernate.dao.IStudentDao#saveStudent(in.infinite.hibernate.model.Student)
	 */
	@Override
	public void saveStudent(Student student){
		Transaction trans = null;
		try(Session session = HibernateUtil.getSessionFactory().openSession()){
			trans = session.beginTransaction();
			
			
			session.save(student);
			trans.commit();
		}catch (Exception e) {
			// TODO: handle exception
			if(trans != null){
				trans.rollback();
			}
		}
	}
	
	/* (non-Javadoc)
	 * @see in.infinite.hibernate.dao.IStudentDao#updateStudent(in.infinite.hibernate.model.Student)
	 */
	@Override
	public void updateStudent(Student student){
		Transaction trans = null;
		try(Session session = HibernateUtil.getSessionFactory().openSession()){
			trans = session.beginTransaction();
			
			
			session.saveOrUpdate(student);
			trans.commit();
		}catch (Exception e) {
			// TODO: handle exception
			if(trans != null){
				trans.rollback();
			}
		}
	

}
	/* (non-Javadoc)
	 * @see in.infinite.hibernate.dao.IStudentDao#getStudentById(long)
	 */
	@Override
	public Student getStudentById(long id){
		Transaction trans = null;
		Student student = null;
		try(Session session = HibernateUtil.getSessionFactory().openSession()){
			trans = session.beginTransaction();
			
			student = session.get(Student.class, id);
			//student = session.load(Student.class, id);
			session.save(student);
			trans.commit();
		}catch (Exception e) {
			// TODO: handle exception
			if(trans != null){
				trans.rollback();
			}
		}
		return student;
	
	
}
	
	/* (non-Javadoc)
	 * @see in.infinite.hibernate.dao.IStudentDao#getAllStudents()
	 */
	@Override
	@SuppressWarnings("unchecked")
	public List<Student> getAllStudents(){
		Transaction trans = null;
		List<Student> students = null;
		try(Session session = HibernateUtil.getSessionFactory().openSession()){
			trans = session.beginTransaction();
			
			students = session.createQuery("from Student").list();
			//student = session.load(Student.class, id);
			
			trans.commit();
		}catch (Exception e) {
			// TODO: handle exception
			if(trans != null){
				trans.rollback();
			}
		}
		return students;
	
	
}
	
	/* (non-Javadoc)
	 * @see in.infinite.hibernate.dao.IStudentDao#deleteStudent(long)
	 */
	@Override
	public void deleteStudent(long id){
		Transaction trans = null;
		Student student = null;
		try(Session session = HibernateUtil.getSessionFactory().openSession()){
			trans = session.beginTransaction();
			
			student = session.get(Student.class, id);
			session.delete(student);
			//student = session.load(Student.class, id);
			
			trans.commit();
		}catch (Exception e) {
			// TODO: handle exception
			if(trans != null){
				trans.rollback();
			}
		}
		
	
	
}
	
}
