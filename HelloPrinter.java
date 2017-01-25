import java.util.*;


public class HelloPrinter {
    public static void main(String[] args) 
    {
        ArrayList a = new ArrayList();
        a.add(2);
        a.add(4);
        a.add(6);
        a.add(8);
        a.add(10);
        
        for(int i = a.size() - 1; i >= 0; i--)
        {   
            
            a.add(a.get(i));
            System.out.println(a);
            a.remove(i);
            System.out.println(a);
            //System.out.println(i);
        }
        int b = a.size();
        System.out.println(b);
        System.out.println(a);
        System.out.println("" + 1 + 1 + " dogs"); 
    }
}