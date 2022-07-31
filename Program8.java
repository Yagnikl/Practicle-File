/* Id - 21CE062   Yagnik Ladnai
Aim : 
The problem is to write a program that will grade multiple-choice tests. Assume there are eight students and ten questions, and the answers are stored in a two-dimensional array. Each row records a student’s answers to the questions, as shown in the following array. 
Students’ Answers to the Questions: 
0 1 2 3 4 5 6 7 8 9 
Student 0 A B A C C D E E A D 
Student 1 D B A B C A E E A D 
Student 2 E D D A C B E E A D 
Student 3 C B A E D C E E A D 
Student 4 A B D C C D E E A D 
Student 5 B B E C C D E E A D 
Student 6 B B A C C D E E A D 
Student 7 E B E C C D E E A D 
The key is stored in a one-dimensional array: 
Key to the Questions: 
0 1 2 3 4 5 6 7 8 9 
Key D B D C C D A E A D 
Your program grades the test and displays the result. It compares each student’s answers with the key, counts the number of correct answers, and displays it. 
 */

import java.util.Scanner;

public class Program8 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Number of student : ");
		int num_stu= sc.nextInt();
		System.out.println("Enter Number of Question : ");
		int num_que= sc.nextInt();
		String[][] arr = new String[num_stu][num_que];
		for(int i=0;i<num_stu;i++)
		{
			System.out.println("Enter the ans of student "+(i+1));
			for(int j=0;j<num_que;j++)
				arr[i][j] = sc.next();
		}
		String[] key = new String[num_que];
		System.out.println("Enter the key of all Questions");
		for(int i=0;i<num_que;i++)
		{
			key[i] = sc.next();
		}
		
		int mark[] = new int[num_stu];
		for(int i=0;i<num_stu;i++)
			mark[i]=0;
	
		for(int i=0;i<num_stu;i++)
		{
			mark[i]=0;
			for(int j=0;j<num_que;j++)
			{
				if(arr[i][j].equals(key[j]))
					mark[i]++;
			}
		}
		
		for(int i=0;i<num_stu;i++)
		{
			System.out.println("Marks of Student "+(i+1)+":" +mark[i]);
		}
		sc.close();
	}
}
