// Complete the methods below. These methods manipulate Arrays of Strings

// Need help starting this question? In the lesson titled 
// "Starting points: Problem Set Questions", go to the
// problem titled "Problem Set 7 - Question 1" for some tips on 
// how to begin.

import java.util.Arrays;
import java.util.ArrayList;

public class ArrayMethods
{
    String[] list; //instance variable
    /**
     * Constructor for objects of class ArrayMethods
     */
    public ArrayMethods(String[] list)
    {
        // initialise instance variables
        this.list = list;
    }

    /**
     * Determines if the array is sorted (do not sort)
     * When Strings are sorted, they are in alphabetical order
     * Use the compareTo method to determine which string comes first
     * You can look at the String compareTo method in the Java API
     * @return true if the array  is sorted, else false.
     */
    public boolean isSorted()
    {   
        boolean sorted = true;
        
        int i = 0;
        while(sorted && i < list.length - 1)
        {
            if(list[i].compareTo(list[i + 1]) > 0)
            {
                sorted = false;
            }
            i++;
        }
        
        
        // TODO: Write the code to loop through the array and determine that each
        // successive element is larger than the one before it

        return sorted;
    }

    /**
     * Replaces all but the first and last with the larger of its to neighbors
     * You can use the compareTo to determine which string is larger (later in alphabetical
     * order).
     */
    public void replaceWithLargerNeighbor()
    {   
        String temp = "";
        if(list.length > 0)
        {
            for(int i = 1; i < list.length - 2; i++)
            {   
                
                if(list[i].compareTo(list[i + 1]) < 0)
                {   
                    temp = list[i];
                    list[i] = list[i + 1];
                    list[i + 1] = temp;
                }
            }
            
            if(list[list.length - 2].compareTo(list[list.length - 1]) < 0)
            {
                list[list.length - 2] = list[list.length - 1];
            }
        }
        
        
       /*for(String element: list)
        {
            System.out.println(element);
        }
        */

    }

    /**
     * Gets the number of duplicates in the array.
     * (Be careful to only count each duplicate once. Start at index 0. Does it match any of the other element?
     * Get the next word. It is at index i. Does it match any of the words with index > i?)
     * @return the number of duplicate words in the array.
     */
    public int countDuplicates()
    {
        int duplicates = 0;
        
        for(int i = 0; i < list.length; i++)
        {
            for(int j = i + 1; j < list.length; j++)
            {
                if(list[i].equals(list[j]))
                {
                    duplicates++;
                }
            }
        }
        return duplicates;
    }

    /**
     * Moves any word that starts with x, y, or z to the front of the array, but
     * otherwise preserves the order
     */
    public void xyzToFront()
    {   
        
        ArrayList<Integer> myIntArray = new ArrayList<Integer>();
        int insertAt = 0;
        int index = 0;
        for(String element: list)
        {   
            if(element.substring(0, 1).equals("x") ||
            element.substring(0, 1).equals("y") ||
            element.substring(0, 1).equals("z"))
            {   
                
                myIntArray.add(index);   
                
            }
            index++;
        }
        int count = 0;
        
        
        for(Integer element: myIntArray)
        {   
            String temp = list[element];
            System.out.println(toString());
            for(int i = element; i > count; i--)
            {   
                System.out.println(list[element]);
                System.out.println(list[element - 1]);
                System.out.println(i);
                list[i] = list[i - 1];
                System.out.println(toString());
            }
            
            list[count] = temp; 
            
        
            count++;
            
        }
        
    }

    /**
     * gets the string representation of this array 
     * @return a string representation of the array. (do this with Arrays.toString(list))
     */
    public String toString()
    {
        return Arrays.toString(list);
    }
}
