/*
 
1 2 3 4 5 
1 2 3 4 
1 2 3 
1 2 
1 

 
 */


package pattern;
import java.util.Scanner;
public class noPattern10 {

	public static void main(String[] args) 
	{
		Scanner s=new Scanner(System.in);
		
		System.out.println("Enter Rows");
		int row=s.nextInt();
		
		for(int i=row;i>=1;i--)
		{
			for(int j=1;j<=i;j++)
			{
				System.out.print(j+" ");
			}
			System.out.println();
		}
	}

}
