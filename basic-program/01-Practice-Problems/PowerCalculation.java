import java.util.Scanner;

public class PowerCalculation{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter the value of base: ");
		int base = sc.nextInt();
		
		System.out.print("Enter the value of exponent: ");
		int exponent = sc.nextInt();
		
		int result = (int) Math.pow(base, exponent);
		
		System.out.printf("When the power %d is raised to base %d the value is %d%n", exponent, base, result );
		
		sc.close();
	}
}