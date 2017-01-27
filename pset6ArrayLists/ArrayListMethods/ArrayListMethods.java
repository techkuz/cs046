//Complete the class ArrayListMethods. It consists of four short methods
//to manipulate an array list of strings. The method header and javadoc
//are given to you.

// Need help starting this question? In the lesson titled 
// "Starting points: Problem Set Questions", go to the
// problem titled "Problem Set 6 - Question 1" for some tips on 
// how to begin.

import java.util.ArrayList;

public class ArrayListMethods
{
    ArrayList<String> list; //instance variable
    /**
     * Constructor for objects of class ArrayListMethods
     */
    public ArrayListMethods(ArrayList<String> arrayList)
    {
        // initialise instance variables
        list = arrayList;
    }

    /**
     * Determines if the array list is sorted (do not sort)
     * When Strings are sorted, they are in alphabetical order
     * Use the compareTo method to determine which string comes first
     * You can look at the String compareTo method in the Java API
     * @return true if the array list is sorted else false.
     */
    public boolean isSorted()
    {
        boolean sorted = true;
        int count = 0;
        String currentWord;
        String nextWord;
        while(sorted && count < list.size() - 1)
        {   
            currentWord = list.get(count);
            nextWord = list.get(count + 1);
            if((currentWord.compareTo(nextWord) > 0))
            {   
                sorted = false;
            }
            count++;
            
        }
        
        
        // TODO: Determine if the array is sorted.

        return sorted;
    }

    /**
     * Replaces all but the first and last elements with the larger of its two neighbors
     * You can use the compareTo() method to determine which string is larger (larger in alphabetical
     * order).
     * Example: if the list is originally
     *    ["cat", "ape", "dog", "horse", "zebra"]
     * after this method it should be: 
     *    ["cat", "dog", "horse", "zebra", "zebra"]
     */
    public void replaceWithLargerNeighbor()
    {
        
        
        if(list.size() > 0)
        {
            for(int i = 1; i < list.size() - 2; i++)
            {
                if(list.get(i).compareTo(list.get(i + 1)) < 0)
                {
                    list.add(i, list.get(i+1));
                    list.remove(i + 2);
                }
            }
            
            if(list.get(list.size() - 2).compareTo(list.get(list.size() - 1)) < 0)
            {
                list.set(list.size() - 2, list.get(list.size() - 1));
            }
        }
        // TODO: Replace all but the first and last elements with the larger of its two neighbors

    }

    /**
     * Gets the number of duplicates in the list.
     * Be careful to only count each duplicate once. Start at index 0. (Does it match any of the other elements?)
     * Get the next word. It is at index i. (Does it match any of the words with index > i?)
     * @return the number of duplicate words in the list
     */
    public int countDuplicates()
    {
        int duplicates = 0;
        

        for(int i = 0; i < list.size(); i++)
        {
            for(int j = i + 1; j < list.size(); j++)
            {
                if(list.get(i).equals(list.get(j)))
                {
                    duplicates++;
                }
            }
        }// TODO: Write the code to get the number of duplicates in the list

        return duplicates;
    }

     /**
     * Moves any word that starts with x, y, or z to the front of the ArrayList, but
     * otherwise preserves the order
     * Example: if the list is orginially
     *   ["ape", "dog", "xantus", "zebra", "cat", "yak"]
     * after this method is called it should be
     *   ["xantus", "zebra", "yak", "ape", "dog", "cat"]
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
        for(Integer number: myIntArray)
        {   
            
            list.add(count, list.get(number));
            list.remove(number + 1);
            count++;
        }// TODO:  Move any word that starts with x, y, or z to the front of the ArrayList, but otherwise preserves the order

    }

    /**
     * gets the string representation of this array list
     * @returns the string representation of this array list in
     * standard collection format
     */
    public String toString()
    {
        return list.toString();
    }
}
