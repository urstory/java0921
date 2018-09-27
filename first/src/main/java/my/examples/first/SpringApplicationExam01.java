package my.examples.first;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class SpringApplicationExam01 {

	public static void main(String[] args) {
		ApplicationContext context 
			= new AnnotationConfigApplicationContext(ApplicationConfig.class);
		
//		RoleDAO dao = context.getBean(RoleDAO.class);
//		Role role = dao.getRole(100);
//		
//		System.out.println(role.getDescription());
		
		MyService myService = context.getBean(MyService.class);
		myService.print();
	}

}
