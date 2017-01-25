// Complete the method in this class to return the index of the first string
// that starts with the target. Return -1 if no string starts with the target

import java.util.ArrayList;

public class Finder
{
    /**
     * Gets the index of the first String that starts with the target
     * @param text the array list to process
     * @param target the desired letter
     * @return the index of first string starting with target or -1 if not found
     */
     public int getIndex(ArrayList<String> text, String target)
     {      
         
         int count = 0;
         int index = -1;
         boolean found = false;
         while(found == false && count < text.size())
         {  
            if(text.get(count).substring(0, 1).equals(target))
            {
                System.out.println(text.get(count));
                index = count;
                found = true;
            }
            
            count++;
         }
         return index;
     }
}
