package my.examples.first;

import org.springframework.stereotype.Repository;

@Repository
public class MyDao {
	public MyDao() {
		System.out.println("MyDao생성자입니다.");
	}
}
