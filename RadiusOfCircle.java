import java.lang.Math;
import java.util.*;
public class RadiusOfCircle {

	public static void main(String[] args) {
		Scanner radius=new Scanner(System.in);
		System.out.print("What is the area? ");
		double a=radius.nextDouble();

			
		double r =Math.sqrt(a/Math.PI);
		System.out.println("Radius of your circle is: " + r);
		
	}

}
