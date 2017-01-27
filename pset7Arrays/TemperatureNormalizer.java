//We want to get the average temperature in Anchorage, Alaska, in
//January and February, 1955. 

//But to get a better idea of the normal temperature, we will discard
//the highest and lowest temeratures. The tester will get the temperatures
//from this website:
//http://academic.udayton.edu/kissock/http/Weather/gsod95-current/AKANCHOR.txt

//It will put them into a double[]array that is passed to the constructor of
//your class. You will complete the TemperatureNormalizer class below.

//The TemperatureNormalizer class has a constructor that takes an array of
//doubles as a parameter
//public TemperatureNormalizer(double[] list)

//It also has methods:
//public double getAdjustedAverage() - gets the average minus the max and min
//public double getMax()
//public double getMin()
//public double getSum()

//Need help starting this question? In the lesson titled 
//"Starting points: Problem Set Questions", go to the
//problem titled "Problem Set 7 - Question 2" for some tips on 
//how to begin.

//Note: the tester uses code we have not covered to get the values from
//the website. You can just ignore it and think of it as the plumbing that
//gets you a double[]

public class TemperatureNormalizer
{
    private double[] data;
    private double length;

   /**
    * Constructs a TemperatureNormalizer with the given array
    * @param the array to process
    */
    public TemperatureNormalizer(double[] list)
    {
        data = list;
        length = data.length;
    }

   /**
    * Gets the adjusted average of the values in this array. The adjusted average
    * is calculated by removing the highest and lowest values and calculating
    * the average of the values that are left
    * @return the adjusted average
    */
    public double getAdjustedAverage()
    {   
        
        double sums = getSum();
        double max = getMax();
        double min = getMin();
        double elements = length - 2;// TODO: find the adjusted average as described in the javadoc.
        return (sums - max - min) / elements ;
    }

   /**
    * Gets the maximum value in the array of doubles
    * @return the maximum value
    */
    public double getMax()
    {   
        
        double max = data[0];// TODO: find the minimum value
        for(int i = 1; i < length; i++)
        {
            if(data[i] > max)
            {
                max = data[i];
            }
        }
        
        return max;// TODO: find the maximum value
        
    }

   /**
    * Gets the minimum value in the array of doubles
    * @return the minimum value
    */
    public double getMin()
    {
        double min = data[0];// TODO: find the minimum value
        for(int i = 1; i < length; i++)
        {
            if(data[i] < min)
            {
                min = data[i];
            }
        }
        return min;
    }

    /**
     * Gets the sum of the values in the array
     * @return the sum of the values in the array
     */
    public double getSum()
    {
        double sums = 0;
        for(double temperature: data)
        {
            sums = sums + temperature;
        }
        // TODO find the sum

        return sums;
    }

}
