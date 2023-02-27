
public class A50 {
	public static void main(String[] args) {
		char c1 = 'P';
		for(int i = 1;i<=5;i++,c1++)
		{
			char c =c1 ;
			for(int j = 1;j<=i;j++,c--)
			{
				if(i == j ||j==1)
				{
					System.out.print( c  + " ");
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