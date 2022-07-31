/* ID - 21CE062 Yagnik Ladani
Aim : Given a string, return a string made of the first 2 chars (if present), however include first char only if it is 'o' and include the second only if it is 'z', so "ozymandias" yields "oz". 
	startOz("ozymandias") → "oz" 
	startOz("bzoo") → "z" 
	startOz("oxx") → "o" 	
*/
import java.util.Scanner;
public class Program2 {
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter String : ");
		String str = sc.nextLine();
		char[] ch= str.toCharArray();
		char[] ans = new char[2];
		int i=0;
		if(ch[0]=='o')
		{
			ans[i]='o';
			i++;
		}
		else
		{
			ans[i]='z';
			i++;
		}
		for(int j=0;j<i;j++)
		{
			System.out.print(ans[i]);
		}
		sc.close();
	}
}
