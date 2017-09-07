package thehumansinarray;

import java.util.ArrayList;

public class HumanArray
{
	
	public static void whoIsThis(NonRetardedEntity x) // because x implements ALiveBeing, it will have methods getName() and getAge()
	// therefore anything that can be alive, has age and has a name will work with this method
	{
		System.out.println(
				"This " + x.getClass().getSimpleName() + " is called " + x.getName() + " and is " + Integer.toString(x.getAge())
				+" years old."
		);
	}
	
	public static void whatName(HasName nm) // nm will definitelly have getName(), we dont care what it is but if it has a name
	{
		System.out.println(nm.getName());
	}
	
	public static void lives(IsAlive x) // x will definitelly have age methods and isAlive boolean checker
	// we dont care if it has a name or something, if its even a plant it will work with this because its alive
	{
		String classnm = x.getClass().getSimpleName();
		String agestr = Integer.toString(x.getAge());
		
		if (x.isAlive()) System.out.println("This "+ classnm + " is alive and has been living for " + agestr + " years.");
		else System.out.println("Sadly, this " + classnm + " is dead. It died at age of " + agestr + " years.");
		
		System.out.println();
		
		classnm = null;
		agestr = null;
		System.gc(); // dereference classnm and agestr just because we can and its fun xDDDD
	}
	
	public static void main(String[] args)
	{
		
		ArrayList<Human> humans = new ArrayList<Human>(); // group of human object references
		humans.add(new Human("Paul", 40, "plumber"));
		humans.add(new Human("Jack", 60, "programmer"));
		
		ArrayList<Animal> animals = new ArrayList<Animal>(); // group of animals
		animals.add(new Animal("dog", 3));
		animals.add(new Animal("cat", 5));
		
		ArrayList<Plant> plants = new ArrayList<Plant>(); // group of plants
		plants.add(new Plant(1)); // one year plant
		plants.add(new Plant(2));
		
		ArrayList<NonRetardedEntity> nonretards = new ArrayList<NonRetardedEntity>();
		// because both animals and humans are not retards we can cast them in here with no problems and we dont
		// have to care what it is, if its not a retard then its welcome in this arraylist :DD
		for ( Human h : humans)
		{
			nonretards.add( (NonRetardedEntity) h);
		}
		
		for ( Animal a : animals)
		{
			nonretards.add( (NonRetardedEntity) a);
		}
		
		for ( NonRetardedEntity i : nonretards )
		{
			whatName(i); // nonretards have a name so its ok
			System.out.println("-----------");
			whoIsThis(i); // nonretards can work with this so ok
			lives(i);
		}
		
	}
}
