//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import java.util.*;
import java.io.*; 

public class WordSearch
{
    private String[][] m;

    public WordSearch( int size, String str )
    {
    	int pos = 0;
    	m = new String[size][size];
    	for(int i = 0; i < size; i++)
    	{
    		for(int j = 0; j < size; j++)
    		{
    			m[i][j] = str.substring(pos, pos+1);
    			pos++;
    		}
    	}
    }

    public boolean isFound( String word )
    {
    	for(int i = 0; i < m.length; i ++)
    	{
    		for(int j = 0; j < m[i].length; j++)
    		{
    			if(m[i][j].equals(word.substring(0,1)))
    			{
    				if(checkRight(word,i,j))return true;
    				if(checkLeft(word,i,j))return true;
    				if(checkUp(word,i,j) )return true;
    				if(checkDown(word,i,j) )return true;
    				if(checkDiagUpLeft(word,i,j))return true;
    				if(checkDiagUpRight(word,i,j))return true;
    				if(checkDiagDownRight(word,i,j) )return true;
    				if(checkDiagDownLeft(word,i,j) )return true;
    			}
    		}
    	}
    	return false;
    }

	public boolean checkRight(String w, int r, int c)
   {
		if(c > m[r].length - w.length())
		{
			return false;
		}
		int pos = 0;
		for (int k = c; k < c + w.length(); k ++)
		{
			if (m[r][k].equals(w.substring(pos,pos+1)))
			pos++;
			else
			return false;
		}
		if (pos == w.length())
		return true;
			return false;
		
	}

	public boolean checkLeft(String w, int r, int c)
	{
		if(c < w.length())
		return false;
		
		int pos = 0;
		for(int k = c; k < c - w.length(); k--)
		{
			if(m[r][k].equals(w.substring(pos,pos+1)))
			pos++;
			else
				return false;
		}
		if(pos==w.length())
		return true;
			return false;
			
	}

	public boolean checkUp(String w, int r, int c)
	{
		if(r < w.length())
			return false;
		int pos = 0;
		for(int k = r; k < r - w.length(); k --)
		{
			if(m[k][c].equals(w.substring(pos,pos+1)))
			pos++;
			else return false;
		}
		if (pos == w.length()) return true;
		return false;
	}

	public boolean checkDown(String w, int r, int c)
   {
		if(r > m.length - w.length())
			return false;
		int pos = 0;
		for(int k = r; k < r + w.length(); k ++)
		{
			if(m[k][c].equals(w.substring(pos,pos+1)))
			pos++;
			else
				return false;
		}
		if(pos == w.length())return true;
	   return false;
	}

	public boolean checkDiagUpRight(String w, int r, int c)
	{
		if(r < w.length() || c > m[r].length - w.length() )
		return false;
				
		int pos = 0;
		int col=c;
		for(int k = r; k < r - w.length(); k --)
		{
			if(m[k][col].equals(w.substring(pos,pos+1)))
			{
				pos++;
				col++;
			}
			else return false;
		}
		if (pos == w.length()) return true;
		return false;
		
	}

	public boolean checkDiagUpLeft(String w, int r, int c)
	{
		if(r < w.length() || c <w.length())
			return false;
		int pos = 0;
		int col = c;
		for(int k = r; k < r - w.length(); k --)
		{
			if(m[k][col].equals(w.substring(pos,pos+1)))
			{
				pos++;
				col --;
			}
			else return false;
		}
		if (pos == w.length()) return true;
		return false;
	}

	public boolean checkDiagDownLeft(String w, int r, int c)
   {
		if(r > m.length - w.length() || c < w.length())
			return false;
		int pos = 0;
		int col = c;
		for(int k = r; k < r  + w.length(); k ++)
		{
			if(m[k][col].equals(w.substring(pos,pos+1)))
			{
				pos++;
				col--;
			}
			else return false;
		}
		if (pos == w.length()) return true;
		return false;
	}

	public boolean checkDiagDownRight(String w, int r, int c)
	{
		if(r > m.length - w.length() || c > m[r].length - w.length())
		return false;
		int pos = 0;
		int col = 0;
		for(int k = r; k < r + w.length(); k ++)
		{
			if(m[k][col].equals(w.substring(pos,pos+1)))
			{
				pos++;
				col++;
			}
			else return false;
		}
		if (pos == w.length()) return true;
		return false;
	}

    public String toString()
    {
 		String output = "";
 		for(int i = 0; i < m.length; i ++)
 		{
 			for(int j = 0; j < m[i].length; j ++)
 			{
 				output = output + m[i][j] + " ";
 			}
 			output = output + "\n";
 		}
 		return output;
    }
}
