

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
	import java.util.List;
public class BreakOut  extends Canvas implements KeyListener, Runnable
{
		private Ball ball;
		private Paddle paddle;
		private boolean[] keys;
		private BufferedImage back;
		private List<Block> blocks;

		
		public BreakOut()
		{
			//set up all variables related to the game
			ball = new Ball();
			paddle = new Paddle(400,300, 40,40, Color.RED,5);
			keys = new boolean[4];
			blocks = new ArrayList<Block>();
			
			
			drawBlocks();
	    	
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

			ball.moveAndDraw(graphToBack);
			paddle.draw(graphToBack);
			
			if(blocks.size() == 0)
			{
				drawBlocks();
				ball.draw(graphToBack, Color.WHITE);
				paddle.draw(graphToBack,Color.WHITE);
				ball.setPos(400,300);
				paddle.setPos(420,300);
				
			}
			for(int i = 0; i < blocks.size();i ++)
			   {
				   blocks.get(i).draw(graphToBack);
			   }
			
			
		
			
			//see if ball hits right or left wall
			if(!(ball.getX() >= 10 && ball.getX() <= 780))
			{	
				
				ball.setXSpeed(-ball.getXSpeed());
			}
			
			if(!(ball.getY() >= 10 && ball.getY() <= 560))
			{
				ball.setYSpeed(-ball.getYSpeed());
				
			}
			
	   

			//see if the ball hits the right side of paddle
			
			if(ball.getX() <= paddle.getX() + paddle.getWidth() + Math.abs(ball.getXSpeed())
			&& ball.getX() > paddle.getX() + paddle.getWidth()
			&& (ball.getY() >= paddle.getY() 
				&& ball.getY() <= paddle.getY() + paddle.getHeight()
				|| ball.getY() + ball.getHeight() >= paddle.getY() 
				&& ball.getY() + ball.getHeight() < paddle.getY() + paddle.getHeight()))
			{
				//if(ball.getX() <= paddle.getX() + paddle.getWidth() - Math.abs(ball.getXSpeed()))
				//	ball.setYSpeed(-ball.getYSpeed());
				//else
				ball.setXSpeed(-ball.getXSpeed());			
			}
			
				
			//see if the ball hits the left side paddle
			if(ball.getX() + ball.getWidth() >= paddle.getX()  - Math.abs(ball.getXSpeed())
			&& ball.getX() + ball.getWidth() < paddle.getX()
			&& (ball.getY() >= paddle.getY() 
				&& ball.getY() <= paddle.getY() + paddle.getHeight()
				|| ball.getY() + ball.getHeight() >= paddle.getY()
				&& ball.getY() + ball.getHeight() < paddle.getY() + paddle.getHeight()))
			{
		
					ball.setXSpeed(-ball.getXSpeed());
				
			}
			
			//see if ball hits top of paddle
			if(ball.getY() + ball.getHeight() >= paddle.getY()  - Math.abs(ball.getYSpeed())
					&& ball.getY() + ball.getHeight() < paddle.getY()
					&& (ball.getX() + ball.getWidth() >= paddle.getX()
						&& ball.getX() <= paddle.getX() + paddle.getWidth()
							|| ball.getX() + ball.getWidth() <= paddle.getX() + paddle.getWidth()
							&& ball.getX() >= paddle.getX()))
					ball.setYSpeed(-ball.getYSpeed());
				
			
			
			// see if ball hits bottom of paddle
			
			if(ball.getY() <= paddle.getY() + paddle.getHeight() + Math.abs(ball.getYSpeed())
				&& ball.getY() >= paddle.getY() + paddle.getHeight()
				&& (ball.getX() + ball.getWidth() >= paddle.getX()
						&& ball.getX() <= paddle.getX() + paddle.getWidth()
							//|| ball.getX() + ball.getWidth() >= paddle.getX() + paddle.getWidth()
							//&& ball.getX() >= paddle.getX()
							))
			{
				
				ball.setYSpeed(-ball.getYSpeed());			
			}
			
			
			//check if it hits the blocks
			for(int i = 0; i < blocks.size(); i ++)
			{
				Block b = blocks.get(i);
				if(ball.getX() <=b.getX() + b.getWidth() + Math.abs(ball.getXSpeed())
				&& ball.getX() > b.getX() + b.getWidth()
				&& (ball.getY() >= b.getY() 
					&& ball.getY() <= b.getY() + b.getHeight()
					|| ball.getY() + ball.getHeight() >= b.getY() 
					&& ball.getY() + ball.getHeight() < b.getY() + b.getHeight()))
				{
					//if(ball.getX() <= paddle.getX() + paddle.getWidth() - Math.abs(ball.getXSpeed()))
					//	ball.setYSpeed(-ball.getYSpeed());
					//else
					
					b.setColor(Color.WHITE);
					b.draw(graphToBack);
					blocks.remove(i);
					ball.setXSpeed(-ball.getXSpeed());
					
				}
				
					
				//see if the ball hits the left side paddle
				if(ball.getX() + ball.getWidth() >= b.getX()  - Math.abs(ball.getXSpeed())
				&& ball.getX() + ball.getWidth() < b.getX()
				&& (ball.getY() >= b.getY() 
					&& ball.getY() <= b.getY() + b.getHeight()
					|| ball.getY() + ball.getHeight() >= b.getY()
					&& ball.getY() + ball.getHeight() < b.getY() + b.getHeight()))
				{
					
					b.setColor(Color.WHITE);
					b.draw(graphToBack);
					blocks.remove(i);
						ball.setXSpeed(-ball.getXSpeed());
						
					
				}
				
				//see if ball hits top of paddle
				if(ball.getY() + ball.getHeight() >= b.getY()  - Math.abs(ball.getYSpeed())
						&& ball.getY() + ball.getHeight() < b.getY()
						&& (ball.getX() + ball.getWidth() >= b.getX()
							&& ball.getX() <= b.getX() + b.getWidth()
								|| ball.getX() + ball.getWidth() <= b.getX() + b.getWidth()
								&& ball.getX() >= b.getX()))
				{
					
					b.setColor(Color.white);
					b.draw(graphToBack);
					blocks.remove(i);
					ball.setYSpeed(-ball.getYSpeed());
				}
						
						
					
				
				
				// see if ball hits bottom of paddle
				
				if(ball.getY() <= b.getY() + b.getHeight() + Math.abs(ball.getYSpeed())
					&& ball.getY() >= b.getY() + b.getHeight()
					&& (ball.getX() + ball.getWidth() >= b.getX()
							&& ball.getX() <= b.getX() + b.getWidth()
								//|| ball.getX() + ball.getWidth() >= paddle.getX() + paddle.getWidth()
								//&& ball.getX() >= paddle.getX()
								))
				{
					
					b.setColor(Color.white);
					b.draw(graphToBack);
					blocks.remove(i);
					ball.setYSpeed(-ball.getYSpeed());			
				}
				
			}
			
			//see if the paddles need to be moved
			if(keys[0])
				paddle.moveUpAndDraw(graphToBack); //need to use graphToBack instead of window 
			if(keys[1]) 
				paddle.moveDownAndDraw(graphToBack);
			if(keys[2])
				paddle.moveLeftandDraw(graphToBack);
			if(keys[3])
				paddle.moveRightandDraw(graphToBack);
			
			twoDGraph.drawImage(back, null,0,0);
			
			
		}

