// BlueJ Project: lesson4/fields

public class Plot
{
    private int width;
    private int length;

    /**
        Constructs a plot of a given size.
        @param width the width of the plot
        @param length the length of the plot
    */
    public Plot(int width, int length)
    {
        this.width = width;
        this.length = length;
    }

    /**
     * Calculates the number of circular fields that can fit on this plot.
     */
    public int getNumberOfFields(int radius)
    {
        int diameter = radius * 2;
        int rows = (int) ((length - diameter) / (radius * Math.sqrt(3)) + 1);
        int columnsPerOdd = (int) (width / diameter);
        int columnsPerEven = (int) ((width - radius) / diameter);
        int oddRows = (int) (rows + 1) /2 ;
        int evenRows = (int) (rows / 2) ;
        return columnsPerOdd * oddRows + columnsPerEven * evenRows; // TODO: Using the formulas that we developed, compute
        // the total number of rows, then
        // the number of even and odd rows,
        // the number of columns in each even and odd row,
        // and finally the total number of fields
    }
}
