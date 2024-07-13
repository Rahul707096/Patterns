/*
 
5 4 3 2 1 
5 4 3 2 1 
5 4 3 2 1 
5 4 3 2 1 
5 4 3 2 1

 */

package pattern;
import java.util.Scanner;;
public class noPattern6 
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
			for(int j=col;j>=1;j--)
			{
				System.out.print(j+" ");
			}
			System.out.println();
		}

	}

}
