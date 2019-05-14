//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Canvas;
import java.awt.event.ActionEvent;
import java.awt.event.KeyListener;
import java.awt.event.KeyEvent;
import static java.lang.Character.*;
import java.awt.image.BufferedImage;
import java.awt.event.ActionListener;
import java.util.ArrayList;

public class OuterSpace extends Canvas implements KeyListener, Runnable
{
	private Ship ship;
	private Alien alienOne;
	private Alien alienTwo;
	private Ammo ammo;

	// uncomment once you are ready for this part
	 
   private AlienHorde horde;
	private Bullets shots;
	

	private boolean[] keys;
	private BufferedImage back;

	public OuterSpace()
	{
		setBackground(Color.black);

		keys = new boolean[5];

		//instantiate other instance variables
		//Ship, Alien
		ship = new Ship(10,540);
		horde = new AlienHorde (20);
		shots = new Bullets();
		
		
		
		this.addKeyListener(this);
		new Thread(this).start();

		setVisible(true);
	}

   public void update(Graphics window)
   {
	   paint(window);
   }

	public void paint( Graphics window )
	{
		//set up the double buffering to make the game animation nice and smooth
		Graphics2D twoDGraph = (Graphics2D)window;

		//take a snap shop of the current screen and same it as an image
		//that is the exact same width and height as the current screen
		if(back==null)
		   back = (BufferedImage)(createImage(getWidth(),getHeight()));

		//create a graphics reference to the back ground image
		//we will draw all changes on the background image
		Graphics graphToBack = back.createGraphics();
		
		graphToBack.setColor(Color.BLUE);
		graphToBack.drawString("StarFighter ", 25, 50 );
		graphToBack.setColor(Color.BLACK);
		graphToBack.fillRect(0,0,800,600);
		ship.draw(graphToBack);
		horde.removeDeadOnes(shots.getList());
		horde.drawEmAll(graphToBack);
		horde.moveEmAll();
		
		shots.cleanEmUp();
		shots.drawEmAll(graphToBack);
		shots.moveEmAll();
		
		
	/*	if(ammo.getY() <= alienOne.getY() + alienOne.getHeight() + Math.abs(ammo.getSpeed())
		&& ammo.getY() >= alienOne.getY() + alienOne.getHeight()
		&& (ammo.getX() + ammo.getWidth() >= alienOne.getX()
				&& ammo.getX() <= alienOne.getX() + alienOne.getWidth()
					//|| ball.getX() + ball.getWidth() >= paddle.getX() + paddle.getWidth()
					//&& ball.getX() >= paddle.getX()
					))
	{
		
					
	}
	*/

		if(keys[0] == true)
		{
			ship.move("LEFT");
		}

		//add code to move Ship, Alien, etc.
		if(keys[1] == true)
		{
			ship.move("RIGHT");
		}
		if(keys[2] == true)
		{
			ship.move("UP");
		}
		if(keys[3] == true)
		{
			ship.move("DOWN");
		}
		if(keys[4] == true)
		{
			shots.add(new Ammo(ship.getX() + ship.getWidth()/2,ship.getY(),5));
			keys[4] = false;
		}
		

		//add in collision detection to see if Bullets hit the Aliens and if Bullets hit the Ship

		
			for (Alien al: horde.getList())
			{
				if(al.getX() <= ship.getX() + ship.getWidth() + Math.abs(al.getSpeed())
				&& al.getX() > ship.getX() + ship.getWidth()
				&& (al.getY() >= ship.getY() 
					&& al.getY() <= ship.getY() + ship.getHeight()
					|| al.getY() + al.getHeight() >= ship.getY() 
					&& al.getY() + al.getHeight() < ship.getY() + ship.getHeight())
				
				||
					
				//see if the al hits the left side ship
				al.getX() + al.getWidth() >= ship.getX()  - Math.abs(al.getSpeed())
				&& al.getX() + al.getWidth() < ship.getX()
				&& (al.getY() >= ship.getY() 
					&& al.getY() <= ship.getY() + ship.getHeight()
					|| al.getY() + al.getHeight() >= ship.getY()
					&& al.getY() + al.getHeight() < ship.getY() + ship.getHeight())
				
				||
				//see if al hits top of ship
				al.getY() + al.getHeight() >= ship.getY()  - Math.abs(al.getSpeed())
						&& al.getY() + al.getHeight() < ship.getY()
						&& (al.getX() + al.getWidth() >= ship.getX()
							&& al.getX() <= ship.getX() + ship.getWidth()
								|| al.getX() + al.getWidth() <= ship.getX() + ship.getWidth()
								&& al.getX() >= ship.getX())
						
					
				
				
				// see if al hits bottom of ship
			||
				 al.getY() <= ship.getY() + ship.getHeight() + Math.abs(al.getSpeed())
					&& al.getY() >= ship.getY() + ship.getHeight()
					&& (al.getX() + al.getWidth() >= ship.getX()
							&& al.getX() <= ship.getX() + ship.getWidth()
								//|| al.getX() + al.getWidth() >= ship.getX() + ship.getWidth()
								//&& al.getX() >= ship.getX()
								))
				{
					ship.setSpeed(0);
					ship.setCollide(true);
					for(Alien a: horde.getList()) 
						a.setSpeed(0);
					break;
				}
		}
			if(ship.getCollide())
			{
				graphToBack.setColor(Color.RED);
				graphToBack.drawString("You lose!", 400, 500);
			}
			
			if(horde.getList().size() == 0)
			{
				graphToBack.setColor(Color.GREEN);
				graphToBack.drawString("You win!", 400, 500);
			}

		twoDGraph.drawImage(back, null, 0, 0);
	}


	public void keyPressed(KeyEvent e)
	{
		if (e.getKeyCode() == KeyEvent.VK_LEFT)
		{
			keys[0] = true;
		}
		if (e.getKeyCode() == KeyEvent.VK_RIGHT)
		{
			keys[1] = true;
		}
		if (e.getKeyCode() == KeyEvent.VK_UP)
		{
			keys[2] = true;
		}
		if (e.getKeyCode() == KeyEvent.VK_DOWN)
		{
			keys[3] = true;
		}
		if (e.getKeyCode() == KeyEvent.VK_SPACE)
		{
			keys[4] = true;
		}
		repaint();
	}

	public void keyReleased(KeyEvent e)
	{
		if (e.getKeyCode() == KeyEvent.VK_LEFT)
		{
			keys[0] = false;
		}
		if (e.getKeyCode() == KeyEvent.VK_RIGHT)
		{
			keys[1] = false;
		}
		if (e.getKeyCode() == KeyEvent.VK_UP)
		{
			keys[2] = false;
		}
		if (e.getKeyCode() == KeyEvent.VK_DOWN)
		{
			keys[3] = false;
		}
		if (e.getKeyCode() == KeyEvent.VK_SPACE)
		{
			keys[4] = false;
		}
		repaint();
	}

	public void keyTyped(KeyEvent e)
	{
      //no code needed here
	}

   public void run()
   {
   	try
   	{
   		while(true)
   		{
   		   Thread.currentThread().sleep(5);
            repaint();
         }
      }catch(Exception e)
      {
      }
  	}
}

