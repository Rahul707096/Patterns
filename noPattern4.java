
/*
 
 1
 2 2
 3 3 3
 4 4 4 4 
 5 5 5 5 5
 
 */


package pattern;
import java.util.Scanner;
public class noPattern4
{

	public static void main(String[] args)
	{
		Scanner s=new Scanner(System.in);
		
		System.out.println("Enter Rows");
		int row=s.nextInt();
		
		for(int i=1;i<=row;i++)
		{
			for(int j=1;j<=i;j++)
			{
				System.out.print(i+" ");
			}
			System.out.println();
		}
		

	}

}
