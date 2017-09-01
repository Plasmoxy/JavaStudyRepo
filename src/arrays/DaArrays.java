package arrays;

import java.util.Arrays;

public class DaArrays {
	
	
	
	public static void print2DArray(int[][] x)
	{
		for (int[] row : x)
		{
			for (int n : row)
			{
				System.out.print("| " + Integer.toString(n) + " ");
			}
			System.out.println("|");
		}
	}
	
	public static void print2DArray(String[][] x)
	{
		for (String[] row : x)
		{
			for (String n : row)
			{
				System.out.print("| " + n + " ");
			}
			System.out.println("|");
		}
	}
	
	public static int[][] null2DArray(int[][] x)
	{
		for (int[] i : x) Arrays.fill(i, 0);
		return x;
	}
	
	public static void main(String[] args)
	{
		int[][] a = new int[10][10];
		
		null2DArray(a);
		print2DArray(a);
		
	}

}
