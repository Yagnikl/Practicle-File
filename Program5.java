/* Id - 21CE062  Yagnk Ladani
  Aim : Given 2 strings, a and b, return the number of the positions where they contain the same length 2 substring. So "xxcaazz" and "xxbaaz" yields 3, since the "xx", "aa", and "az" substrings appear in the same place in both strings.
stringMatch("xxcaazz", "xxbaaz") → 3
stringMatch("abc", "abc") → 2
stringMatch("abc", "axc") → 0
 */

import java.util.Scanner;

public class Program5 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter first string : ");
		String str1 = sc.nextLine();
		System.out.println("Enter Second string : ");
		String str2 = sc.nextLine();
		int n= position(str1,str2);
		System.out.print("Commen String = "+n);
		sc.close();
	}
	
	static int  position (String s1,String s2)
	{
		int n,ans=0;
		if(s1.length()>s2.length())
			n = s2.length();
		else
			n = s1.length();
		for(int i=0;i<n-1;i++)
		{
			if(s1.charAt(i)==s2.charAt(i))
			{
				if(s1.charAt(i+1)==s2.charAt(i+1))
					ans++;
			}
		}
		return ans;
	}
}
