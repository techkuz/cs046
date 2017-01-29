// BlueJ project: lesson8/counting

// TODO: Provide an instance variable for counting the passengers.
// TODO: Complete the addPassenger and getPassengerCount methods.

public class Car
{
    private int numberOfSeats;
    private int passengers = 0;

   /**
    *  Constructs a car with a given number of seats
    *  @param numberOfSeats the number of seats in this car.
    */
    public Car(int numberOfSeats)
    {
        this.numberOfSeats = numberOfSeats;
    }


   /**
    *  Adds a passenger to this car, provided that there is space.
    */
    public void addPassenger()
    {   
        if(passengers < numberOfSeats - 1)
        {
            passengers = passengers + 1;    
        }
        
    }

   /**
    *  Gets the number of passengers in this car (not counting the driver).
    *  @return the number of passengers
    */
    public int getPassengerCount()
    {   
        System.out.println(numberOfSeats);
        return passengers;
    }

}
