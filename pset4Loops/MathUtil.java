/**
 * Complete the method to find the largest power of 2 less than the given number
 * Use a loop
 */
public class MathUtil
{
    public int largestPowerOf2(int n)
    {
        int number = 2;
        int count = 0;
        while(number < n){
            number = number * 2;
            count++;
            
        }
        return number / 2;
        
    }
}
