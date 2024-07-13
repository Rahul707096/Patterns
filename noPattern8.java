/*
 
1 1 1 1 1 
2 2 2 2 
3 3 3 
4 4 
5
 
 */

package pattern;
import java.util.Scanner;
public class noPattern8 
{
	public static void main(String[] args)
	{
		Scanner s=new Scanner(System.in);
		
		System.out.println("Enter Rows");
		int row=s.nextInt();
		
		for(int i=1;i<=row;i++)
		{
			for(int j=5;j>=i;j--)
			{
				System.out.print(i+" ");
			}
			System.out.println();
		}

	}

}
