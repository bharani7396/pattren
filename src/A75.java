
public class A75 {
	public static void main(String[] args) {
		for(int i = 7 ;i>=1;i--)
		{
			for(int j = 7-1; j>=i;j--)
			{
				System.out.print("  ");
			}
			for(int j = i; j>=1;j--)
			{
				System.out.print( j + " ");
			}
			System.out.println();
		}
  }
}
