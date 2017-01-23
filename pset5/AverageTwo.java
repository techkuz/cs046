// Bluej project: lesson6/average_fixed
// Update your program so that the user supplies at least one input.
// Use Q as a sentinel value.
// Start prompting for the sentinel value after the first input.
// If the user doesn't provide even the first input, print Error: No input
// Bluej project: lesson6/average_q


import java.util.Scanner;

public class AverageTwo
{
    public static void main(String[] args)
    {
        String input = "";
        double value;
        int count = 0;
        double sum = 0;
        boolean done = false;
        
        while (!done)
        {   
            if(count == 0)
            {
                System.out.print("Enter a value: ");
            }
            else
            {
                System.out.print("Enter a value, Q to quit: ");
            }
            
            Scanner in = new Scanner(System.in);
            
            if(in.hasNextDouble()) 
            {
                value = in.nextDouble();
                sum = sum + value;
                count++;
            }
                
            
            else
            {
                input = in.nextLine();
                if(input.equals("q"))
                {
                    done = true;
                }
                else
                {
                    count++;
                }
            }
        }
        
        if(count == 0)
        {
            System.out.println("Error: No input");
        }
        else 
        {
            double average = sum / count;
            System.out.printf("Average: %.2f\n", average);
        }
    }
}