
public class A36 {
	public static void main(String[] args) {
		for(int i = 1 ; i<=9; i++)
		{
			for(int j = 1 ; j<=i;j++)
			{
			   if ( i==j || i == 1 || i == 9 || j == 1|| j == 9 )
			   {
				   System.out.print("0 ");
			   }
			   else 
			   {
				   System.out.print("1 ");
			   }
			}
			System.out.println();
		}
	}
}
