

/*
  //  Star Pattern

* * * * * 
* * * * * 
* * * * * 
* * * * * 
* * * * * 


 */

package pattern;
import java.util.Scanner;
public class starPattern1 
{

	public static void main(String[] args) 
	{
		Scanner s=new Scanner(System.in);
		
		System.out.println("Enter Rows");
		int row=s.nextInt();
		
		System.out.println("Enter Columns");
		int col=s.nextInt();
		
		for(int i=1;i<=row;i++)
		{
			for(int j=1;j<=col;j++)
			{
				System.out.print("* ");
			}
			System.out.println();
		}
		

	}

}
