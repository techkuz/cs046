// Complete this method to print a 2D array of ints in column and row format.
// Use printf with a format specifier of "%6d"
//     System.out.printf("%6d", ...);
// We will assume that none of the arrays the method is asked to print will
//have values greater than 999. You will need to use nested loops.
//
// Notice that the method is static. That is because it does not work on the
//instance variables of the class. It gets all its data as parameters

public class ArrayUtil
{
    /**
     * Prints the given 2D array in columns and rows
     * @param the array to print
     */
    public static void print2D(int[][] matrix)
    {
        for(int i = 0; i < matrix.length; i++)
        {
            for(int j = 0; j <matrix[0].length; j++)
            {
                System.out.printf("%6d", matrix[i][j]);
            }
            System.out.println();
        }// TODO: Complete this method to print a 2D array of ints in column and row format.
    }

}
