
public class A80 {
	public static void main(String[] args) {
		for(int i = 1 ;i<=7;i++)
		{
			for(int j = i-1; j>=1;j--)
			{
				System.out.print("  ");
			}
			char c = 'P';
			for(int j = 7; j>=i;j--,c++)
			{
				System.out.print( c + " ");
			}
			System.out.println();
		}
	}
}
