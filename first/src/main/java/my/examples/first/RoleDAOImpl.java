package my.examples.first;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.List;

public class RoleDAOImpl implements RoleDAO{

	@Override
	public int addRole(Role role) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int deleteRole(int roleId) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public Role getRole(int roleId) {
		Role role = null; 
		String dbUrl = "jdbc:h2:tcp://localhost/~/test;DB_CLOSE_DELAY=-1";
		String dbUserId = "sa";
		String dbUserPassword = "";
		
		Connection conn = null;
		PreparedStatement ps = null;
		ResultSet rs = null;
		try {
			conn = DriverManager.getConnection(dbUrl, dbUserId, dbUserPassword);
		
			String sql = "SELECT role_id, description FROM ROLE WHERE role_id = ?";
	
			ps = conn.prepareStatement(sql);
			ps.setInt(1, roleId); // 바인딩(물음표를 채우는 것)
			
			rs = ps.executeQuery(); // select 문을 실행
			if(rs.next()) { // 한건 읽어오는 것을 성공했다면. 
				int rsRoleId = rs.getInt(1);
				String rsDescription = rs.getString(2);
				role = new Role();
				role.setRoleId(rsRoleId);
				role.setDescription(rsDescription);
			}
		}catch(Exception ex) {
			ex.printStackTrace();
		}finally {	
			try{ rs.close(); } catch(Exception ex) {}
			try{ ps.close(); } catch(Exception ex) {}
			try{conn.close(); }catch(Exception ex) {}
		}
		return role;
	}

	@Override
	public List<Role> getRoles() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int updateRole(Role role) {
		// TODO Auto-generated method stub
		return 0;
	}

}
