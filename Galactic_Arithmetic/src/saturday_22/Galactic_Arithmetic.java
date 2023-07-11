package saturday_22;
import java.util.*;
public class Galactic_Arithmetic {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter 2 long values:");
		long n1=sc.nextLong();
		long n2=sc.nextLong();
		
		long r=galacticAddition(n1,n2);
		System.out.println(r);
		sc.close();
	}
    public static long galacticAddition(long n1,long n2)
    {
    	return n1+n2;
    }
}
