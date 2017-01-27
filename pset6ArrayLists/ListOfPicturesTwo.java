// BlueJ project: lesson7/gallery3

import java.util.ArrayList;

public class ListOfPicturesTwo
{
    public static void main(String[] args)
    {
        ArrayList<Picture> gallery = new ArrayList<Picture>();
        gallery.add(new Picture("degas1.jpg"));
        gallery.add(new Picture("gaugin1.jpg"));
        gallery.add(new Picture("monet1.jpg"));
        gallery.add(new Picture("monet2.jpg"));
        gallery.add(new Picture("renoir1.jpg"));
        int xCoord = 0;
        for (Picture pic : gallery)
        {   
            pic.translate(xCoord + 10, 0);
            
            xCoord = pic.getMaxX();
            // TODO: Move the first picture to offset 10, 
            // the second picture ten pixels to the right of the first one,
            // and so on
        }
        
        for (Picture pic : gallery)
        {
            pic.draw();
        }
    }
}
