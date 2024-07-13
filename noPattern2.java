/*
 
1 2 3 4 5 
1 2 3 4 5 
1 2 3 4 5 
1 2 3 4 5 
1 2 3 4 5

 */

package pattern;
import java.util.Scanner;;
public class noPattern2
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
				System.out.print(j+" ");
			}
			System.out.println();
		}

	}

}
