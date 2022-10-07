import java.util.*;
public class Circle {

	
		

		
		
		
		
		public static void main(String[] args) {
			
			Scanner sc = new Scanner(System.in);
			System.out.print(" Please Enter A Radius: ");
			
			double radius = sc.nextDouble();
			double perimeter = 2 * Math.PI * radius;
			double area = Math.PI * radius * radius;
			System.out.println("perimeter is = " + perimeter);
			System.out.println("Area is =" + area);
			
	}		

}
