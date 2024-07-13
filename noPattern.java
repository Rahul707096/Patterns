/*
 
1 1 1 1 1 
2 2 2 2 2 
3 3 3 3 3 
4 4 4 4 4 
5 5 5 5 5 

 */

package pattern;
import java.util.Scanner;

public class noPattern
{

	public static void main(String[] args) 
	{
		Scanner s=new Scanner(System.in);
		
		System.out.println("Enter Rows");
		int rows=s.nextInt();
		
		System.out.println("Enter Columns");
		int col=s.nextInt();
		
		for(int i=1;i<=rows;i++)
		{
			for(int j=1;j<=col;j++)
			{
				System.out.print(i+" ");
			}
			System.out.println();
		}

	}

}
