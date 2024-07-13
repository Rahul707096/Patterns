
/*
 
5 5 5 5 5 
4 4 4 4 4 
3 3 3 3 3 
2 2 2 2 2 
1 1 1 1 1 

 */
package pattern;
import java.util.Scanner;
public class noPattern5 
{

	public static void main(String[] args) 
	{
		Scanner s=new Scanner(System.in);
		
		System.out.println("Enter Rows");
		int row=s.nextInt();
		
		System.out.println("Enter Columns");
		int col=s.nextInt();
		
		for(int i=row;i>=1;i--)
		{
			for(int j=1;j<=col;j++)
			{
				System.out.print(i+" ");
			}
			System.out.println();
		}

	}

}
