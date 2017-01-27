//Complete the class TripPlan which describes the cities that are visited by a tour conducted
//by Java Now Tours. Keep an arraylist of cities (just the string name). Have methods to add a 
//city, remove a city, to return the names of the cities in a String, and to reverse the order 
//of the elements in the array list.

//Notice that the reverse method is void.

// Need help starting this question? In the lesson titled 
// "Starting points: Problem Set Questions", go to the
// problem titled "Problem Set 6 - Question 2" for some tips on 
// how to begin.

import java.util.ArrayList;

/**
 * A TripPlan represents a trip and holds a collection of city names.
 */
public class TripPlan
{
    public ArrayList<String> cities;
    String title;// TODO: add instance variable here

    /**
     * Constructs an empty trip.
     */
    public TripPlan()
    {
        cities = new ArrayList<String>();
        this.title = "";
        // TODO: Initialize the instance variable
    }

    /**
     * Add a city to the list.
     * @param cityName the city to add
     */
    public void addCity(String cityName)
    {
        cities.add(cityName);// TODO: Write code to add a city to the array list instance variable
    }

    /**
     * Returns a string describing the object.
     * @return a string in the format "TripPlan[cityName1,cityName2,...]"
     */
    public String toString()
    {
        String tripPlan = "TripPlan[";
        int count = 0;
        for(String city: cities)
        {   
            if(count != cities.size() - 1)
            {
            tripPlan = tripPlan + city + ",";
            count++;
            }
            else
            {
                tripPlan = tripPlan + city + "]";
            }
        }
        return tripPlan;
    }

    /**
     * Removes a city form the this trip
     * @param cityName city to remove
     */
    public void removeCity(String cityName)
    {
        cities.remove(cityName);// TODO: Write code to remove a city to the array list instance variable
    }

    /**
     * Reverses the elements in the itinerary.
     */
    public void reverse()
    {   
        ArrayList<String> citiesNew = new ArrayList<String>();
        for(int i = cities.size() - 1; i >= 0; i--)
        {
            citiesNew.add(cities.get(i));
        }
        cities = citiesNew;
    }
}
