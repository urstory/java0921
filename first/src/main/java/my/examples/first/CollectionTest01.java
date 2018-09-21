package my.examples.first;
import java.util.*;

public class CollectionTest01 {

	public static void main(String[] args) {
		Collection<String> c1 = new ArrayList<>();
		c1.add("hello");
		c1.add("world");
		c1.add("!!!!");
		c1.add("world");
		
		Iterator<String> iter = c1.iterator();
		while(iter.hasNext()) { // 꺼낼거 확
			String str = iter.next(); // 꺼내
			System.out.println(str);
		}
		
	}

}
