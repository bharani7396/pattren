package patterns;

public class B28 {
	public static void main(String[] args) {
		for(int i = 1; i<=10;i++)
		{
			for(int j = 1; j<=10;j++)
			{
				if(j > 6-i && j<5+i && j<16-i && j>i-5)
				{
					System.out.print(" ");
				}
				else
				{
					System.out.print("*");
				}
			}
			System.out.println();
		}	
	}
}

















/*	for (int i = 1; i <=5; i++) 
		{

			for (int j = i;j<=5;j++)
			{
				System.out.print("* ");
			}
			for (int j = 1;j<=i*2-2;j++)
			{
				System.out.print("  ");
			}
			for(int j = i; j<=5;j++)
			{
				System.out.print("* ");
			}
			System.out.println();
		}
		for(int i = 1; i<=5;i++)
		{
			for(int j = 1;j<=i;j++)
			{
				System.out.print("* ");
			}
			for(int j =1; j<=10-(i*2);j++)
			{
				System.out.print("  ");
			}
			for(int j = 1;j<=i;j++)
			{
				System.out.print("* ");
			}
			System.out.println();
		}*/
