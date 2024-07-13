package pattern;
import java.util.Scanner;
public class allPatterns 
{

	public static void main(String[] args) 
	{

 
/* No.1
1 1 1 1 1 
2 2 2 2 2 
3 3 3 3 3 
4 4 4 4 4 
5 5 5 5 5
*/
		
		/*
		for(int i=1;i<=5;i++)
		{
			for(int j=1;j<=5;j++)
			{
				System.out.print(i+" ");
			}
			System.out.println();
		}
		*/
		
		
/*  No.2
1 2 3 4 5 
1 2 3 4 5 
1 2 3 4 5 
1 2 3 4 5 
1 2 3 4 5		
 */
		
		
		/*
		for(int i=1;i<=5;i++)
		{
			for(int j=1;j<=5;j++)
			{
				System.out.print(j+" ");
			}
			System.out.println();
		}
		*/
		
/*  No.3
 
* * * * * 
* * * * * 
* * * * * 
* * * * * 
* * * * * 		
 
 */
		/*
		for(int i=1;i<=5;i++)
		{
			for(int j=1;j<=5;j++)
			{
				System.out.print("* ");
			}
			System.out.println();
		}
		*/
		
/*  No.4 

5 5 5 5 5 
4 4 4 4 4 
3 3 3 3 3 
2 2 2 2 2 
1 1 1 1 1 
  		
  
 */
		/*
		for(int i=5;i>=1;i--)
		{
			for(int j=1;j<=5;j++)
			{
				System.out.print(i+" ");
			}
			System.out.println();
		}
		*/
		
/* No.5
 
5 4 3 2 1 
5 4 3 2 1 
5 4 3 2 1 
5 4 3 2 1 
5 4 3 2 1 
		
 */
		/*
		for(int i=1;i<=5;i++)
		{
			for(int j=5;j>=1;j--)
			{
				System.out.print(j+" ");
			}
			System.out.println();
		}
		*/
		

/* No.6
1 
1 2 
1 2 3 
1 2 3 4 
1 2 3 4 5
 
 */
		/*
		for(int i=1;i<=5;i++)
		{
			for(int j=1;j<=i;j++)
			{
				System.out.print(j+" ");
			}
			System.out.println();
		}
		*/
		
		
/* No.7
1 
2 1 
3 2 1 
4 3 2 1 
5 4 3 2 1 		
 */
		/*
		for(int i=1;i<=5;i++)
		{
			for(int j=i;j>=1;j--)
			{
				System.out.print(j+" ");
			}
			System.out.println();
		}
		*/

		
/* No.8
1 2 3 4 5 
1 2 3 4 
1 2 3 
1 2 
1 
 */
		/*
		for(int i=5;i>=1;i--)
		{
			for(int j=1;j<=i;j++)
			{
				System.out.print(j+" ");
			}
			System.out.println();
		}
		*/
		
/* No.9
1 2 3 4 5 
2 3 4 5 
3 4 5 
4 5 
5 
 */
		/*
		for(int i=1;i<=5;i++)
		{
			for(int j=i;j<=5;j++)
			{
				System.out.print(j+" ");
			}
			System.out.println();
		}
		*/
		

/* No.10
1 
2 2 
3 3 3 
4 4 4 4 
5 5 5 5 5 
 */
		
		/*
		for(int i=1;i<=5;i++)
		{
			for(int j=1;j<=i;j++)
			{
				System.out.print(i+" ");
			}
			System.out.println();
		}
		*/	
		
/* No.11

1 1 1 1 1 
2 2 2 2 
3 3 3 
4 4 
5 
 
 */
		
		/*
		for(int i=1;i<=5;i++)
		{
			for(int j=i;j<=5;j++)
			{
				System.out.print(i+" ");
			}
			System.out.println();
		}
		*/

/* No.12
5 5 5 5 5 
4 4 4 4 
3 3 3 
2 2 
1 		
 */
		
		/*
		for(int i=5;i>=1;i--)
		{
			for(int j=1;j<=i;j++)
			{
				System.out.print(i+" ");
			}
			System.out.println();
		}
		*/
		

/* No.13
5 
4 4 
3 3 3 
2 2 2 2 
1 1 1 1 1 

 */
		
		/*
		for(int i=5;i>=1;i--)
		{
			for(int j=i;j<=5;j++)
			{
				System.out.print(i+" ");
			}
			System.out.println();
		}
		*/
	
		
		
/* No.14
5 
5 4 
5 4 3 
5 4 3 2 
5 4 3 2 1 
 */
		/*
		for(int i=5;i>=1;i--)
		{
			for(int j=5;j>=i;j--)
			{
				System.out.print(j+" ");
			}
			System.out.println();
		}
		*/
		
/* No.15
5 
4 5 
3 4 5 
2 3 4 5 
1 2 3 4 5 		
 */
		/*
		for(int i=5;i>=1;i--)
		{
			for(int j=i;j<=5;j++)
			{
				System.out.print(j+" ");
			}
			System.out.println();
		}
		*/
	
		
/* No.16
5 4 3 2 1 
5 4 3 2 
5 4 3 
5 4 
5 
 */
		/*
		for(int i=1;i<=5;i++)
		{
			for(int j=5;j>=i;j--)
			{
				System.out.print(j+" ");
			}
			System.out.println();
		}
		*/
		
/* No.17
5 4 3 2 1 
4 3 2 1 
3 2 1 
2 1 
1 
 */
		
		/*
		for(int i=5;i>=1;i--)
		{
			for(int j=i;j>=1;j--)
			{
				System.out.print(j+" ");
			}
			System.out.println();
		}
		*/
		

		
/* No.18
1 
2 3 
4 5 6 
7 8 9 10 
11 12 13 14 15
 */
		/*
		int k=0;
		for(int i=1;i<=5;i++)
		{
			for(int j=1;j<=i;j++)
			{
				k++;
				System.out.print(k+" ");
			}
			System.out.println();
		}
		*/
		
/* No.19
 
* * * * * 
* * * * 
* * * 
* * 
* 	
	
 */
		/*
		for(int i=5;i>=1;i--)
		{
			for(int j=i;j>=1;j--)
			{
				System.out.print("* ");
			}
			System.out.println();
		}
		*/
		

/* No.20
 
* 
* * 
* * * 
* * * * 
* * * * *  
 				
 */
		/*
		for(int i=1;i<=5;i++)
		{
			for(int j=1;j<=i;j++)
			{
				System.out.print("* ");
			}
			System.out.println();
		}
		*/
		

/* No.21
 
 	 * 
    * * 
   * * * 
  * * * * 
 * * * * * 
 		
 */
		
		/*
		for(int i=5;i>=1;i--)
		{
			for(int j=i;j>=1;j-- )
			{
				System.out.print(" ");
			}
			for(int k=i;k<=5;k++)
			{
				System.out.print("* ");
			}
			System.out.println();
		}
		*/
		
/* No.22
 
 * * * * * 
  * * * * 
   * * * 
    * * 
     * 
     
 */
		
		/*
		for(int i=1;i<=5;i++)
		{
			for(int j=1;j<=i;j++)
			{
				System.out.print(" ");
			}
			for(int k=5;k>=i;k--)
			{
				System.out.print("* ");
			}
			System.out.println();
		}
		
		
		/*
		
		for(int i=5;i>=1;i--)
		{
			for(int j=5;j>=i;j--)
			{
				System.out.print(" ");
			}
			for(int k=i;k>=1;k--)
			{
				System.out.print("* ");
			}
			System.out.println();
		}
		*/
		
	
		
/* No.23
 
      *
     ***
    *****
   *******
  *********
 ***********
  *********
   *******
    *****
     ***
      *
 */
		
		/*
		Scanner s=new Scanner(System.in);
		System.out.println("Enter Rows: ");
		int n=s.nextInt();
		
		
		for(int i=0;i<=n;i++)
		{
			for(int j=0;j<=n-i;j++)
			{
				System.out.print(" ");
			}
			for(int k=0;k<((2*i)+1);k++)
			{
				System.out.print("*");
			}
			System.out.println();
		}
		for(int i=n-1;i>=0;i--)
		{
			for(int j=0;j<=n-i;j++)
			{
				System.out.print(" ");
			}
			for(int k=0;k<((2*i)+1);k++)
			{
				System.out.print("*");
			}
			System.out.println();
		}
		*/
		

/*  No.24
 	*
   **
  ***
 ****
*****
 */
		/*
		int n=5;
		for(int i=1;i<=5;i++)
		{
			for(int j=1;j<=n-i;j++)
			{
				System.out.print(" ");
			}
			for(int k=i;k>=1;k--)
			{ 
				System.out.print("*");
			}
			System.out.println();
		}
		*/
		
		
/*  No.25
 
******
######
******
######
******
######
	
 */
		/*
		for(int i=0;i<=5;i++)
		{
			for(int j=0;j<=5;j++)
			{
				if(i%2==0)
				{
					System.out.print("*");
				}
				else
				{
					System.out.print("#");
				}
			}
			System.out.println();
		}
		*/
		
/*  No.26
  
*****
*   *
*   *
*   *
*****

 */
		/*
		for(int i=1;i<=5;i++)
		{
			for(int j=1;j<=5;j++)
			{
				if(i==1 || i==5 || j==1 || j==5)
				{
					System.out.print("*");
				}
				else
				{
					System.out.print(" ");
				}
			}
			System.out.println();
		}
		*/
/*  No.27
 
*   *
*   *
*****
*   *
*   *

 */
		/*
		for(int i=1;i<=5;i++)
		{
			for(int j=1;j<=5;j++)
			{
				if( i==3 || j==1 || j==5)
				{
					System.out.print("*");
				}
				else
				{
					System.out.print(" ");
				}
			}
			System.out.println();
		}
		*/


/*  No.28
 
 	 * 
    * 
   * 
  * 
 * 


 */
		/*
		int n=5;
		for(int i=0;i<5;i++)
		{
			for(int j=0;j<n-i;j++)
			{
				System.out.print(" ");
			}
			for(int k=0;k<=i;k++)
			{
				System.out.print("* ");
				break;
			}
			System.out.println();
		}
		*/
/* No.29
  
 * 
  * 
   * 
    * 
     * 
      * 
 */
		/*
		int n=5;
		for(int i=5;i>=0;i--)
		{
			for(int j=n-i;j>=0;j--)
			{
				System.out.print(" ");
			}
			for(int k=0;k<=i;k++)
			{
				System.out.print("* ");
				break;
			}
			System.out.println();
		}
		*/

/* No.30
 
* 
* * 
* * * 
* * * * 
* * * * * 
* * * * 
* * * 
* * 
* 
 
 */
		/*
		for(int i=1;i<=5;i++)
		{
			for(int j=1;j<=i;j++)
			{
				System.out.print("* ");
			}
			System.out.println();
		}
		for(int k=4;k>=1;k--)
		{
			for(int m=k;m>=1;m--)
			{
				System.out.print("* ");
			}
			System.out.println();
		}
		*/
/* No.31
 
 	 *
    **
   ***
  ****
 *****
******
 *****
  ****
   ***
    **
     *

 */	
		/*
		int n=5;
		for(int i=0;i<=5;i++)
		{
			for(int j=0;j<n-i;j++)
			{
				System.out.print(" ");
			}
			for(int k=0;k<=i;k++)
			{
				System.out.print("*");
			}
			System.out.println();
		}
		for(int i=n-1;i>=0;i--)
		{
			for(int j=n-i;j>=1;j--)
			{
				System.out.print(" ");
			}
			for(int k=i;k>=0;k--)
			{
				System.out.print("*");
			}
			System.out.println();
		}
		*/
		
		
/* No.32

    * 
   * * 
  * * * 
 * * * * 
* * * * * 
 * * * * 
  * * * 
   * * 
    * 

 */
		/*
		int n=5;
		for(int i=1;i<=5;i++)
		{
			for(int j=1;j<=n-i;j++)
			{
				System.out.print(" ");
			}
			for(int k=1;k<=i;k++)
			{
				System.out.print("* ");
			}
			System.out.println();
		}
		for(int i=n-1;i>=1;i--)
		{
			for(int j=n-i;j>=1;j--)
			{
				System.out.print(" ");
			}
			for(int k=i;k>=1;k--)
			{
				System.out.print("* ");
			}
			System.out.println();
		}
		*/

		
/* No.33

     *
    ***
   *****
  *******
 *********
***********

 */
		/*
		int n=5;
		for(int i=0;i<=5;i++)
		{
			for(int j=0;j<n-i;j++)
			{
				System.out.print(" ");
			}
			for(int k=0;k<(2*i)+1;k++)
			{
				System.out.print("*");
			}
			System.out.println();
		}
		for(int i=0;i<=5;i++)
		{
			for(int j=0;j<n-i;j++)
			{
				System.out.print(" ");
			}
			for(int k=0;k<(2*i)+1;k++)
			{
				System.out.print("*");
			}
			System.out.println();
		}
		*/
		
/* No.34
 
* 
# # 
* * * 
# # # # 
* * * * * 

 */
		/*
		for(int i=1;i<=5;i++)
		{
			for(int j=1;j<=i;j++)
			{
				if(i%2!=0)
				{
					System.out.print("* ");
				}
				else
				{
					System.out.print("# ");
				}
			}
			System.out.println();
		}
		*/

/*  No.35

*   *
** **
*****
** **
*   *

 */
		/*
		for(int i=1;i<=5;i++)
		{
			for(int j=1;j<=5;j++)
			{
				if((i==3 || j==1 || j==5)||(i%2==0 && j%2==0))
				{
				System.out.print("*");
				}
				else
				{
					System.out.print(" ");
				}
			}
			System.out.println();
		}
		*/
		
/*  No.36
1 2 3 4 5 
10 9 8 7 6 
11 12 13 14 15 
20 19 18 17 16 
21 22 23 24 25 
		
 */
		/*
		int k=0;
		for(int i=1;i<=5;i++)
		{
			if(i%2!=0)
			{
				for(int j=1;j<=5;j++)
				{
					k++;
					System.out.print(k+" ");
					
				}
			}
			else
			{
				int t=k+1;
				for(int j=k+5;j>=t;j--)
				{
					k++;
					System.out.print(j+" ");
				}
			}
			System.out.println();
		}
		*/

/* No.37
 
*        *
**      **
***    ***
****  ****
**********
****  ****
***    ***
**      **
*        *

 */
		/*
		int n=5;
		for(int i=1;i<=n;i++)
		{
			for(int j=1;j<=i;j++)
			{
				System.out.print("*");
			}
			int gap=2*(n-i);
			for(int j=1;j<=gap;j++)
			{
				System.out.print(" ");
			}
			for(int j=1;j<=i;j++)
			{
				System.out.print("*");
			}
			System.out.println();
		}
		for(int i=n-1;i>=1;i--)
		{
			for(int j=1;j<=i;j++)
			{
				System.out.print("*");
			}
			int gap=2*(n-i);
			for(int j=1;j<=gap;j++)
			{
				System.out.print(" ");
			}
			for(int j=1;j<=i;j++)
			{
				System.out.print("*");
			}
			System.out.println();
		}
		*/

		
/* No.38

*        *
**      **
***    ***
****  ****
**********

 */
		/*
		int n=5;
		for(int i=1;i<=n;i++)
		{
			for(int j=1;j<=i;j++)
			{
				System.out.print("*");
			}
			int gap=2*(n-i);
			for(int j=1;j<=gap;j++)
			{
				System.out.print(" ");
			}
			for(int j=1;j<=i;j++)
			{
				System.out.print("*");
			}
			System.out.println();
		}
		*/
	 
/* No.39

	 1
    10
   101
  1010
 10101


 */
		/*
		for(int i=1;i<=5;i++)
		{
			for(int j=5;j>=i;j--)
			{
				System.out.print(" ");
			}
			for(int k=1;k<=i;k++)
			{
				if(k%2!=0)
				{
					System.out.print("1");
				}
				else
				{
					System.out.print("0");
				}
			}
			System.out.println();
		}
			*/
			
		
	}
	
}