		public void keyPressed(KeyEvent e)
		{
			switch(toUpperCase(e.getKeyChar()))
			{
				case 'W' : keys[0]=true; break;
				case 'S' : keys[1]=true; break;
				case 'A' : keys[2]=true; break;
				case 'D' : keys[3]=true; break;
			
			}
		}

		public void keyReleased(KeyEvent e)
		{
			switch(toUpperCase(e.getKeyChar()))
			{
				case 'W' : keys[0]=false; break;
				case 'S' : keys[1]=false; break;
				case 'A' : keys[2]=false; break;
				case 'D' : keys[3]=false; break;
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
	   
	   public void drawBlocks()
	   {
		   
		   for(int i = 10; i < 110; i = i + 50)
		   {
			   for(int j = 10; j < 760; j = j + 150)
			   {
				   blocks.add( new Block(j,i,140,40, Color.GREEN));
			   }
		   }
		   
		   for(int k = 460; k < 560; k = k + 50)
		   {
			   for(int l = 10; l < 760; l = l + 150)
			   {
				   blocks.add(new Block(l,k,140,40, Color.GREEN));
			   }
		   }
		   
		   for(int i = 10; i< 310; i = i + 150)
		   {
			   for( int j = 110; j < 420; j  = j + 50)
			   {
				   blocks.add(new Block(i,j,140,40, Color.GREEN));
			   }
		   }
		   
		   for(int i = 460; i < 760; i = i + 150)
		   {
			   for(int j = 110; j < 420; j = j + 50)
			   {
				   blocks.add(new Block(i,j,140,40,Color.GREEN));
			   }
		   }
		   
		    
	   }
	}




