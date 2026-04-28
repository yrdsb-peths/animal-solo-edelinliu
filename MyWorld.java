import greenfoot.*;

/**
 * The World our hero lives in.
 * 
 * @author Edelin
 * @version April 2026
 */

public class MyWorld extends World 
{
    /**
     * Constructor for objects of class MyWorld.
     * 
     */
    public MyWorld() {
        super(600, 400, 1);
        
        Elephant elephant = new Elephant();
        addObject(elephant, 300, 200);
    }
}
