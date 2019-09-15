import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class MyWorld here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class PingWorld extends World
{
    private static final int WORLD_WIDTH = 500;
    private static final int WORLD_HEIGHT = 700;

    public PingWorld()
    { 
        // calling the other constructor with gameStarted = false.
        this(false);       
    }
    
    
    /**
     * Constructor for objects of class PingWorld.
     */
    public PingWorld(boolean gameStarted)
    {
        super(WORLD_WIDTH, WORLD_HEIGHT, 1); 
        if (gameStarted)
        {
            //GreenfootImage background = getBackground();
            //background.setColor(Color.BLACK);
            // Create a new world with WORLD_WIDTHxWORLD_HEIGHT cells with a cell size of 1x1 pixels.
            //addObject(new Ball(), WORLD_WIDTH/2, WORLD_HEIGHT/2);
            addObject(new EnemyPaddle(100,20), 60, WORLD_HEIGHT - 500);
            addObject(new PlayerPaddle(), 60, WORLD_HEIGHT - 20);
        }
        else
        {
            Greenfoot.setWorld(new IntroWorld());
        }
    }

}
