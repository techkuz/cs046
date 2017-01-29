// BlueJ project: lesson8/collecting2

// TODO: Reimplement this class without collecting the individual scores

/**
 * Holds the homework scores for a student.
 */
public class HomeworkScores
{   
    private double min;
    private double scores;
    private int currentSize; // The current size of the array of scores
    
    
    public HomeworkScores()
    {
        scores = 0;
        currentSize = 0;
        min = 0;
        
    }

   /**
    *  Adds a score.
    *  @param score the score to add
    */
    public void addScore(double score)
    {       
        
        currentSize++;
        if(currentSize == 1)
        {
            min = score;
        }
        else if(min > score)
        {
            min = score;
        }

        scores = scores + score;
  
        
        
    }

   /**
    *  Calculates the sum of all the scores entered, dropping the lowest
    *  score if there is more than one.
    *  @return the sum of all the scores in scores.
    */
    public double getTotalExcludingLowest()
    {   
        System.out.println("ExcludeLow");
        if(currentSize > 1)
        {
            return scores - min;
        }
        else
        {
            return min;
        }
        
    }

   /**
    *  Calculates the lowest score.
    *  @return the lowest score or 0 if there are no scores 
    */
    private double getLowest()
    {
        System.out.println("getLow");
        return min;
    }       
}
