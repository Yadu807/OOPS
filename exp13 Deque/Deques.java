import java.util.*;

public class Deques {
 public static void main(String[] args){
  Deque<String> deque =new ArrayDeque<String>();
  
  deque.add("q");
  deque.add("w");
  deque.add("e");
  deque.add("r");
  deque.add("t");
  deque.add("y");
  
  System.out.println("Queue after inserting element");
  for(String str: deque){
   System.out.println(str+"");
  }
  
  deque.addFirst("a");
  System.out.println("Queue after inserting first element");
  for(String str: deque){
   System.out.println(str+"");
  }
  
  deque.addLast("m");
  System.out.println("Queue after inserting Last element");
  for(String str: deque){
   System.out.println(str+"");
  }
  
  deque.remove();
  System.out.println("Queue after deleting first element");
  for(String str: deque){
   System.out.println(str+"");
  }
  
  
  deque.clear();
  deque.add("X");
  System.out.println("Queue after emptying and inserting new element");
  for(String str: deque){
   System.out.println(str+"");
  }
 }
}
 
