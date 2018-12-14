import javax.faces.bean.ManagedBean;
@ManagedBean
public class StudentDB {
	private String name;
	private String sID;
	private String cID;
	private String address;
	private DAO dao;
	
	public StudentDB(String sid,String cID,String name,String address) {
		super();
		this.sID = sid;
		this.cID = cID;
		this.name = name;
		this.address = address;
	}
	
	public StudentDB() throws Exception {
		super();
		dao = new DAO();
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public String getSID() {
		return sID;
	}
	
	public void setSID(String sID) {
		this.sID = sID;
	}
	
	public String getCID() {
		return cID;
	}
	
	public void setCID(String cID) {
		this.cID = cID;
	}
	
	public String getAddress() {
		return address;
	}
	
	public void setAddress(String address) {
		this.address = address;
	}
	
	public void addStudent() throws Exception {
		dao.addStudent(this.sID, this.cID, this.name, this.address);
	}
}
