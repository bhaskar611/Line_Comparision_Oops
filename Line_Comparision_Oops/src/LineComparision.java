import java.util.*;

public class LineComparision {
	double[] a = new double[2];
	void findlength() {
		int loop=2;
		for(int i=0; i<loop; i++) {
		Scanner sc = new Scanner(System.in);
			System.out.println("Enter the cordinates of 1st point");
			int x1 = sc.nextInt();
			int y1 = sc.nextInt();

			System.out.println("Enter the cordinates of 2nd point");
			int x2 = sc.nextInt();
			int y2 = sc.nextInt();

			int cal1 = (int) Math.pow((x2-x1), 2);
			int cal2 = (int) Math.pow((y2-y1), 2);

			double Length =  Math.sqrt(cal1+cal2);

			System.out.println("Lenght of line: "+ Length);
			
			a[i] = (double) Length;
		}
		
	}
		
	void equallength() { 
		Double line1=a[0];
		Double line2= a[1];
		if (line1.equals(line2)==true) {
			System.out.println("lines have equal length");
			}else
			System.out.println("Lines do not have equal length");	
	}	
	public static void main(String[] args) {
		System.out.println("Welcome to Line Comparison Computation Program Using Oops Concepts");
		LineComparision line= new LineComparision();
			line.findlength();
			line.equallength();
		
			
	}
}
