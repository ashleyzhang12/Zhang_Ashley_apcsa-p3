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

public class Pong extends Canvas implements KeyListener, Runnable
{
	private Ball ball;
	private Paddle leftPaddle;
	private Paddle rightPaddle;
	private boolean[] keys;
	private BufferedImage back;
	private int scoreRight, scoreLeft;
	private Block rightWall, leftWall, topWall, bottomWall;

	
	public Pong()
	{
		//set up all variables related to the game
		ball = new BlinkyBall();
		leftPaddle = new Paddle(20, 10, 10, 40, Color.RED, 5);
		rightPaddle = new Paddle(770, 10, 10, 40, Color.RED, 5);
		keys = new boolean[4];
		scoreRight = 0;
		scoreLeft = 0;
		rightWall = new Block(790, 0, 10, 600, Color.WHITE);
		leftWall = new Block(0, 0, 10, 600, Color.WHITE);
		topWall = new Block(0, 0, 800, 10, Color.WHITE);
		bottomWall = new Block(0, 490, 800, 10, Color.WHITE);
    
    	setBackground(Color.WHITE);
		setVisible(true); //generates background thread that calls update()
		
		this.addKeyListener(this);		//starts the key thread to log key strokes
		new Thread(this).start();	
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

		graphToBack.setColor(Color.RED);
		
		ball.moveAndDraw(graphToBack);
		leftPaddle.draw(graphToBack);
		rightPaddle.draw(graphToBack);
		
				//see if ball hits left wall or right wall
		//if(!(ball.getX()>=10 && ball.getX()<=780))
		if(ball.getX() <= leftWall.getX() + leftWall.getWidth())
		{
			if(ball.getXSpeed() != 0) scoreRight++;
			ball.setXSpeed(0);
			ball.setYSpeed(0);
			ball.draw(graphToBack, Color.WHITE);
			
			try
			{
				Thread.currentThread().sleep(950);
			}catch(Exception e){ }
			//set position and speed
			ball.setX((int)(Math.random() * 400));
			ball.setY((int)(Math.random() * 400));
			ball.setXSpeed(2);
			ball.setYSpeed(1);	
		}
		
		if(ball.getX() + ball.getWidth() >= rightWall.getX())
		{	
			if(ball.getXSpeed() != 0) scoreLeft++;
			
			ball.setXSpeed(0);
			ball.setYSpeed(0);
			ball.draw(graphToBack, Color.WHITE);
			
			try
			{
				Thread.currentThread().sleep(950);
			}catch(Exception e){ }
			//set position and speed
			ball.setX((int)(Math.random() * 400));
			ball.setY((int)(Math.random() * 400));
			ball.setXSpeed(2);
			ball.setYSpeed(1);	
		}
		
		//make a rectangle and paint it white every time so we don't have weird leftover scores
		graphToBack.setColor(Color.WHITE);
		graphToBack.fillRect(440,  520,  80,  80);
		graphToBack.fillRect(640,  520, 100, 100);
		graphToBack.fillRect(140, 520, 100, 100);
		
		graphToBack.setColor(Color.RED);
		
		graphToBack.drawString("Right Player: " + scoreRight, 400, 540);
		graphToBack.drawString("Left Player: " + scoreLeft, 400, 560);
	
		//see if the ball hits the top or bottom wall 
		if(ball.getY() + ball.getHeight() >= bottomWall.getY() || ball.getY() <= topWall.getY())
		{
			ball.setYSpeed(-ball.getYSpeed());
			ball.setColor(((BlinkyBall)ball).randomColor());
		}

		//see if the ball hits the left paddle
		
		if(ball.getX() <= leftPaddle.getX() + leftPaddle.getWidth() + Math.abs(ball.getXSpeed())
				&& (ball.getY() >= leftPaddle.getY() 
					&& ball.getY() <= leftPaddle.getY() + leftPaddle.getHeight()
						|| ball.getY() + ball.getHeight() >= leftPaddle.getY() 
						&& ball.getY() + ball.getHeight() < leftPaddle.getY() + leftPaddle.getHeight()))
		{
			if(ball.getX() <= leftPaddle.getX() + leftPaddle.getWidth() - Math.abs(ball.getXSpeed()))
				{
					(ball).setYSpeed(-ball.getYSpeed());
					if(ball.getXSpeed() != 0) ball.setColor(((BlinkyBall)ball).randomColor());
				}
			else 
			{
				ball.setXSpeed(-ball.getXSpeed());
				if(ball.getYSpeed() != 0) ball.setColor(((BlinkyBall)ball).randomColor());
			}			
		}
			
		//see if the ball hits the right paddle; still probably buggy
		if(ball.getX() >= rightPaddle.getX() - rightPaddle.getWidth() + Math.abs(ball.getXSpeed())
				&& (ball.getY() >= rightPaddle.getY() 
					&& ball.getY() <= rightPaddle.getY() + rightPaddle.getHeight()
						|| ball.getY() + ball.getHeight() >= rightPaddle.getY()
						&& ball.getY() + ball.getHeight() < rightPaddle.getY() + rightPaddle.getHeight()))
		{
			//what does this if statement even do?? it's probably incorrect
			if(ball.getX() >= rightPaddle.getX() - Math.abs(ball.getXSpeed()))
			{
				ball.setYSpeed(-ball.getYSpeed());
				if(ball.getXSpeed() != 0) ball.setColor(((BlinkyBall)ball).randomColor());
			}
			else
			{
				System.out.println(ball.getXSpeed());
				ball.setXSpeed(-ball.getXSpeed());
				System.out.println(ball.getXSpeed());
				if(ball.getYSpeed() != 0) ball.setColor(((BlinkyBall)ball).randomColor());

			}
		}
		
		//see if the paddles need to be moved
		if(keys[0]) leftPaddle.moveUpAndDraw(graphToBack); //need to use graphToBack instead of window 
		if(keys[1]) leftPaddle.moveDownAndDraw(graphToBack);
		if(keys[2]) rightPaddle.moveUpAndDraw(graphToBack);
		if(keys[3]) rightPaddle.moveDownAndDraw(graphToBack);
		
		//draw scoring--IT'S NOT WORKING
		graphToBack.setColor(Color.RED);
		graphToBack.drawString("Left Player Score: " + scoreLeft + "\nRight Player Score: " + scoreRight, 100, 600);

		twoDGraph.drawImage(back, null, 0, 0);
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
