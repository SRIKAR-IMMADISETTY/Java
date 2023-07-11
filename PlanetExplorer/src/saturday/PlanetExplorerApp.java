package saturday;

import java.util.Scanner;
public class PlanetExplorerApp {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter raduis to find area of sphere:");
		double radius=sc.nextDouble();
		
		PlanetExplorer p= new PlanetExplorer();
		System.out.printf("%.2f",p.calculateSurfaceArea(radius));
		sc.close();
	}

}
