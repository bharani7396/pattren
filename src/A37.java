
public class A37 {
	public static void main(String[] args) {
		for(int i = 1 ; i<=8; i++)
		{
			for(int j = 1, k= 1 ; j<=i;j++)
			{
			   if ( i==j || i == 1 || i == 8 || j == 1|| j == 8 )
			   {
				   System.out.print("0 ");
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
