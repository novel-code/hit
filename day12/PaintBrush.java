package hit.day12;

import java.util.Scanner;

public class PaintBrush {
	public static void main(String[] args) {
		PaintBrush brush = new PaintBrush();
		Scanner scan = new Scanner(System.in);
		System.out.println("Please enter your choice 1-red, 2-blue, 3-green, 4-pink.");
		int choice = scan.nextInt();
		brush.doPaint(choice);
		scan.close();
	}
	
	public void doPaint (int choice) {
		if (choice == 1 ) {
			System.out.println("red color...");
		} else if ( choice == 2) {
			System.out.println("blue color...");
		} else if (choice ==3) {
			System.out.println("green color...");
		} else if (choice == 4) {
			System.out.println("pink color...");
		}
	}
}
