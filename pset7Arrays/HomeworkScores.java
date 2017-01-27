// BlueJ project: lesson7/scores1

import java.util.Arrays;
import java.util.Scanner;

/**
 * Holds the homework scores for a student.
 */
public class HomeworkScores
{
    private double[] scores;
    private int currentSize; // The currentSize of the array of scores.

    /**
     * @param maxScores the maximum number of scores this object can hold.
     */
    public HomeworkScores(int maxScores)
    {
        scores = new double[maxScores];
        currentSize = 0;
    }

    public void readScores(Scanner userInput)
    {   
        double value;
        String input = "";
        Scanner in = userInput;
        boolean done = false;
        while (!done)
        {   
            
            if(in.hasNextDouble()) 
            {   
                
                scores[currentSize] = in.nextDouble();
                currentSize++;
            }
                
            else
            {
                input = in.next();
                if(input.equals("Q"))
                {
                    done = true;
                }
                
            }
        }
        
        // YOUR CODE HERE
        // Read (userInput) scores between 0 and 100 until a non number is entered.
        // Use the scanner passed in in the argument userInput.
        // Save each score that is read in the partially filled scores array.
        // Make sure not to lose track of how filled the array is.
    }

    /**
     * Builds an easy-to-read description of the scores in the object.
     * @return A description of the scores.
     */
    public String toString()
    {
        return Arrays.toString(Arrays.copyOf(scores, currentSize));
    }
}
