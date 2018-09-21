package my.examples.first;
import java.util.*;

public class CollectionTest3 {

	public static void main(String[] args) {
		List<String> c1 = new ArrayList<>();
		c1.add("hello");
		c1.add("world");
		c1.add("!!!!");
		c1.add("world");
		
		for(int i = 0; i < c1.size(); i++) {
			System.out.println(c1.get(i));
		}
		
	}

}
