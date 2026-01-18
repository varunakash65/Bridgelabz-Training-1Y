import java.util.Scanner;

public class KilometerToMiles{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter the distance in kilometers: ");
		double kilometer = sc.nextDouble();
		
		double Miles = kilometer * 0.621371;
		
		System.out.printf("The distance in miles is %.6f%n", Miles);
		
		sc.close();
	}
}