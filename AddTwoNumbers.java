import java.util.Scanner;

public class AddTwoNumbers{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter number1: ");
		int num1=sc.nextInt();
		System.out.print("Enter number2: ");
		int num2=sc.nextInt();
		System.out.print("Sum of two numbers is: "+(num1+num2));
	}
}
