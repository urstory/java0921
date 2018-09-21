package my.examples.first;
import java.sql.*;

public class JdbcExam02 {

	public static void main(String[] args) throws Exception{
		String dbUrl = "jdbc:h2:tcp://localhost/~/test;DB_CLOSE_DELAY=-1";
		String dbUserId = "sa";
		String dbUserPassword = "";
		
		// DB연결.
		Connection conn = 
				DriverManager.getConnection(dbUrl, dbUserId, dbUserPassword);
		
		
		String sql = "SELECT role_id, description FROM ROLE";
		
		//준비된 sql결과를 참조하는 변수 ps
		PreparedStatement ps = conn.prepareStatement(sql); // SQL 준비 부탁

		// ps에게 sql을 실행하라고 부탁. SQL은 DBMS안에서 식행된다.
		// 실행된 결과를 참조하는 변수 rs 
		ResultSet rs = ps.executeQuery(); // select 문을 실행
		while(rs.next()) { // next()는 한건의 로우를 읽어온다. 
			int roleId = rs.getInt(1); // 1번째 컬럼
			String description = rs.getString(2); // 2번째칼럼 
			System.out.println(roleId + " , " + description);
		}
		
		ps.close();
		conn.close(); // finally에서 실행되야 한다.
	}

}
