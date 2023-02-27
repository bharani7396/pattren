
public class A85 {
	public static void main(String[] args) {
		for(int i = 7;i>=1;i--)
		{
			for(int j =i; j>=2;j-- )
			{
				System.out.print("  ");
			}
			for(int j= i; j<=7;j++)
			{
				if(i == j || j==7||i==1)
				{
					System.out.print(i +" ");
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
