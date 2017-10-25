import java.util.Scanner;

public class GrandCircusLab3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// Have user input integer
		int num = 0;
		Scanner scnr = new Scanner(System.in);
		
		System.out.println("Enter an integer:");
		
		num = scnr.nextInt();
		
		// Create formulas for calculating squares and cubes
		
		// start for loop
		
		for (int i = 1; i <= num; i++) {
		int userSquares = i * i ;
		int userCubes = getCubes(i);
		
		// Based on user input display table for squared and cubed 
		
		System.out.println(i + "     " + userSquares + "    " + userCubes);
		// Then ask user if they want to continue (y/n)
		
		}
		
		
		
		
		scnr.close();
	}
		public static int getCubes(int num) {
		
			int result = (int) Math.pow(num, 3);
			
		return result;	
		}
}
