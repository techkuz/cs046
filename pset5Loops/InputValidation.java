// BlueJ project: lesson6/inputvalidation
// Video: Accept Values Between 0 and 100
// TODO: Change this program so that it accepts values between 0 and
// 100 inclusive. Remember to change the prompt as well.

import java.util.Scanner;

public class InputValidation
{
    public static void main(String[] args)
    {
        
        int value; // A user entered value between 0 and 100 inclusive.
        do
        {
            
            System.out.print("Enter an integer between 0 and 100 inclusive: ");
            Scanner in = new Scanner(System.in);
            value = in.nextInt();
        }
        while (value <= -1 || value >= 101);

        System.out.println("Thank you for entering " + value);
    }
}
