import javax.naming.Context;
import javax.naming.InitialContext;
import javax.sql.DataSource;
import java.sql.*;
import java.util.ArrayList;

public class DAO {
	private DataSource mysqlDS;

	public DAO() throws Exception {
		Context context = new InitialContext();
		String jndiName = "java:comp/env/jdbc/studentDB";
		mysqlDS = (DataSource) context.lookup(jndiName);
	}
	
	public ArrayList<StudentDB> loadStudents() throws Exception{
		
		System.out.println("In load Students");
		Connection conn = mysqlDS.getConnection();
		Statement myStmt = conn.createStatement();
		String query = "select * from student;";
		
		
		ResultSet rs = myStmt.executeQuery(query);
		
		ArrayList<StudentDB> studentDets = new ArrayList<StudentDB>();
		
		while(rs.next()) {
			String sid = rs.getString("sid");
			String cID = rs.getString("cID");
			String name = rs.getString("name");
			String address = rs.getString("address");
			
			System.out.println("SID: "+sid+"\nCID: "+cID);
			
			StudentDB s = new StudentDB(sid,cID,name,address);
			
			studentDets.add(s);
		}
		
		return studentDets;
	}
	
	public ArrayList<CourseDB> loadCourses() throws Exception{
		System.out.println("In load Course");
		Connection conn = mysqlDS.getConnection();
		Statement myStmt = conn.createStatement();
		String query = "select * from course;";
		
		ResultSet rs = myStmt.executeQuery(query);
		
		ArrayList<CourseDB> courseDets = new ArrayList<CourseDB>();
		
		while(rs.next()) {;
			String cID = rs.getString("cID");
			String name = rs.getString("cName");
			int duration = rs.getInt("duration");
			
			CourseDB c = new CourseDB(cID,name,duration);
			
			courseDets.add(c);
		}
		
		return courseDets;
		
		
	}
	
}
