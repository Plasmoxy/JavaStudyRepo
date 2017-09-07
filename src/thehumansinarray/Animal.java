package thehumansinarray;

public class Animal
implements NonRetardedEntity
// we'll need this to make animals subclasses so kinda using the inheritance and shit
// also Animal object doesn't make any sense so its abstract class
{
	private String name;
	private int age;
	private boolean alive = true;
	
	public Animal(String name, int age)
	{
		this.name = name; this.age = age;
	}
	
	public int getAge() { return age; }
	public void getOlder(int ammt)
	{
		age += ammt;
		if(age > 10) alive=false;
	}
	
	public String getName() { return name; }
	
	public boolean isAlive() { return alive; }
	
}
