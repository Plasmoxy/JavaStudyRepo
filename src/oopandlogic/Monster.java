package oopandlogic;

public class Monster {
	
	public final String TOMBSTONE = "Here Lies a Dead Monster";
	
	private int health = 500;
	private int attack = 20;
	private int movement = 2;
	private int xPosition = 0;
	private int yPosition = 0;
	private boolean alive = true;
	
	String name = "Big Monster";
	
	int getAttack() {
		return attack;
	}
	
	int getMovement() {
		return movement;
	}
	
	int getHealth() {
		return health;
	}
	
	void setHealth(int decreaseHealth) {
		health = health - decreaseHealth;
		if ( health <= 0) {
			alive = false;
		}
	}
	
	void setHealth(double decreaseHealth) {
		int intDecreaseHealth = (int) decreaseHealth;
		health = health - intDecreaseHealth;
		if (health <= 0) {
			alive = false;
		}
	}
	
	

}
