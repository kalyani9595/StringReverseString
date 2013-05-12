/*
 * Author: Gordon Situ
 * Date: 12/04/12
 * Description: Test of reverse functions
 * 
 */

import java.util.Scanner;


public class ReverseString {
	public static void main(String args[]){
		System.out.print("Enter a string to be reversed: ");
		Scanner input = new Scanner(System.in);
		String str = input.nextLine();
		System.out.println("\nChoose which method of reverse to use \n 1.Reverse API \n 2.Reverse Iteration \n 3.Reverse Recursively \n");
		
		boolean run = true;
		while(run == true){
			System.out.print("Enter a number to choose the method : ");
			int method = input.nextInt(); 
/* no default case added not out of loop*/

			switch (method){
			case 1:
				reverseAPI(str);
				run = false;
				break;
			case 2:
				reverseIteration(str);
				run = false;
				break;
			case 3:
				String strRec = reverseRec(str);
				System.out.println("The reversed string using Reverse Recursively is: " + strRec);
				run = false;
				break;
			}
		}
		input.close();
	}
	
	public static void reverseAPI(String a){
		String b = new StringBuffer(a).reverse().toString();
		System.out.println("The reversed string using Reverse API is: " + b);
	}
	
	public static void reverseIteration(String a){
		System.out.print("The reversed string using Reverse Iteration is: ");
		char[] b = a.toCharArray();
		for(int i = b.length - 1; i >= 0; i--){
			System.out.print(b[i]);
		}
	}
	
	public static String reverseRec(String a){
		if(a.length() < 2)
			return a;
		else 
			return reverseRec(a.substring(1)) + a.charAt(0);
	}
}
