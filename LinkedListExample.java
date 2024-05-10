import java.util.*;  
class LinkedListExample 
{  
    public static void main(String args[]) 
    { 
        LinkedList<String> al=new LinkedList<String>();// creating linked list  
        al.add("Rachit"); // adding elements  
        al.add("Rahul");  
        al.add("Rajat");  
        Iterator<String> itr = al.iterator(); 
        while(itr.hasNext()) 
        {  
            System.out.println(itr.next()); 
        } 
    }
}