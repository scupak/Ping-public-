import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class LeftPlayer here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class PlayerPaddle extends Player
{
    /**
     * Act - do whatever the LeftPlayer wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
       if(Greenfoot.isKeyDown("right"))
         {
           moveRight();
         }
       if(Greenfoot.isKeyDown("left"))
         {
          moveLeft();
         }
    }    
}
