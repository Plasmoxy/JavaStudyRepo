package thehumansinarray;

public class Animal
implements NonRetardedEntity
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
