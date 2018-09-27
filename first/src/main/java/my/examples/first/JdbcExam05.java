package my.examples.first;

import java.util.List;

public class JdbcExam05 {

	public static void main(String[] args) {
		RoleDAO roleDao = new RoleDAOImpl();

		Role role = new Role(1, "CEO");
		int count = roleDao.addRole(role);
		
		System.out.println(count);
	}
	
	

}
