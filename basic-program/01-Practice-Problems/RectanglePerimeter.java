import java.util.Scanner;

public class RectanglePerimeter{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the value of length: ");
		double length = sc.nextDouble();
		
		System.out.println("Enter the value of width: ");
		double width = sc.nextDouble();
		
		double perimeter = 2 * (length + width);
		
		System.out.printf("The Perimeter of rectangle is %.3f%n", perimeter);
		
		sc.close();
	}
}