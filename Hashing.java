import java.util.HashSet;
import java.util.Iterator;
public class Hashing {
    public static void main(String[] args) {
        HashSet <Integer> set = new HashSet<>();

        set.add(1);
        set.add(2);
        set.add(3);
        set.add(4);
        set.add(3);
        set.add(1);

        System.out.println(set);

        if(set.contains(1)) {
            System.out.println("Set contains 1");
        }
        
        if(!set.contains(7)) {
            System.out.println("Set does not contains 7");
        }

        set.remove(1);
        if(!set.contains(1)) {
            System.out.println("Doesnot contain 1");
        }

        //Iteration
        Iterator it = set.iterator();
        while(it.hasNext()) {
            System.out.print(it.next() + " ");
        }
  }
}