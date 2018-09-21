package my.examples.first;

public class StudentTest {

	public static void main(String[] args) {
		Student s1 = new Student(20, "kim", "1111");
		Student s2 = new Student(20, "hong", "222");
		if(s1.equals(s2)) {
			System.out.println("같은 학생");
		}
		System.out.println(s1);
	}

}
