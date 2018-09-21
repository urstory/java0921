package my.examples.first;
import java.util.*;

public class CollectionTest2 {

	public static void main(String[] args) {
		Set<String> c1 = new HashSet<>();
		c1.add("hello");
		c1.add("world");
		c1.add("!!!!");
		c1.add("world");
		
		Iterator<String> iter = c1.iterator();
		while(iter.hasNext()) {
			String str = iter.next(); 
			System.out.println(str);
		}
	}

}
