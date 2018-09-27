package my.examples.first;
import java.sql.*;

public class JdbcExam03 {

	public static void main(String[] args) throws Exception{
		String dbUrl = "jdbc:h2:tcp://localhost/~/test;DB_CLOSE_DELAY=-1";
		String dbUserId = "sa";
		String dbUserPassword = "";
		
		// DB연결.
		Connection conn = 
				DriverManager.getConnection(dbUrl, dbUserId, dbUserPassword);
		
		
		String sql = "SELECT role_id, description FROM ROLE WHERE role_id = ?";

		PreparedStatement ps = conn.prepareStatement(sql);
		ps.setInt(1, 100); // 바인딩(물음표를 채우는 것)
		
		ResultSet rs = ps.executeQuery(); // select 문을 실행
		if(rs.next()) { // 한건 읽어오는 것을 성공했다면. 
			int roleId = rs.getInt(1);
			String description = rs.getString(2);
			System.out.println(roleId + " : " + description);
		}else {
			System.out.println("-_-;");
		}
		
		rs.close();
		ps.close();
		conn.close(); // finally에서 실행되야 한다.
	}

}
