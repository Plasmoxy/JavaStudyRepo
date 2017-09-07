package thehumansinarray;

public class Human // this is human class xd
implements NonRetardedEntity // the Human also implements HasName and IsAlive because ALiveBeing extends them so it implements all methods
{
	private int age;
	private String name;
	private boolean alive = true;
	private String job;
	
	public Human(String name, int age, String job)
	{
		this.name = name; this.age = age; this.job = job;
	}
	
	public int getAge() { return age; }
	public void getOlder(int ammt)
	{
		age += ammt;
		if(age > 70) alive=false;
	}
	
	public String getName() { return name; }
	
	public boolean isAlive() { return alive; }
	
	public String getJob() { return job; }
	public void setJob(String job) { this.job = job; }
	
}