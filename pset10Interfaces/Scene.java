// BlueJ project: lesson9/scene2

import java.util.ArrayList;

public class Scene implements Drawable
{
    public void draw()
        {
            
        }
    public static void main(String[] args)
    {
        // TODO: Change to an ArrayList<Drawable>
        
        ArrayList<Drawable> house = new ArrayList<Drawable>();
        house.add(new Car(100, 300));
        house.add(new Car(250, 300));
        house.add(new Car(250, 350));

       
        house.add(new House(100, 150, 100, 100));
        house.add(new House(250, 100, 150, 150));

        
        house.add(new Dog(200, 100, "Fido.jpg"));
        house.add(new Dog(100, 400, "Rex.jpg"));
        house.add(new Dog(200, 400, "Lucky.jpg"));
        
        
        for (Drawable item : house)
        {
            item.draw();
        }
    }
}
