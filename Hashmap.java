import java.util.*;

public class Hashmap{
    public static void main(String args[]) {
        HashMap <String, Integer> map = new HashMap<>();
        
        map.put("India", 120);
        map.put("US",20);
        map.put("China", 150);
        System.out.println();
        map.put("China", 400);
        

        System.out.println(map);
    }
}