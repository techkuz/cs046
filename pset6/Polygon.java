//Create a Polygon class. A polygon is a closed shape with lines joining the corner points.
//You will keep the points in an array list. Use object of java.awt.Point for the point.

//Polygon will have as an instance variable an ArrayList of Points to hold the points
//The constructor takes no parameters but initializes the instance variable.  The
//Polygon class also has the following methods:
//    add: adds a Point to the polygon
//    perimeter: returns the perimeter of the polygon
//    draw: draws the polygon by connecting consecutive points and then
//          connecting the last point to the first.
//
//No methods headers or javadoc is provided this time. You get to try your hand at writing
//a class almost from scratch

// Need help starting this question? In the lesson titled 
// "Starting points: Problem Set Questions", go to the
// problem titled "Problem Set 6 - Question 3" for some tips on 
// how to begin.

import java.util.ArrayList;
import java.awt.Point;

public class Polygon
{
    ArrayList<Point> points;
    
    public Polygon()
    {
        points = new ArrayList<Point>();
        
    }
    
    public void add(Point point)
    {
        points.add(point);
    }
    
    public double perimeter()
    {   
        double perimeter = 0;
        double xOld = 0;
        double yOld = 0;
        double x;
        double y;
        for(int i = 0; i < points.size(); i++)
        {   
            if(i == 0)
            {
                xOld = points.get(i).getX();
                yOld = points.get(i).getY();
                
            }
            else
            {   
                x = points.get(i).getX();
                y = points.get(i).getY();
                
                perimeter = perimeter + Math.sqrt((x - xOld) * (x - xOld) + (y - yOld) * (y - yOld));
                
                xOld = x;
                yOld = y;
            }
        }
        perimeter = perimeter + Math.sqrt((points.get(0).getX() - 
        points.get(points.size() - 1).getX()) * (points.get(0).getX() - 
        points.get(points.size() - 1).getX()) + ((points.get(0).getY() - 
        points.get(points.size() - 1).getY()) * ((points.get(0).getY() - 
        points.get(points.size() - 1).getY()))));  // add first-last line
        
        return perimeter;
    }
    
    public void draw()
    {   
        Line line;
        double xOld = 0;
        double yOld = 0;
        double x;
        double y;
        for(int i = 0; i < points.size(); i++)
        {   
            if(i == 0)
            {
                xOld = points.get(i).getX();
                yOld = points.get(i).getY();
            }
            else
            {   
                x = points.get(i).getX();
                y = points.get(i).getY();
                line = new Line(xOld, yOld, x, y);
                line.draw();
                xOld = x;
                yOld = y;
            }
        }
        
        line = new Line(points.get(0).getX(), points.get(0).getY(),
        points.get(points.size() - 1).getX(), points.get(points.size() - 1).getY());
        line.draw(); // add first-last line
    }
    
    // TODO: provide the required constructor, instance variable, and methods
}
