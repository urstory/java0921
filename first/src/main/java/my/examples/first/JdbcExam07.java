package my.examples.first;

import java.util.List;

public class JdbcExam07 {

	public static void main(String[] args) {
		RoleDAO roleDao = new RoleDAOImpl();

		Role role1 = roleDao.getRole(100);
		
		System.out.println(role1.getDescription());
		
		role1.setDescription("CTO");
		
		roleDao.updateRole(role1);
		
		Role role2 = roleDao.getRole(100);
		System.out.println(role2.getDescription());
	}
	
	

}
