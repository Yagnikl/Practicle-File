/* Id - 21CE062  Yagnk Ladani
  Aim : Given an array of ints, return true if the sequence of numbers 1, 2, 3 appears in the array somewhere.
array123([1, 1, 2, 3, 1]) → true
array123([1, 1, 2, 4, 1]) → false
array123([1, 1, 2, 1, 2, 3]) → true
 */


import java.util.Scanner;

public class Program4 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter String Length : ");
		int n = sc.nextInt();
		int arr[] = new int[n];
		System.out.println("Enter array :");
		for(int i=0;i<n;i++)
		{
			arr[i] = sc.nextInt();
		}
		int flag=0;
		for(int i=0;i<n-2;i++)
		{
			if(arr[i]==1 && arr[i+1]==2 && arr[i+2]==3)
			{
				flag++;
				System.out.println("TRUE");
				break;
			}
		}
		if(flag==0)
			System.out.println("FALSE");
		sc.close();
	}
}
