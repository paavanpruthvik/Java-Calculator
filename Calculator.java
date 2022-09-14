import java.util.Scanner;

public class Calculator 
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Select your Operator-\nAddition: a \nSubstraction: b \nMultiplication:c \nDivision: d");
		System.out.print("Enter your Operator : ");
		char operator = sc.next().charAt(0);
		System.out.print("Enter your First value : ");
		int num1 = sc.nextInt();
		System.out.print("Enter your Second value : ");
		int num2 = sc.nextInt();
		int result;
		switch(operator)
		{
			case 'a':
				result = num1 + num2;
				System.out.println(num1 +" + "+ num2+ " = " + result);
				break;
				
			case 'b':
				result = num1 - num2;
				System.out.println(num1 +" - "+ num2+ " = " + result);
				break;
				
			case 'c':
				result = num1 * num2;
				System.out.println(num1 +" * "+ num2+ " = " + result);
				break;
				
			case 'd':
				result = num1 / num2;
				System.out.println(num1 +" /"+ num2+ " = " + result);
				break;
		}
	}
}
