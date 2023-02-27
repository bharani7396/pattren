
public class A55 {
	public static void main(String[] args) {
		for(int i = 6;  i>=1; i-- )
		{
			for(int j = i ;j >= 1; j--)
			{
				if(i == j || i==1||i==6||j==1||j==6)
				{
					System.out.print("0 ");
				}
				else
				{
					System.out.print("1 ");
				}
			}
			System.out.println();
		}
	}
}
