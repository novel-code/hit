package hit.day4;

import java.util.Scanner;

//single line comment
/*
 * muti line comment
 * second line
 * etc..
 * */
/**
 * Documentation comment
 * 
 * @author Syed Md Muzzammil
 * Date: 3/6/2021
 * This is our first progress of HIT
 *
 */


public class HelloWorld {

	public static void main(String[] args) {
		System.out.println("Welcome to Java....");
		Scanner scan= new Scanner(System.in);
		System.out.println("Please Enter your Name:");
		String name=scan.next();
		System.out.println("Welcome to....JAVA Learning....:"+name);
	}

}
