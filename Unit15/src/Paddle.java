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
	   window.setColor(Color.WHITE);
	   window.fillRect(getX(), getY(), getWidth(), getHeight());
	   if(getY() < 0)
		  setY(0);
	   else
		   setY(getY() - speed);
	   setColor(getColor());
	   window.fillRect(getX(), getY(), getWidth(), getHeight());

   }

   public void moveDownAndDraw(Graphics window)
   {
	   window.setColor(Color.WHITE);
	   window.fillRect(getX(), getY(), getWidth(), getHeight());
	   if(getY() > 600 - (2 *getHeight()))
		  setY(600 - (2 * getHeight()));
	   else
		   setY(getY() + speed);
	   setColor(getColor());
	   window.fillRect(getX(), getY(), getWidth(), getHeight());


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