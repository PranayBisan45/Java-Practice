import java.util.*;

public class LL {
	Node head;
       class Node {
    	   String Data;
    	   Node Next;
    	   
    	   Node (String Data) {
    		   this.Data = Data;
    		   this.Next = null;
    	   }
       }
       
       public void addFirst (String Data) {
    	   Node newNode = new Node(Data);
    	   if (head == null) {
    		   head = newNode;
    		   return;
    	   }
    	   newNode.Next = head;
    	   head = newNode;
       }
       
       public void printNode (String Data) {
    	   Node newNode = new Node(Data);
    	   if (head == null) {
    		   head = newNode;
    		   return;
    	   }
    	                                                                  // Incomplete Program
       }
       
       public static void main(String[] args) {
    	   LL list = new LL();
    	   list.addFirst("a");
    	   list.addFirst("is");
       }
}
