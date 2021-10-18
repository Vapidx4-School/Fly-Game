import lang.stride.*;
import greenfoot.*;

/**
 * Write a description of class enemy here.
 * @author (your name) @version (a version number or a date)
 */
public class enemy extends Actor
{

    /* (World, Actor, GreenfootImage, Greenfoot and MouseInfo)*/

    /**
     * Act - do whatever the enemy wants to do. This method is called whenever the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        move(Greenfoot.getRandomNumber(8));
        if (isAtEdge()) {
            turn(90);
        }
        if (isTouching(player.class)) {
            turn(-20);
        }
        if (isTouching(player.class)) {
            turn(360);
        }
    }

    /* Add your action code here.*/
}
