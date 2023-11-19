import java.util.Map;
import java.util.Scanner;
import java.util.HashMap;
import java.util.Scanner;
public class HashMapQue {
    public static void main(String [] args) {
        Scanner sc= new Scanner (System.in);
        
        System.out.println("Enter a Line");
        String l=sc.nextLine();
        String [] sp=l.split(" ");
        // String s="rain rain come again";
        // String [] sp=s.split(" ");

        Map <String,Integer> sm=new HashMap<>();

            for(String s1: sp) {
            if(sm.containsKey(s1)) {
                int value= sm.get(s1);
                sm.put(s1,value+1);
            } else {
                sm.put(s1,1);
            }
        }
        System.out.println(sm);
    }
}