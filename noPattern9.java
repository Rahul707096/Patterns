
/*
  
 
1 
2 3 
4 5 6 
7 8 9 10 
11 12 13 14 15 

 */

package pattern;
import java.util.Scanner;
public class noPattern9
{

	public static void main(String[] args) 
	{

		Scanner s=new Scanner(System.in);
		
		System.out.println("Enter Rows");
		int row=s.nextInt();
		
		int k=0;
		
		for(int i=1;i<=row;i++)
		{
			for(int j=1;j<=i;j++)
			{
				k++;
				System.out.print(k+" ");
			}
			System.out.println();
		}

	}

}
