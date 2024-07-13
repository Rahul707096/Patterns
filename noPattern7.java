/*
 
5 4 3 2 1 
5 4 3 2 
5 4 3 
5 4 
5 
 
 */

package pattern;
import java.util.Scanner;
public class noPattern7 
{
	public static void main(String[] args) 
	{
		Scanner s=new Scanner(System.in);
		
		System.out.println("Enter Rows");
		int row=s.nextInt();
		
		for(int i=1;i<=5;i++)
		{
			for(int j=5;j>=i;j--)
			{
				System.out.print(j+" ");
			}
			System.out.println();
		}

	}

}
