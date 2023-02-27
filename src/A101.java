
public class A101 {
	public static void main(String[] args) {
		for(int i = 1 ; i<=6; i++)
		{
			for(int j = i+1 ; j<= 6;j++ )
			{
				System.out.print("  ");
			}
			for(int j = 1; j <= i*2-1; j++)
			{
				System.out.print("1 ");
			}
			System.out.println();
		}
	}
}
