
public class A106 {
	public static void main(String[] args) {
	
		for(int i = 1 ; i<=6; i++)
		{
			for(int j = i+1 ; j<= 6;j++ )
			{
				System.out.print("  ");
			}
			char c1 = 'a';
			for(int j = 1; j <= i*2-1; j++,c1++)
			{
				System.out.print( c1 + " ");
			}
			System.out.println();
		}
	}
}
