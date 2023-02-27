
public class B3 {
	public static void main(String[] args) {
		for (int i = 1, k = -7; i <=9; i++, k += 2 ) 
		{
			if (i <= 5)
			{
				for (int j = 1;j<=5 - i;j++)
				{
					System.out.print("  ");
				}
				for (int j = 1;j<=i;j++)
				{
					System.out.print( j +  " ");
				}
			}
			else	
			{
				for(int j = 1;j <=i- 5;j++)
				{
					System.out.print("  ");
				}
				for(int j = 1 , l = k ;j <=10 -i;j++)
				{
					System.out.print(l++  +  " ");
				}
			}
			System.out.println();
		}
	}	     
}
