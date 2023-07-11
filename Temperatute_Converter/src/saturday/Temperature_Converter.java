package saturday;
import java.util.*;
public class Temperature_Converter {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		TemperatureConverter t = new TemperatureConverter();
        double d=sc.nextDouble();
		System.out.println(t.convertFahrenheitToCelsius(d));
sc.close();
	}

}
