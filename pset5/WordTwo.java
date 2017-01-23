//Translate the following pseudocode for randomly permuting the characters in
//a string into a method in the given Java class.

//Read a word.
//Repeat word.length() times
//   Pick a random position i in the word, but not the last position.
//   Pick a random position j > i in the word. (this is tricky)
//   Swap the letters at positions j and i.
//Print the word.

//To swap the letters, construct substrings as follows:
//  http://i.imgur.com/re4bGPu.png

//Create and return the string:
//   first + word.substring(j, j + 1) + middle
//         + word.substring(i, i + 1) + last

// Need help starting this question? In the lesson titled 
// "Starting points: Problem Set Questions", go to the
// problem titled "Problem Set 5 - Question 2" for some tips on 
// how to begin.

//I recommend that you implement and test the swapping before implementing
//the loop. If something is wrong in the swap, it will be much more difficult
//to find it you have executed the swap many times. That is an example of
//step-wise refinement. Code a little, test, code a little more.

import java.util.Random;
/**

 */
public class WordTwo
{
   private Random generator = new Random();

   public Word()  //leave the constructor alone
   {
        generator = new Random();
        final long SEED = 42;
        generator.setSeed(SEED);
   }
   /**
    * Gets a version of this word with the leters scrambled
    * @param word the string to scramble
    * @return the scrabled string
    */
   public String scramble(String word)
   {    
        int randomPositionI;
        int randomPositionJ;
        String newWord = word.substring(0);
        //System.out.println("WORD" + newWord);
        for(int i = 0; i < word.length(); i++)
        {
            randomPositionI = generator.nextInt(word.length() - 1);
            //System.out.print("randomPositionI");
            //System.out.println(randomPositionI);
            randomPositionJ = generator.nextInt(word.length() - randomPositionI - 1) + randomPositionI + 1;
            //System.out.print("randomPositionJ");
            //System.out.println(randomPositionJ);
            
            
            String first; 
            String middle;
            String last;
            
            if(randomPositionI == 0)
            {
                first = "";
            }
            else
            {
                first = newWord.substring(0, randomPositionI);
            }
            
            if(randomPositionI == randomPositionJ - 1)
            {
                middle = "";
            }
            else
            {
                middle =newWord.substring(randomPositionI + 1, randomPositionJ);
            }
            
            if(randomPositionJ == word.length() - 1)
            {
                last = "";
            }
            else
            {
                last = newWord.substring(randomPositionJ + 1);
            }
            newWord = first + newWord.substring(randomPositionJ, randomPositionJ + 1) + middle + 
            newWord.substring(randomPositionI, randomPositionI + 1) + last;
            /*if(randomPositionI != randomPositionJ)
            {   
                
                
                if(randomPositionI == 0)
                {
                    newWord = newWord.charAt(randomPositionJ) + 
                    newWord.substring(randomPositionI + 1, randomPositionJ) + newWord.charAt(randomPositionI) + 
                    newWord.substring(randomPositionJ + 1, word.length());  
                }
                
                else if(randomPositionJ == word.length() - 1 && randomPositionI == randomPositionJ - 1)
                {
                    newWord = newWord.substring(0, randomPositionI) + newWord.charAt(randomPositionJ) + 
                    newWord.charAt(randomPositionI);     
                }
                
                else if(randomPositionJ == word.length() - 1 && randomPositionI == 0)
                {
                    newWord = newWord.charAt(randomPositionJ) + newWord.substring(1, randomPositionJ) +
                    newWord.charAt(randomPositionI);
                }
                
                else if(randomPositionJ == word.length() - 1)
                {   
                    
                    newWord = newWord.substring(0, randomPositionI) + newWord.charAt(randomPositionJ) + 
                    newWord.substring(randomPositionI + 1, randomPositionJ) + newWord.charAt(randomPositionI); 
                }
                
                else 
                {
                    newWord = word.substring(0, randomPositionI) + newWord.charAt(randomPositionJ) + 
                    newWord.substring(randomPositionI + 1, randomPositionJ) + newWord.charAt(randomPositionI) + 
                    newWord.substring(randomPositionJ + 1, word.length());    
                }
                
              
            
                
            }
            System.out.print("newWord");
            System.out.println(newWord);
            */  
            
        }
        //System.out.println(newWord);
        return newWord;//TODO scramble the letters following the pseudocode
   }


}
