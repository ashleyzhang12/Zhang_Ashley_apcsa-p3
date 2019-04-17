//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import java.awt.Color;
import java.awt.Graphics;
import java.util.Random;

class SpeedUpBall extends Ball
{

   //instance variables
	private int xSpeed, ySpeed;

   public SpeedUpBall()
   {
	   super();

   }

   public SpeedUpBall(int x, int y)
   {
	   super(x,y);

   }


   public SpeedUpBall(int x, int y, int xSpd, int ySpd)
   {
	   super(x,y);
	   setXSpeed(xSpd);
	   setYSpeed(ySpd);


   }

   public SpeedUpBall(int x, int y, int wid, int ht, int xSpd, int ySpd)
   {
	   super(x,y, wid,ht);
	   setXSpeed(xSpd);
	   setYSpeed(ySpd);
	   
	   

   }


   public SpeedUpBall(int x, int y, int wid, int ht, Color col, int xSpd, int ySpd)
   {
	   super(x,y,wid,ht,col);
	   setXSpeed(xSpd);
	   setYSpeed(ySpd);
	   



   }

   public void setXSpeed( int xSpd )
   {
	   if(xSpd >0) xSpeed = xSpd + 2;
	   else if(xSpd < 0) 
		   xSpeed = xSpd - 2;
	   else
		   xSpeed = xSpd;



   }

   public void setYSpeed( int ySpd )
   {
	   if(ySpd >0) ySpeed = ySpd + 2;
	   else if (ySpd < 0)
		   ySpeed = ySpd - 2;
	   else
		   ySpeed = ySpd;
		   



   }
   
   public int getXSpeed()
   {
	   return xSpeed;
   }
   
   public int getYSpeed()
   {
	   return ySpeed;
   }
}


