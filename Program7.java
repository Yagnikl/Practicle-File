/* Id- 21CE062    Yagnik Ladani
   Aim : Display numbers in a pyramid pattern.
			  1
		    1 2 1
           1 2 4 2 1
         1 2 4 8 4 2 1
      1 2 4 8 16 8 4 2 1
   1 2 4 8 16 32 16 8 4 2 1
1 2 4 8 16 32 64 32 16 8 4 2 1
 */

import java.util.Scanner;

public class Program7 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number of raw : ");
		int n = sc.nextInt();
		for(int i=1;i<=n;i++)
		{
			for(int j=n;j>i;j--)
				System.out.print("   ");
			int p=1;
			for(int j=1;j<=i;j++)
			{
				System.out.printf("%2d ",p);
				p = p*2;
			}
			int q=p/4;
			for(int j=1;j<i;j++)
			{
				System.out.printf("%2d ",q);
				q = q/2;
			}
			System.out.println();
		}
		sc.close();
	}
}
