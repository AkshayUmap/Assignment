package Assignment;
import java.util.*;
public class Area {
	 public static void main(String[] args) {
		 double radius, area, circumference;
		 Scanner sc = new Scanner(System.in);
		 System.out.println("Enter Radius of Circle:");
		 radius = sc.nextDouble();
		 // Calculate area and circumference of circle
		 area = 3.14* radius * radius;
		 circumference = 2 * 3.14 * radius;

		 System.out.println("Area of Circle : " + area);
		 System.out.println("Circumference of Circle : " + circumference);
		    }

		}

