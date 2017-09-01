package lambdaTest;

public class LambdaTest {
	
	public static void main(String[] args)
	{
		new Thread( () ->
		{
			try {
				while ( true )
				{
					System.out.println("xd");
					Thread.sleep(1000);
				}
			} catch(InterruptedException e) {
				e.printStackTrace();
			}
		}
		).start();
		
		
	}

}
