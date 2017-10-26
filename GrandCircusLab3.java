import java.util.Scanner;

public class GrandCircusLab3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// Have user input integer
		int num = 0;
		String response = "y";
		Scanner scnr = new Scanner(System.in);

		// Create formulas for calculating squares and cubes

		// start for loop

		while (response.equalsIgnoreCase("y")) {
			System.out.println("Enter an integer:");
			num = scnr.nextInt();
			scnr.nextLine();
			// Print title of columns
			System.out.println("Number\t\tSquared\t\tCubes\n");
			System.out.println("======\t\t======\t\t=====\n");
			for (int i = 1; i <= num; i++) {
				int userSquares = i * i;
				int userCubes = getCubes(i);

				// Based on user input display table for squared and cubed

				System.out.println(i + "\t\t" + userSquares + "\t\t" + userCubes);
			}
			System.out.println("Continue?(y/n)");
			response = scnr.nextLine();
		}

		System.out.println("Goodbye!");
		scnr.close();

	}

	public static int getCubes(int num) {

		int result = (int) Math.pow(num, 3);

		return result;
	}
}
