package Saturday_22;

import java.util.Scanner;

class JourneyCalculator {

    public double calculateDistance(double speed, double time)
    {
	   return speed*time;
    }
}
public class Journey_Calculator {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double s=sc.nextDouble();
		double t=sc.nextDouble();
		JourneyCalculator jc = new JourneyCalculator();
		System.out.printf("%.2f",jc.calculateDistance(s,t));
        sc.close();
	}
}
