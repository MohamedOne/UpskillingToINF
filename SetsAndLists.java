import java.util.*;

public class SetsAndLists.java {
	public static void main(String... args) {
		
		LinkedList<Integer> linkedList = new LinkedList<>();
		linkedList.add(new Integer(234584));
		linkedList.add(new Integer(766339));
		linkedList.add(new Integer(457995));
		
		while(linkedList.size() != 0) {
			System.out.println(linkedList.pop());
		}
		
		Set<String> treeSet = new TreeSet<>();
		treeSet.add("aabb");
		treeSet.add("ccDD");
		treeSet.add("eeFf");
		
	}
}
