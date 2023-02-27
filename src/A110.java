
public class A110 {
	public static void main(String[] args) {
		  char d = 'a';
			for(int i = 1 , k = -1; i<=6; i++,d++, k += 2)
			{
				for(int j = i+1 ; j<= 6;j++)
				{
					System.out.print("  ");
				}
				char c1 = 'a';
				for(int j = 1, l = k ; j <= i*2-1; j++,c1++)
				{
					if( j==1)
					{
					   System.out.print( c1 + " ");
					}
					else if (j == i*2-1 )
					{
						System.out.print(d + " ");
					}
					else
					{
						System.out.print(l-- + " ");
					}
				}
				System.out.println();
			}
		}
}
