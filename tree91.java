//How to create TreeSet program in java
import java.util.*;
class TreeSet_Technolamror{
public static void main(String args[]){
//Creating and adding elements 
TreeSet<String> al=new TreeSet<String>(); 
al.add("Rajendra");
al.add("Raja");
al.add("Ravi"); 
al.add("Technolamror"); 
 Iterator<String> 
itr=al.iterator(); 
while(itr.hasNext()){ 
    System.out.println(itr.next());
}
}
}