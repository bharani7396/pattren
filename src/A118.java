
public class A118 {
	public static void main(String[] args) {
		char c = 'p';
		char a = 'x';
		for(int i = 5   ; i>=1; i--,c++,a--)
		{
			for(int j = 5 ; j>= i;j-- )
			{
				System.out.print("  ");
			}
			char d = c;
			
			for(int j = i*2-1;j>=1 ; j--)
			{ 
			
				if ( j == i*2-1)
				{
					System.out.print(d++ + " ");
				}
				else if(j==1)
				{
					System.out.print(a + " ");
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
