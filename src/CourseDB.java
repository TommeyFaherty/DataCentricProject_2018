import javax.faces.bean.ManagedBean;
@ManagedBean

public class CourseDB {
	private String cID;
	private String name;
	private int duration;

	public CourseDB(String cid, String name, int duration) {
		super();
		this.cID = cid;
		this.name = name;
		this.duration = duration;
	}
	
	public CourseDB() {
		super();
	}
	
	public String getCID() {
		return cID;
	}
	
	public void setCID(String cid) {
		this.cID = cid;
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public int getDuration() {
		return duration;
	}
	
	public void setDuration(int duration) {
		this.duration = duration;
	}
}
