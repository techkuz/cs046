//Complete the given code to compute the sum of all odd digits of a integer.
//The integer may be positive or negative. (For example, if the input is 32677,
//the sum would be 3 + 7 + 7 = 17.)

//HINT: Use a method of the Math class to get the absolute value of the parameter

// Need help starting this question? In the lesson titled 
// "Starting points: Problem Set Questions", go to the
// problem titled "Problem Set 5 - Question 1" for some tips on 
// how to begin.


public class MathUtilThree
{
   /**
    * Gets the sum of all the odd digits in the parameter
    * @param n the number to use
    * @return the sum of the odd digits.
    */

   public int sumOfOdd(int n)
   {
      int number = n;
      int digit;
      int sums = 0;
      while(number != 0)
      {
          digit = number % 10;
          if(digit % 2 != 0)
          {
              sums = sums + digit;
          }
          number = number / 10;
      }//TODO calculate and return the sum of the odd digits

       return Math.abs(sums);
   }
}
