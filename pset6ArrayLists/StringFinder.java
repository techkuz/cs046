// Complete the method in this class to return the first string that starts
// with the target. Return null if no string starts with the target.

import java.util.ArrayList;

public class StringFinder
{
    /**
     * Gets the first String that starts with the target
     * @param text the array list to process
     * @param target the desired letter
     * @return the first string starting with target or null if not found
     */
     public String getTarget(ArrayList<String> text, String target)
     {
          
         int count = 0;
         boolean found = false;
         String foundWord = null;
         while(found == false && count < text.size())
        
         {  
            if(text.get(count).contains(target))
            {
                foundWord = text.get(count);
                found = true;
                
                
            }
            
            count++;
         }
         return foundWord;
     }
}
