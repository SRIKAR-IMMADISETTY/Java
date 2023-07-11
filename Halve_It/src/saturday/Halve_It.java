package saturday;
import java.util.*;
public class Halve_It{

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        System.out.printf("%.2f",halveTheNumber(n));
        sc.close();
	}
	public static double halveTheNumber(double n)
	{
		return n/2;
	}
}
