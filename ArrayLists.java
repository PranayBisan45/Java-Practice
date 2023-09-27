import java.util.ArrayList;
import java.util.Collections;

public class ArrayLists {
	public static void main (String[] args) {
		ArrayList <Integer> list = new ArrayList<Integer>();
		
		list.add(4);
		list.add(3);
		list.add(5);
		list.add(1);
		System.out.println(list);
		
		int element = list.get(2);
		System.out.println(element);
		
		list.set(2,2);
		System.out.println(list);
		
		list.remove(3);
		System.out.println(list);
		int size = list.size();
	    System.out.println(size);
		
		for(int i=0;i<list.size();i++) {
			System.out.print(list.get(i) +" ");
		}
		System.out.println();
		Collections.sort(list);
		System.out.println(list);
	}
}