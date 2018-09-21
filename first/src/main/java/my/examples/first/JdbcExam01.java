package my.examples.first;
import java.sql.*;

public class JdbcExam01 {

	public static void main(String[] args) throws Exception{
		String dbUrl = "jdbc:h2:tcp://localhost/~/test;DB_CLOSE_DELAY=-1";
		String dbUserId = "sa";
		String dbUserPassword = "";
		
		// DB연결.
		Connection conn = 
				DriverManager.getConnection(dbUrl, dbUserId, dbUserPassword);
		
		if(conn != null)
			System.out.println("연결 성공.");
		
		conn.close(); // finally에서 실행되야 한다.
	}

}
