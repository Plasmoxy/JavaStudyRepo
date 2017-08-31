package oopandlogic;

import java.util.Arrays;

public class Main {
	
	public static char[][] battleBoard = new char[10][10];
	
	public static int numOfMonsters = 0;
	
	public static void buildBattleBoard()
	{
		for (char[] row : battleBoard)
		{
			Arrays.fill(row, '*');
		}
	}
	
	private static void drawBoardLine()
	{
		for ( int k = 0; k < 30; k++) System.out.println('-');
		System.out.println();
	}
	
	public static void redrawBoard()
	{
		drawBoardLine();
		for ( int i = 0; i < battleBoard.length; i++)
		{
			for ( int j = 0; j < battleBoard[i].length; j++)
			{
				System.out.println("|" + battleBoard[i][j] + "|");
			}
			System.out.println();
		}
		drawBoardLine();
	}
	
	public static void main(String[] args)
	{
		
	}

}
