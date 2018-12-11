import javax.faces.bean.ManagedBean;
import java.util.ArrayList;

@ManagedBean
public class StudentDBController{ 
	private DAO dao;
	
	ArrayList<StudentDB> st;
	
	public void loadStudents () throws Exception{
		//arraylist of type StudentsDB
		st = dao.loadStudents();
		
		System.out.println("Size in controller " + st.size());
	}//Constructor
	
	public StudentDBController() throws Exception{
		super();
		dao=new DAO();
	}
	
	public ArrayList<StudentDB> getSt(){
		return st;
	}

}
