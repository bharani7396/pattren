
public class A89 {
	public static void main(String[] args) {

		for(int i = 1;i<=6;i++)
		{
	
			int k = 0;
			for(int j =1; j<=6-i;j++ )
			{
				System.out.print("  ");
			}
			
			for(int j= 1; j<=i;j++)
			{
				if (i == j || j == 1 || j == 6 || i == 1||i==6)
				{
					System.out.print("P ");
				}
				else
				{
					System.out.print(k++ + " ");
				}
			}
			System.out.println();
		}
	}
}
