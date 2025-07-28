package demo;
import java.util.Scanner;
public class operator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a, b;
		Scanner s = new Scanner(System.in);
		System.out.println("enter the two numbers");
		a=s.nextInt();
		b=s.nextInt();
		System.out.println("addition is " +(a + b));
		System.out.println("subtraction is " + (a - b));
		System.out.println("multiplication is" + (a * b));
		System.out.println("division is" + (a / b));
		
		

	}

}
