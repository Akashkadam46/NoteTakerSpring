package in.infinite.entities;

import java.util.Date;
import java.util.Random;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="notes")
public class Note {
	@Id
	private int id;
	private String note;
	
	@Column(length=2000)
	private String title;
	private Date addeddate;
	
	
	
	
	
	public Note(String note, String title, Date addeddate) {
		super();
		this.id = new Random().nextInt(100000);
		this.note = note;
		this.title = title;
		this.addeddate = addeddate;
	}
	
	
	
	public Note() {
		super();
		// TODO Auto-generated constructor stub
	}



	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getNote() {
		return note;
	}
	public void setNote(String note) {
		this.note = note;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public Date getAddeddate() {
		return addeddate;
	}
	public void setAddeddate(Date addeddate) {
		this.addeddate = addeddate;
	}
	
	
	
	
	

}
