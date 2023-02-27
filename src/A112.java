
public class A112 {
	public static void main(String[] args) {
		for(int i = 4, k = 1 ; i>=1; i--,k++)
		{
			for(int j = 4 ; j>= i;j-- )
			{
				System.out.print("  ");
			}
			for(int j = i*2-1;j>=1 ; j--)
			{
				System.out.print(k + " ");
			}
			System.out.println();
		}
	}
}
