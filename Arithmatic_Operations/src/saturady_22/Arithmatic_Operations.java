package saturady_22;

public class Arithmatic_Operations {

	public static void main(String[] args) {
		int r1=subtractNumbers(20, 5);
		System.out.println(r1);
		int r2=multiplyNumbers(4, 5);
		System.out.println(r2);
		double r3=divideNumbers(20, 4);
		System.out.format("%.2f\n",r3);
		int r4=findRemainder(10, 3);
		System.out.println(r4);
	}
    public static int subtractNumbers(int a,int b)
    {
    	return a-b;
    }
    public static int multiplyNumbers(int a,int b)
    {
    	return a*b;
    }
    public static double divideNumbers(int a,int b)
    {
    	return a/b;
    }
    public static int findRemainder(int a,int b)
    {
    	return a%b;
    }
}
