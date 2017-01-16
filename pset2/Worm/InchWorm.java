// Write a class InchWorm that models an inch worm moving along a 
// horizontal line. The inch worm  moves either to the right or left.
// Initially, the inch worm moves to the right, but it can turn to
// change its direction. In each move, its position changes by one
// unit in the current direction. 

// Provide two constructors. 
// One that takes the initial position as an argument,
// and one with no arguments that sets the initial position to 0. 

// You will need two instance variables. 
// One to keep track of the position and one to keep track of the direction. 
// You can use 1 to represent moving right and -1 to represent moving left. 

// Constructors:
// public InchWorm()
// public InchWorm (int initialPosition)

// Provide these methods:
// public void turn()
// public void move()
// public int getPosition()

// Sample usage:
// InchWorm worm = new InchWorm (10);
// worm.move(); // Now the position is 11
// worm.turn();
// worm.move(); // Now the position is 10


// Need help starting this question? In the lesson titled 
// "Starting points: Problem Set Questions", go to the
// problem titled "Problem Set 2 - Question 2" for some tips on 
// how to begin. 

public class InchWorm
{
    private int position;
    private int toAdd = 1;
    private int direction;
    // TODO: Add instance variables
   
    public InchWorm()
    {
        position = 0;       // TODO: Complete constructor
    }
    
    public InchWorm (int initialPosition)
    {
        position = initialPosition;    // TODO: set the instance variable to the constructor parameter
    }
    
    public void move()
    {
        position = position + toAdd;    // TODO: Update the position of the inch worm   
    }
    
    public void turn()
    {
        toAdd = toAdd * (-1);    // TODO: Update the direction
    }
   
    public int getPosition()
    {
        return position;
    }
   
    public int getDirection()
    {
        return direction;
    }
}
