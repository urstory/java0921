package my.examples.first;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

public class RoleDAOImpl implements RoleDAO{

	@Override
	public int addRole(Role role) {
		int insertCount = 0;
		
		String dbUrl = "jdbc:h2:tcp://localhost/~/test;DB_CLOSE_DELAY=-1";
		String dbUserId = "sa";
		String dbUserPassword = "";
		
		Connection conn = null;
		PreparedStatement ps = null;
		try {
			conn = DriverManager.getConnection(dbUrl, dbUserId, dbUserPassword);
		
			String sql = "insert into ROLE(role_id, description) values(?, ?)";
	
			ps = conn.prepareStatement(sql);
			ps.setInt(1, role.getRoleId()); // 바인딩(물음표를 채우는 것)
			ps.setString(2, role.getDescription());
			
			insertCount = ps.executeUpdate(); // insert, update, delete
		}catch(Exception ex) {
			ex.printStackTrace();
		}finally {	
			try{ ps.close(); } catch(Exception ex) {}
			try{ conn.close(); }catch(Exception ex) {}
		}		
		
		return insertCount;
	}

	@Override
	public int deleteRole(int roleId) {
		int deleteCount = 0;
		String dbUrl = "jdbc:h2:tcp://localhost/~/test;DB_CLOSE_DELAY=-1";
		String dbUserId = "sa";
		String dbUserPassword = "";
		
		Connection conn = null;
		PreparedStatement ps = null;
		try {
			conn = DriverManager.getConnection(dbUrl, dbUserId, dbUserPassword);
		
			String sql = "delete from ROLE where role_id = ?";
	
			ps = conn.prepareStatement(sql);
			ps.setInt(1, roleId); // 바인딩(물음표를 채우는 것)
			
			deleteCount = ps.executeUpdate(); // insert, update, delete
		}catch(Exception ex) {
			ex.printStackTrace();
		}finally {	
			try{ ps.close(); } catch(Exception ex) {}
			try{ conn.close(); }catch(Exception ex) {}
		}			
		return deleteCount;
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
			try{ conn.close(); }catch(Exception ex) {}
		}
		return role;
	}

	@Override
	public List<Role> getRoles() {
		List<Role> list = new ArrayList<>(); 
		
		String dbUrl = "jdbc:h2:tcp://localhost/~/test;DB_CLOSE_DELAY=-1";
		String dbUserId = "sa";
		String dbUserPassword = "";
		
		Connection conn = null;
		PreparedStatement ps = null;
		ResultSet rs = null;
		try {
			conn = DriverManager.getConnection(dbUrl, dbUserId, dbUserPassword);
		
			String sql = "SELECT role_id, description FROM ROLE ORDER BY role_id";
	
			ps = conn.prepareStatement(sql);
			
			rs = ps.executeQuery(); // select 문을 실행
			while(rs.next()) { // 한건 읽어오는 것을 성공했다면. 
				int rsRoleId = rs.getInt(1);
				String rsDescription = rs.getString(2);
				Role role = new Role();
				role.setRoleId(rsRoleId);
				role.setDescription(rsDescription);
				list.add(role);
			}
		}catch(Exception ex) {
			ex.printStackTrace();
		}finally {	
			try{ rs.close(); } catch(Exception ex) {}
			try{ ps.close(); } catch(Exception ex) {}
			try{ conn.close(); }catch(Exception ex) {}
		}
		return list;
	}

	@Override
	public int updateRole(Role role) {
		int updateCount = 0;
		String dbUrl = "jdbc:h2:tcp://localhost/~/test;DB_CLOSE_DELAY=-1";
		String dbUserId = "sa";
		String dbUserPassword = "";
		
		Connection conn = null;
		PreparedStatement ps = null;
		try {
			conn = DriverManager.getConnection(dbUrl, dbUserId, dbUserPassword);
		
			String sql = "update ROLE set description = ? where role_id = ?";
	
			ps = conn.prepareStatement(sql);
			ps.setString(1, role.getDescription()); // 바인딩(물음표를 채우는 것)
			ps.setInt(2,  role.getRoleId());
			
			updateCount = ps.executeUpdate(); // insert, update, delete
		}catch(Exception ex) {
			ex.printStackTrace();
		}finally {	
			try{ ps.close(); } catch(Exception ex) {}
			try{ conn.close(); }catch(Exception ex) {}
		}			
		return updateCount;
	}

}
