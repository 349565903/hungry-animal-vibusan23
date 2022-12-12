import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
/**
 * Title Screen.
 * 
 * @author Vibusan
 * 
 */

public class TitleScreen extends World
{
    Label titleLabel = new Label("The Hungry Elephant", 40);

    /**
     * Constructor for objects of class TitleScreen.
     * 
     */
    public TitleScreen()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(600, 400, 1); 
        addObject(titleLabel, getWidth()/2, getHeight()/2);
        prepare();
    }

    public void act()
    {
        if(Greenfoot.isKeyDown("space"));
        {
            MyWorld gameWorld = new MyWorld();
            Greenfoot.setWorld(gameWorld);
        }
    }
    
    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */
    private void prepare()
    {
        elephanr elephanr = new elephanr();
        addObject(elephanr,424,103);
        elephanr.setLocation(121,76);
        elephanr.setLocation(61,158);
        Label label = new Label("Eat the Apple to Win!", 30);
        addObject(label,228,285);
        label.setLocation(279,90);
        label.setLocation(302,82);
        elephanr.setLocation(76,213);
        Label label2 = new Label("Press <space> to Start!", 30);
        addObject(label2,274,322);
        label2.setLocation(315,336);
        Apple apple = new Apple();
        addObject(apple,532,199);
        elephanr.setLocation(88,203);
        label2.setLocation(277,336);
        label.setLocation(273,80);
        elephanr.setLocation(85,218);
        apple.setLocation(543,216);
        apple.setLocation(501,198);
        label.setLocation(304,86);
        label2.setLocation(320,335);
        label2.setLocation(257,334);
        label2.setLocation(303,326);
        apple.setLocation(507,213);
    }
}
