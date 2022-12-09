import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class elephanr here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class elephanr extends Actor
{
   GreenfootSound elephanrSound = new GreenfootSound("elephant-trumpet-growls-6047");
    
    public void act()
    {
        if(Greenfoot.isKeyDown("left"))
        {
            move(-1);
        }
        else if (Greenfoot.isKeyDown("right"))
        {
            move(1);
        }
        
        eat();
         
    }
    
    public void eat()
    {
        if(isTouching(Apple.class))
        {
            removeTouching(Apple.class);
            MyWorld world = (MyWorld) getWorld();
            world.createApple();
            world.increaseScore();
        }
    }
}
