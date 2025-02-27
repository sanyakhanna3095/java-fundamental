import java.util.Scanner;

public class CelsiusToFahrenheit{

	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter temperature in celsius:");
		int celsius_temp=sc.nextInt();
		int fahrenheit_temp=(celsius_temp * 9/5) + 32;
		System.out.print("The temperature in fahrenheit is: "+fahrenheit_temp);
	}
}
