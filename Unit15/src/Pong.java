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

public class Pong extends Canvas implements KeyListener, Runnable, Collidable
{
	private Ball ball;
	private Paddle leftPaddle;
	private Paddle rightPaddle;
	private boolean[] keys;
	private BufferedImage back;


	public Pong()
	{
		//set up all variables related to the game




		keys = new boolean[4];

    
    	setBackground(Color.WHITE);
		setVisible(true);
		
		new Thread(this).start();
		addKeyListener(this);		//starts the key thread to log key strokes
	}
	
   public void update(Graphics window){
	   paint(window);
   }

   public void paint(Graphics window)
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


		ball.moveAndDraw(graphToBack);
		leftPaddle.draw(graphToBack);
		rightPaddle.draw(graphToBack);


		//see if ball hits left wall or right wall
		if(!(ball.getX()>=10 && ball.getX()<=780))
		{
			ball.setXSpeed(0);
			ball.setYSpeed(0);
		}

		
		//see if the ball hits the top or bottom wall 
		if(ball.getY() >= 10 && ball.getY() <= 780)
		{
			ball.setXSpeed(0);
			ball.setYSpeed(0);
		}
   




		//see if the ball hits the left paddle
		if(didCollideLeft(ball) == true)
		{
			if(ball.getX() <= leftPaddle.getX() + leftPaddle.getWidth() - Math.abs(ball.getXSpeed()))
				ball.setYSpeed(ball.getYSpeed() * -1);
			else
				ball.setXSpeed(ball.getXSpeed() * -1);
		}
			
		
		
		
		//see if the ball hits the right paddle
		if(didCollideRight(ball) == true)
		{
			if(ball.getX() <= rightPaddle.getX() + rightPaddle.getWidth() - Math.abs(ball.getXSpeed()))
				ball.setYSpeed(ball.getYSpeed() * -1);
			else
				ball.setXSpeed(ball.getXSpeed() * -1);
		}
		


		//see if the paddles need to be moved















		
		twoDGraph.drawImage(back, null, 0, 0);
	}

   	
   	
   	public boolean didCollideRight()
   	{
   		if(ball.getX() <= rightPaddle.getX() + rightPaddle.getWidth() + Math.abs(ball.getXSpeed())
		&& (ball.getY() >= rightPaddle.getY() && 
		ball.getY() <= rightPaddle.getY() + rightPaddle.getHeight() || (ball.getY() + ball.getHeight()) >= leftPaddle.getY()
		&& (ball.getY() + ball.getHeight()) < rightPaddle.getY() + rightPaddle.getHeight()))
		{
			return true;
		}
		return false;
   	}
   	
   	public boolean didCollideTop()
   	{
   		if(ball.getY() == 0)
   			return true;
   		else 
   			return false;
   	}
   	
   	public boolean didCollideBottom()
   	{
   		if(ball.getY() == 600)
   			return true;
   		else
   			return false;
   	}
	public void keyPressed(KeyEvent e)
	{
		switch(toUpperCase(e.getKeyChar()))
		{
			case 'W' : keys[0]=true; break;
			case 'Z' : keys[1]=true; break;
			case 'I' : keys[2]=true; break;
			case 'M' : keys[3]=true; break;
		}
	}

	public void keyReleased(KeyEvent e)
	{
		switch(toUpperCase(e.getKeyChar()))
		{
			case 'W' : keys[0]=false; break;
			case 'Z' : keys[1]=false; break;
			case 'I' : keys[2]=false; break;
			case 'M' : keys[3]=false; break;
		}
	}

	public void keyTyped(KeyEvent e){}
	
   public void run()
   {
   	try
   	{
   		while(true)
   		{
   		   Thread.currentThread().sleep(8);
            repaint();
         }
      }catch(Exception e)
      {
      }
  	}	
}