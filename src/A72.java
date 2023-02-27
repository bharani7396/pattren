
public class A72 {
	public static void main(String[] args) {
		
		for(int i = 7 , k= 1;i>=1;i--, k++)
		{
			for(int j = 6; j>=i;j--)
			{
				System.out.print("  ");
			}
			for(int j = 1; j<=i;j++)
			{
				System.out.print(k +  " " );
			}
			System.out.println();
		}

		
		/*for(int i = 1 ;i<=7;i++)
		{
			for(int j = i-1; j>=1;j--)
			{
				System.out.print("  ");
			}
			for(int j = 7; j>=i;j--)
			{
				System.out.print( i + " ");
			}
			System.out.println();
		}*/
  }
}