// BlueJ project: lesson7/swapHalves

//Reminder: Here is how you swap two elements:
//int saved = elements[i];
//elements[i] = elements[j];
//elements[j] = saved;

import java.util.Arrays;

public class SwapHalves
{
    public static void main(String[] args)
    {
        int[] elements = { 1, 4, 9, 7, 3, 2, 5, 11, 0, 9 };
        int length = elements.length;
        for(int i = 0; i < length / 2; i++)
        {
             int saved = elements[i];
             elements[i] = elements[i + length / 2];
             elements[i + length / 2] = saved;
        }// TODO: Swap the first and second half

        // Print all elements
        System.out.println(Arrays.toString(elements));
    }
}
