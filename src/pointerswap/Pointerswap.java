package pointerswap;

public class Pointerswap
{
	
	public static void swap(Object[] a)
	{
		Object tmp = a[0];
		a[0] = a[1];
		a[1] = tmp;
	}
	
	public static void main(String[] args)
	{
		String x = "44";
		String y = "99";
		
		String[] xy = {x,y};
		
		swap(xy);
		
		System.out.println(x);
		System.out.println(y);
		
	}
}
