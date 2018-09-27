package my.examples.first;

import java.util.List;

public class JdbcExam04 {

	public static void main(String[] args) {
		RoleDAO roleDao = new RoleDAOImpl();
		Role role1 = roleDao.getRole(100);
		if(role1 != null)
			System.out.println(role1.getRoleId() + " , " + role1.getDescription());
	
		Role role2 = roleDao.getRole(101);
		if(role2 != null)
			System.out.println(role2.getRoleId() + " , " + role2.getDescription());
		
		Role role3 = roleDao.getRole(300);
		if(role3 != null)
			System.out.println(role3.getRoleId() + " , " + role3.getDescription());
		
		System.out.println("-----------------------------------");
		List<Role> list = roleDao.getRoles();
		for(Role role : list) {
			System.out.println(role.getRoleId() + " , " + role.getDescription());
			
		}

	}
	
	

}
