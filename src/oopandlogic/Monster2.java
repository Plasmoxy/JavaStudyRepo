package oopandlogic;

import java.util.Arrays;

public class Monster2 {
	
	public final String TOMBSTONE = "Here Lies a Dead Monster";
	
	private int health = 500;
	private int attack = 20;
	private int movement = 2;
	private boolean alive = true;
	
	public String name = "Big Monster";
	public char nameChar = 'B';
	public int xPosition = 0;
	public int yPosition = 0;
	
	public Monster2(int health, int attack, int movement, String name)
	{
		this.health = health;
		this.attack = attack;
		this.movement = movement;
		this.name = name;
		
		int maxXBoardSpace = Main.battleBoard.length - 1;
		int maxYBoardSpace = Main.battleBoard[0].length - 1;
		
		int randNumX, randNumY;
		
		do {
			randNumX = (int) (Math.random() * maxXBoardSpace);
			randNumY = (int) (Math.random() * maxYBoardSpace);
		} while(Main.battleBoard[randNumX][randNumY] != '*');
		
		this.xPosition = randNumX;
		this.yPosition = randNumY;
		
		this.nameChar = this.name.charAt(0);
		
		Main.battleBoard[this.yPosition][this.xPosition] = this.nameChar;
		
		Main.numOfMonsters++;
		
	}
	
	public int getAttack() {
		return attack;
	}
	
	public int getMovement() {
		return movement;
	}
	
	public int getHealth() {
		return health;
	}
	
	public void setHealth(int decreaseHealth) {
		health = health - decreaseHealth;
		if ( health <= 0) {
			alive = false;
		}
	}
	
	public void setHealth(double decreaseHealth) {
		int intDecreaseHealth = (int) decreaseHealth;
		health = health - intDecreaseHealth;
		if (health <= 0) {
			alive = false;
		}
	}
	
	public boolean isAlive()
	{
		return alive;
	}
	
	

}
