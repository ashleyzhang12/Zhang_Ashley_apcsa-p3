//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import java.util.*;
import java.io.*; 

public class MatrixCount1
{
    private static int[][] m = {{ 1, 2, 3, 4, 5},
    										{ 6, 7, 8, 9, 0},
    										{ 6, 7, 1, 2, 5},
    										{ 6, 7, 8, 9, 0},
    										{ 5, 4, 3, 2, 1}};
    public static void printMatrix()
    {
    
    	for (int r = 0; r < m.length;r++)
    	{
    		for(int c = 0; c < m[r].length;c ++)
    		{
    			System.out.print(m[r][c] + " ");
    		}
    		System.out.println();
    	}
    	
    }

    public static int count( int val)
    {
		//add code
    	int count = 0;
    	for(int row = 0; row < m.length;row++)
    	{
    		for(int column = 0; column < m[row].length;column++)
    		{
    			if(m[row][column] == val)
    			count++;
    		}
    	}
    	return count;
    }
}
