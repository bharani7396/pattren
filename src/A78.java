
public class A78 {
	public static void main(String[] args) {
		for(int i = 7 ;i>=1;i--)
		{
			for(int j = 7-1; j>=i;j--)
			{
				System.out.print("  ");
			}
			for(int j = 1; j<=i;j++)
			{
				if(i == j || i == 1||i==7||j==1||j==7)
				{
					System.out.print( "1 ");
				}
				else
				{
					System.out.print("0 ");
				}

			}
			System.out.println();
		}
	}
}
