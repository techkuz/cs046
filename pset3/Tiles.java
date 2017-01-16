// BlueJ project: Tiles
// Video: Your turn to do it by hand

import java.util.Scanner;

public class Tiles
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);

        System.out.print("Width of wall: ");
        double width = in.nextDouble();

        System.out.print("Tile size: ");
        double tileSize = in.nextDouble();

        // TODO: Complete these computations
        System.out.println(width - tileSize);
        System.out.println(tileSize * 2.0);
        System.out.println
        int pairs = (int)((width - tileSize) / (tileSize * 2.0));
        int redTiles = pairs ;
        int whiteTiles = pairs  + 1;

        System.out.println("Red tiles: " + redTiles);
        System.out.println("Whites tiles: " + whiteTiles);
    }
}
