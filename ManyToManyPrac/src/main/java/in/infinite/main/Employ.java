package in.infinite.main;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;

@Entity
public class Employ {
      
	@Id
	private int eid;
	private String name;
	@ManyToMany
	@JoinTable(name="emp_learn")
	private List<Project> projects;
	
	
	public Employ(int eid, String name, List<Project> projects) {
		super();
		this.eid = eid;
		this.name = name;
		this.projects = projects;
	}


	public Employ() {
		super();
		// TODO Auto-generated constructor stub
	}


	public int getEid() {
		return eid;
	}


	public void setEid(int eid) {
		this.eid = eid;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public List<Project> getProjects() {
		return projects;
	}


	public void setProjects(List<Project> projects) {
		this.projects = projects;
	}
	
	
	
	
	
}
