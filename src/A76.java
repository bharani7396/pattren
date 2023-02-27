
public class A76 {
	public static void main(String[] args) {
		for(int i = 1 ;i<=7;i++)
		{
			for(int j = i-1; j>=1;j--)
			{
				System.out.print("  ");
			}
			for(int j = 7,k = 7; j>=i;j--,k--)
			{
				System.out.print( k + " ");
			}
			System.out.println();
		}
  }
}
