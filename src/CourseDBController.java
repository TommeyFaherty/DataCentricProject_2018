import javax.faces.bean.ManagedBean;
import java.util.ArrayList;

@ManagedBean
public class CourseDBController {
	private DAO dao;
	
	ArrayList<CourseDB> cr;
	
	public void loadCourses () throws Exception{
		//arraylist of type StudentsDB
		cr = dao.loadCourses();
		
		System.out.println("Size in controller " + cr.size());
	}
	
	public CourseDBController() throws Exception{
		super();
		dao = new DAO();
	}
	
	public ArrayList<CourseDB> getCr(){
		return cr;
	}
	
}
