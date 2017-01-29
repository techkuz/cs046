// BlueJ project: lesson7/blocks

public class Blocks
{
    public static void main(String[] args)
    {
        Picture pic = new Picture("eiffel-tower.jpg");
        int[][] pixels = pic.getGrayLevels();
        
        // TODO:
        // 1) Update the for loops below with the correct conditions
        // 2) Update the indices that we are using to access the 2D-array
        //    pixels, so we are using the correct elements from pixels
        
        for (int x = 0; x < pixels.length; x = x + 2)
        {
            for (int y = 0; y < pixels[0].length; y = y + 2)
            {
                int avg = (pixels[x][y] + pixels[x + 1][y]
                    + pixels[x][y + 1] + pixels[x + 1][y + 1]) / 4;
                pixels[x][y] = avg;
                pixels[x + 1][y] = avg;
                pixels[x][y + 1] = avg;
                pixels[x + 1][y + 1] = avg;                
            }
        }

        pic.draw();
        Picture pic2 = new Picture(pixels);
        pic2.translate(pic.getWidth() + 10, 0);
        pic2.draw();
    }
}
