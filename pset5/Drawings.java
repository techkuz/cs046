// Complete the code to write nested loops that make the following pattern of brackets:
//[][][][]
//[][][][]
//[][][][]

public class Drawings
{
    private static final int ROWS = 3;
    private static final int COLUMNS = 4;
    public void blockPrinter()
    {   
        
        for(int i = 0; i < ROWS; i++)
        {
            for(int j = 0; j < COLUMNS; j++)
            {
                System.out.print("[]");
            }
            System.out.println();
        }//TODO Write code to print the pattern above.
    }
}
