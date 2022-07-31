/*  Id - 21CE062    Yagnik Ladani
Aim : Given two non-negative int values, return true if they have the same last digit, such as with 27 and 57. Note that the % "mod" operator computes remainders, so 17 % 10 is 7. 
lastDigit(7, 17) → true 
lastDigit(6, 17) → false 
lastDigit(3, 113) → true  
 */

import java.util.Scanner;

public class Program3 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Number 1 : ");
		int a = sc.nextInt();
		System.out.println("Enter Number 2 : ");
		int b = sc.nextInt();
		if((a%10)==(b%10))
			System.out.println("TRUE");
		else
			System.out.println("FALSE");
		sc.close();
	}
}
