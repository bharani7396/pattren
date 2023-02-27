
public class B4 {
	public static void main(String[] args) {
		for (int i = 9; i>=1; i--)
		{
			if (i >= 5)
			{
				for (int k = i;  k>5;k--)
				{
					System.out.print("  ");
				}
				for (int j = i ; j<=9; j++)
				{
					System.out.print(j +   " ");
				}
			}
			else	
			{
				for(int k =5; k>i; k--) 
				{
					System.out.print("  ");
				}
				for(int j=i; j >=1; j--)
				{
					System.out.print(10-j +  " ");
				}
			}
			System.out.println();
		}
	}	     
}
