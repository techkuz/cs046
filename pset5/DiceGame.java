// lesson6/chevalier_de_mere

import java.util.Random;

public class DiceGame
{
    Random generator;
    
    public DiceGame()
    {   
        generator = new Random(45);
    }
    /** 
     * Throw a die four times and bet on at least one 6. 
     * @return true if the chevalier wins. 
     */
    public boolean game1()
    {   
        int number;
        boolean win = false;
        for(int i = 0; i < 4; i++)
        {
            number = generator.nextInt(6) + 1;
            //System.out.print(number);
            if(number == 6)
            {
                win = true;
            }
        }
        return win;// YOUR CODE HERE
        // Use the instance variable generator to simulate 
        // 4 die rolls. 
        // Return true if the chevalier wins (at least one is a 6).
    }
    
    /**
     * Throw two dice 24 times and bet on at least one double-six.
     * @return true if the chevalier wins. 
     */
    public boolean game2()
    {   
        int numberOne;
        int numberTwo;
        boolean win = false;
        for(int i = 0; i < 24; i++)
        {
            
            numberOne = generator.nextInt(6) + 1;
            numberTwo = generator.nextInt(6) + 1;
            if(numberOne == 6 && numberTwo == 6)
            {
                win = true;
            }
            
        }
        return win;// YOUR CODE HERE 
        // Use the instance variable generator to simulate 
        // 24 rolls of a pair of dice.
        // Return true if at least one pair is both 6s. 
    }
}
