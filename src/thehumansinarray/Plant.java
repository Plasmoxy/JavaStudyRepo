package thehumansinarray;

public class Plant
implements IsAlive
{
	private int age;
	private boolean alive = true;
	
	public Plant(int age)
	{
		this.age = age;
	}

	public int getAge() { return age; }
	
	public void getOlder(int ammt)
	{
		age += ammt;
		if(age > 3) alive=false;
	}

	public boolean isAlive()
	{
		return alive;
	}
	
	
	
}
