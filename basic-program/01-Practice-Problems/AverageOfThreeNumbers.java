import java.util.Scanner;

public class AverageOfThreeNumbers{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter the first number: ");
		double a = sc.nextDouble();
		
		System.out.print("Enter the second number: ");
		double b= sc.nextDouble();
		
		System.out.print("Enter the thrid number: ");
		double c = sc.nextDouble();
		
		double sum = (a + b + c) / 3;
		
		System.out.printf("The average is %.2f%n", sum);
		
		sc.close();
	}
}