package phraseomatic;

public class PhraseOMatic
{
	
	public static void main(String[] args)
	{
		String[] listOne = {
				"cool", "amazing", "refreshing", "nice", "astonishing",
				"relaxing", "clever", "charming", "bright", "neat"
		};
		
		String[] listTwo = {
				"good", "kind", "polite", "powerful", "quick",
				"practical", "kind", "loving", "understanding",
				"willing"
		};
		
		System.out.println(
				listOne[(int)(Math.random() * listOne.length)]
				+" and "+
				listTwo[(int)(Math.random() * listTwo.length)]
		);
		
	}
	
}
