//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import java.util.*;

public class TotalRow
{
    public static List<Integer> getRowTotals( int[][] m )
    {
    	
		List<Integer> rowTotal= new ArrayList<Integer>();
		int total = 0;
		for(int r = 0; r < m.length;r++)
		{
			total = 0;
			for(int c = 0; c < m[r].length; c++)
			{
				total = total + m[r][c];
			}
			rowTotal.add(total);
		}
		return rowTotal;
		
    }
}
