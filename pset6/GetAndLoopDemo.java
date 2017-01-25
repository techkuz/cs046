// Complete this class. An array list of Strings called cities has been defined
// for you and populated. You are to print the elements, one to a line (please 
// use a for loop). Afterwards, print the element at index 2.

import java.util.ArrayList;

public class GetAndLoopDemo
{
    public static void main(String[] args)
    {
        ArrayList<String> cities = new ArrayList<String>();
        cities.add("Chicago");
        cities.add("Dallas");
        cities.add("San Jose");
        cities.add("Seattle");
        
        for(String city: cities)
        {
            System.out.println(city);
        }
        
        /*for(int i = 0; i < cities.size(); i++)    - second solution
        {
            
            System.out.println(cities.get(i));
        }
        System.out.println(cities.get(2));
        */
        // TODO: Use a loop to print the elements one to a line
        // TODO: Print the element at index 2

    }
}
