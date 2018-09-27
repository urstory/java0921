package my.examples.first;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class MyService {
	@Autowired
	RoleDAO roleDao;
	
	public MyService() {
		System.out.println("MyService생성자입니다.");
	}
	
	public void print() {
		System.out.println("roleId가 100의 description값을 출력합니다.");
		Role role = roleDao.getRole(100);
		System.out.println(role.getDescription());
	}
}
