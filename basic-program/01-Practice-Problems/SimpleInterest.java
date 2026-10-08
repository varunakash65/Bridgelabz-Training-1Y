import java.util.Scanner;

public class SimpleInterest{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the principal value: ");
		double principal = sc.nextDouble();
		
		System.out.println("Enter the rate: ");
		double rate = sc.nextDouble();
		
		System.out.println("Enter the time: ");
		double time = sc.nextDouble();
		
		double simple_interest = (principal * rate* time) / 100;
		
		System.out.printf("The simple interest is %.3f%n", simple_interest);
		
		sc.close();
	}
	
}