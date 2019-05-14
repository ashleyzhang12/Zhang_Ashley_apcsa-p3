//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import java.io.File;
import java.net.URL;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Image;
import javax.imageio.ImageIO;

public class Ship extends MovingThing
{
	private int speed;
	private Image image;
	private boolean col;

	public Ship()
	{
		this(400,300,50,50,10);
	}

	public Ship(int x, int y)
	{
	   //add code here
		this(x,y,50,50,10);
	}

	public Ship(int x, int y, int s)
	{
	   //add code here
		this(x,y,50, 50, s);
	}

	public Ship(int x, int y, int w, int h, int s)
	{
		super(x, y,w,h);
		speed=s;
		col = false;
		try
		{
			//URL url = getClass().getResource("/images/ship.jpg");
			image = ImageIO.read(new File("src/ship.jpg"));
		}
		catch(Exception e)
		{
			//feel free to do something here
			System.out.println("Image did not load");
		}
	}


	public void setSpeed(int s)
	{
	   //add more code
		speed = s;
	}

	public int getSpeed()
	{
	   return speed;
	}
	
	public void setCollide(boolean c)
	{
		col = c;
	}
	
	public boolean getCollide()
	{
		return col;
	}

	public void move(String direction)
	{
		//add code here
		if(direction.equals("DOWN"))
		{
			if(getY() + getHeight() < 580)
			setY(getY() + getSpeed());
		}
		if(direction.equals("LEFT"))
		{
			if(getX() > 0)
			setX(getX() - getSpeed());
		}
		if(direction.equals("RIGHT"))
		{
			if(getX() + getWidth() < 800)
			setX(getX() + getSpeed());
		}
		if(direction.equals("UP"))
		{
			if(getY() > 0)
			setY(getY() - getSpeed());
		}
		
	}

	public void draw( Graphics window )
	{
   	window.drawImage(image,getX(),getY(),getWidth(),getHeight(),null);
	}

	public String toString()
	{
		return super.toString() + getSpeed();
	}
}
