//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Image;
import java.io.File;
import javax.imageio.ImageIO;
import java.util.ArrayList;
import java.util.List;

public class AlienHorde
{
	private List<Alien> aliens;

	public AlienHorde(int size)
	{
		aliens = new ArrayList<Alien>(size);
		for(int i = 0; i < size; i ++)
		{
			if(i == 0)
				add(new Alien(0,0,2));
			else
				add(new Alien(aliens.get(i-1).getX() - 40,0,2));
		}
	}

	public void add(Alien al)
	{
		aliens.add(al);
	}

	public void drawEmAll( Graphics window )
	{
		for(int i  = 0; i < aliens.size(); i++)
		{
			aliens.get(i).draw(window);
		}
	}

	public void moveEmAll()
	{
		for(int i = 0; i < aliens.size(); i ++)
		{
			Alien a = aliens.get(i);
			a.move("RIGHT");
			if(!a.getInFrame() && a.getX() + a.getWidth() + a.getSpeed() >= 800)
				a.setInFrame(true);
			
			
			if((a.getInFrame() && a.getX() + a.getWidth() + a.getSpeed() >= 800)
					|| (a.getInFrame() && a.getX() + a.getSpeed() <= 0))
			{
				a.move("DOWN");
				a.setSpeed(-a.getSpeed());
				a.move("RIGHT");
			}
			
			
				
		}
	}

	public void removeDeadOnes(List<Ammo> shots)
	{
		for(int i = 0; i < shots.size(); i ++)
		{
			for(int j = 0; j < aliens.size(); j ++)
			{
				if(shots.get(i).getY() <= aliens.get(j).getY() + aliens.get(j).getHeight() + Math.abs(shots.get(i).getSpeed())
				&& shots.get(i).getY() >= aliens.get(j).getY() + aliens.get(j).getHeight()
				&& (shots.get(i).getX() + aliens.get(j).getWidth() >= aliens.get(j).getX()
						&& shots.get(i).getX() <= aliens.get(j).getX() + aliens.get(j).getWidth()))
				{
				aliens.remove(j);
				shots.remove(i);
				if(aliens.size() < 1 || shots.size() < 1)
					break;
				}
			}
		}	
	
	}
	
	public void collideShip(Ship ship, Graphics window, Bullets shots)
	{
		//see if the aliens.get(i) hits the right side of ship
		
		for (int i = 0; i < aliens.size(); i ++)
		{
			if(aliens.get(i).getX() <= ship.getX() + ship.getWidth() + Math.abs(aliens.get(i).getSpeed())
			&& aliens.get(i).getX() > ship.getX() + ship.getWidth()
			&& (aliens.get(i).getY() >= ship.getY() 
				&& aliens.get(i).getY() <= ship.getY() + ship.getHeight()
				|| aliens.get(i).getY() + aliens.get(i).getHeight() >= ship.getY() 
				&& aliens.get(i).getY() + aliens.get(i).getHeight() < ship.getY() + ship.getHeight())
			
			||
				
			//see if the aliens.get(i) hits the left side ship
			aliens.get(i).getX() + aliens.get(i).getWidth() >= ship.getX()  - Math.abs(aliens.get(i).getSpeed())
			&& aliens.get(i).getX() + aliens.get(i).getWidth() < ship.getX()
			&& (aliens.get(i).getY() >= ship.getY() 
				&& aliens.get(i).getY() <= ship.getY() + ship.getHeight()
				|| aliens.get(i).getY() + aliens.get(i).getHeight() >= ship.getY()
				&& aliens.get(i).getY() + aliens.get(i).getHeight() < ship.getY() + ship.getHeight())
			
			||
			//see if aliens.get(i) hits top of ship
			aliens.get(i).getY() + aliens.get(i).getHeight() >= ship.getY()  - Math.abs(aliens.get(i).getSpeed())
					&& aliens.get(i).getY() + aliens.get(i).getHeight() < ship.getY()
					&& (aliens.get(i).getX() + aliens.get(i).getWidth() >= ship.getX()
						&& aliens.get(i).getX() <= ship.getX() + ship.getWidth()
							|| aliens.get(i).getX() + aliens.get(i).getWidth() <= ship.getX() + ship.getWidth()
							&& aliens.get(i).getX() >= ship.getX())
					
				
			
			
			// see if aliens.get(i) hits bottom of ship
		||
			 aliens.get(i).getY() <= ship.getY() + ship.getHeight() + Math.abs(aliens.get(i).getSpeed())
				&& aliens.get(i).getY() >= ship.getY() + ship.getHeight()
				&& (aliens.get(i).getX() + aliens.get(i).getWidth() >= ship.getX()
						&& aliens.get(i).getX() <= ship.getX() + ship.getWidth()
							//|| aliens.get(i).getX() + aliens.get(i).getWidth() >= ship.getX() + ship.getWidth()
							//&& aliens.get(i).getX() >= ship.getX()
							))
			{
				ship.setSpeed(0);
				for(Alien a: aliens) 
					a.setSpeed(0);
				window.drawString("You lose", 400, 300);
				window.setColor(Color.RED);
			}
			
		}
		
		
	}
	
	public List<Alien> getList()
	{
		return aliens;
	}

	public String toString()
	{
		return "";
	}
}
