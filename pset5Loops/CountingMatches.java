// BlueJ project: lesson6/counting_matches

import java.util.Scanner;

public class CountingMatches
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        
        String input = "";
        
        int count = 0;
        double value = 0;
        boolean done = false;
        
        // TODO: Prompt the user for a value until they enter Q
        // count how many times the user enters a negative number
        // using the variable counter
        
        
        while(!done)
        {
            System.out.print("Enter a value, Q to quit: " );
            if(in.hasNextDouble())
            {
                value = in.nextDouble();
                if(value < 0)
                {
                    count++;
                }
            }
            else
            {
                done = true;
            }
        }

        //your code here.

        System.out.println("The water line fell on " + count + " years.");
    }
}
