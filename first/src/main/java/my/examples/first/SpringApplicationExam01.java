package my.examples.first;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class SpringApplicationExam01 {

	public static void main(String[] args) throws Exception{
		ApplicationContext context 
			= new AnnotationConfigApplicationContext(ApplicationConfig.class);
		
		RoleDao2 dao = context.getBean(RoleDao2.class);
//		List<Role> list = dao.selectAll();
//		for(Role role : list) {
//			System.out.println(role.getDescription());
//		}
		
		Role role = dao.selectById(100);
		System.out.println(role.getDescription());
	}

}
