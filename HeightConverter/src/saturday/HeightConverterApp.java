package saturday;

import java.util.Scanner;

public class HeightConverterApp {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter Height in inches:");
		double inches=sc.nextDouble();
		
		HeightConverter h= new HeightConverter();
		System.out.printf("%.2f",h.convertInchesToFeet(inches));
		sc.close();
	}

}
