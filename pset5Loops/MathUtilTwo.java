// Complete this method to read integer scores from the user and find the average
// Stop asking for input when the user enters a negative number.
// Keep a running total and keep track of the number of entries,
// then find and return the average

// Be sure not to divide by 0. Return 0 if no scores are entered

import java.util.Scanner;

public class MathUtilTwo
{
    public double averageScore()
    {   
        int input;
        int count = 0;
        int sums = 0;
        Scanner in = new Scanner(System.in);//TODO Find and return the average of the numbers entered.
        do
        {
            System.out.print("Enter a score. -1 to quit: ");
            if(!in.hasNextInt() &&
            count == 0)
            {
                break;
            }
            input = in.nextInt();//use this for the prompt
            
            if(input >= 0)
            {
                sums = sums + input;
                count++;    
            }
            
            
        }
        while(input >= 0);
        
        if(count == 0)
        {
            return 0;
        }
        else 
        {
            return sums / count;
        }
        
    }
}
