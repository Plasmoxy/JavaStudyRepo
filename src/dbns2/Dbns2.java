package dbns2;

import java.util.Scanner;

public class Dbns2 {
	
	protected static Scanner sc = new Scanner(System.in);
	
	public static void main(String[] args) {
		
		if ( sc.hasNextInt() ) {
			
			int a = sc.nextInt();
			
			System.out.println(a*a);
			
		} else {
			System.out.println("error");
		}
		
	}

}
