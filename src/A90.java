
public class A90 {
	public static void main(String[] args) {
		char c1 = 'P';
	
		for(int i = 1;i<=6;i++,c1++)
		{
			char c = 'P';
			for(int j =1; j<=6-i;j++ )
			{
				System.out.print("  ");
			}
			int k = 0;
			for(int j= 1; j<=i;j++,c++)
			{
				if (i == j || j == 1 || j == 6 || i == 1||i==6)
				{
					System.out.print(c +" ");
				}
				else
				{
					System.out.print( k++ + " ");
				}
			}
			System.out.println();
		}
	}
}
