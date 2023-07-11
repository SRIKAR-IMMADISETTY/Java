package saturday;
import java.util.*;
public class FinanceCalculatorApp {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter principal amount:");
		double principal=sc.nextDouble();
		System.out.println("enter principal rate:");
		double rate=sc.nextDouble();
		System.out.println("enter principal time:");
		double time=sc.nextDouble();
		
		FinanceCalculator f= new FinanceCalculator();
		System.out.printf("%.2f",f.calculateSimpleInterest(principal,rate,
				                                           time));
		sc.close();
	}
}
