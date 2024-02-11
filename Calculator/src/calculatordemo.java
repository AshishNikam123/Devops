import java.util.Scanner;

public class calculatordemo {
	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		System.out.print("Enter first number: ");
		int num1= scanner.nextInt();
		System.out.print("Enter second number: ");
		int num2= scanner.nextInt();
		calculatordemo cal=new calculatordemo();
		System.out.println("Sum: "+cal.sum(num1, num2));
		System.out.println("Substract: "+cal.substract(num1, num2));
		System.out.println("Multiply: "+cal.multiply(num1, num2));
		System.out.println("Divide: "+cal.divide(num1, num2));
		scanner.close();
	}

public int sum(int a, int b) {
	return a+b;
}
public int substract(int a, int b) {
	return a-b;
}
public int multiply(int a, int b) {
	return a*b;
}
public int divide(int a, int b) {
	if(b==0) {
		throw new IllegalArgumentException("Cannot divide by zero");
	}
	return a/b;
}
}