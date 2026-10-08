import java.util.Scanner;

public class CelsiusToFahrenheit{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter temprature in celsius: ");
		double celsius = sc.nextDouble();
		
		double fahrenheit = (celsius * 9/5) + 32;
		
		System.out.printf("Temprature in Fahrenheit = %.3f%n", fahrenheit);
		
		sc.close();
	}
}