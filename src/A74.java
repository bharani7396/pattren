
public class A74 {
	public static void main(String[] args) {
		for(int i = 1,k=7 ;i<=7;i++,k--)
		{
			for(int j = i-1; j>=1;j--)
			{
				System.out.print("  ");
			}
			for(int j = 7; j>=i;j--)
			{
				System.out.print( k + " ");
			}
			System.out.println();
		}
  }
}
