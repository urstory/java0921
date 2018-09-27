package my.examples.first;

import java.util.List;

public class JdbcExam06 {

	public static void main(String[] args) {
		RoleDAO roleDao = new RoleDAOImpl();

		int count = roleDao.deleteRole(1);
		
		System.out.println(count);
	}
	
	

}
