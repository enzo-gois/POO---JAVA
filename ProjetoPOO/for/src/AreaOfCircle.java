import java.util.Scanner;

class AreaOfCircle{
	public static void main(String args[]) {
		
		Scanner s = new Scanner(System.in);
		
		System.out.println("Enter the Radius: ");
		double r = s.nextDouble();
		double area = (22*r*r)/7;
		System.out.println("Area of circle is: " + area);
		
	}
}