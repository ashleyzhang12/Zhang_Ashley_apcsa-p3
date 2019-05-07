//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import java.awt.Color;
import java.awt.Graphics;

public class Paddle extends Block
{
   //instance variables
   private int speed;

   public Paddle()
   {
	super(10,10);
      speed =5;
   }


   //add the other Paddle constructors
   public Paddle(int x, int y)
   {
	   super(x,y);
	   setSpeed(5);
   }
   
   public Paddle(int x, int y, int s)
   {
	   super(x,y);
	   setSpeed(s);
   }
   public Paddle(int x, int y, int w, int h, int s)
   {
	   super(x,y,w,h);
	   setSpeed(s);
   }
   public Paddle(int x, int y, int w, int h, Color c, int s)
   {
	   super(x,y,w,h,c);
	   setSpeed(s);
   }

   public void moveUpAndDraw(Graphics window)
   {
	   draw(window, Color.WHITE);
	    //if(getY() > 0)
	    	setY(getY() - speed);
	   draw(window);
   }

   public void moveDownAndDraw(Graphics window)
   {
	   draw(window, Color.WHITE);
	  //if(getY() < 600 - getHeight())
		  setY(getY() + speed);
	   draw(window);

   }
   
   public void moveLeftandDraw(Graphics window)
   {
	   draw(window, Color.WHITE);
	    //if (getX() > 0) setX(getX() - speed);
	   setX(getX() - getSpeed());
	   draw(window);
   }
   
   public void moveRightandDraw(Graphics window)
   {
	   draw(window, Color.WHITE);
	   //if(getX() < 800 - getWidth())setX(getX() + speed);
	   setX(getX() + getSpeed());
	   draw(window);
   }

   //add get methods
   public void setSpeed(int s)
   {
	   speed = s;
   }
   public int getSpeed()
   {
	   return speed;
   }
   
   //add a toString() method
   public String toString()
   {
	   return super.toString() + " " + getSpeed();
   }
}