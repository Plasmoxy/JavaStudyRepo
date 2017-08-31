package oopandlogic;

import java.util.Arrays;
import org.apache.commons.lang3.ArrayUtils;

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
		for ( int k = 0; k < 30; k++) System.out.print('-');
		System.out.println();
	}
	
	public static void redrawBoard()
	{
		drawBoardLine();
		for ( int i = 0; i < battleBoard.length; i++)
		{
			for ( int j = 0; j < battleBoard[i].length; j++)
			{
				System.out.print("|" + battleBoard[i][j] + "|");
			}
			System.out.println();
		}
		drawBoardLine();
	}
	
	public static void main(String[] args)
	{
		
		buildBattleBoard();
		
		char[][] tempBattleBoard = new char[10][10];
		
		Monster[] monsters = new Monster[4];
		
		monsters[0] = new Monster(1000, 20, 1, "Frank");
		monsters[0] = new Monster(500, 40, 2, "Drac");
		monsters[0] = new Monster(1000, 20, 1, "Paul");
		monsters[0] = new Monster(1000, 20, 1, "George");
		
		redrawBoard();
		
	}

}
