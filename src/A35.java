
public class A35 {
public static void main(String[] args) {
	for(int i = 1 ; i<=8; i++)
	{
		for(int j = 1 ; j<=i;j++)
		{
		   if ( i==j || i == 1 || i == 8 || j == 1|| j == 8 )
		   {
			   System.out.print("1 ");
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
