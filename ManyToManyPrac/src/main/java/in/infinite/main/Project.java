package in.infinite.main;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToMany;

@Entity
public class Project {

	@Id
	private int pid;
	@Column(name= "project_name" )
	private String projectName;
	
	@ManyToMany(mappedBy = "projects")
	private List<Employ> emps;

	public Project(int pid, String projectName, List<Employ> emps) {
		super();
		this.pid = pid;
		this.projectName = projectName;
		this.emps = emps;
	}

	public Project() {
		super();
		// TODO Auto-generated constructor stub
	}

	public int getPid() {
		return pid;
	}

	public void setPid(int pid) {
		this.pid = pid;
	}

	public String getProjectName() {
		return projectName;
	}

	public void setProjectName(String projectName) {
		this.projectName = projectName;
	}

	public List<Employ> getEmps() {
		return emps;
	}

	public void setEmps(List<Employ> emps) {
		this.emps = emps;
	}
	
	
	
	
	 
}
