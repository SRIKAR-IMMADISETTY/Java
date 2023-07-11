package saturday;
import java.util.*;
public class Time_Converter{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        System.out.printf("%.1f",convertToHours(n));
        sc.close();
	}
	public static double convertToHours(double n)
	{
		return n/60;
	}
}
