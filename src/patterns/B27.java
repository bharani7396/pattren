package patterns;

public class B27
{
	public static void main(String[] args) {
		for(int i = 1; i<=5; i++)
		{
			for(int j = 8 ; j>=i;j--)
			{
				System.out.print("*");
			}
			for(int j = 1 ; j<=i;j++)
			{
				System.out.print(i  + "*");
			}
			for(int j = 7 ; j>=i;j--)
			{
				System.out.print("*");
			}
			System.out.println();
		}
	}
}	



























/* for(int i = 1; i <= 8; i++)
		{
			for(int j = i; j <= 8; j++)
			{
				if(i <= 5)
				{
					System.out.print("*");
				}
				else
				{
					System.out.print(" ");
				}
			}
			for(int j = 1; j <= (i*2)-1; j++)
			{
				if(i <= 5)
				{
					if(j%2 == 0)
					{
						System.out.print("*");
					}
					else
					{
						System.out.print(i);
					}
				}
				else
				{
					System.out.print(" ");
				}
			}
			for(int j = i; j <= 8; j++)
			{
				if(i <= 5)
				{
					System.out.print("*");
				}
				else
				{
					System.out.print(" ");
				}
			}
			System.out.println();

		}  */ 
