
public class A79 {
	public static void main(String[] args) {
		char c = 'a';
		for(int i = 8 ;i>=1;i--,c++)
		{
			for(int j = 8-1; j>=i;j--)
			{
				System.out.print("  ");
			}
			for(int j = 1; j<=i;j++)
			{
				System.out.print(c +   " ");
			}
			System.out.println();
		}
	}
}
