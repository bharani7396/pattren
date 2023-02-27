
public class A57 {
	public static void main(String[] args) {
		for(int i = 6, k = 4;  i>=1; i--,k-- )
		{
			for(int j = i ,l = k;j >= 1; j--)
			{
				if(i == j || i==1||i==6||j==1||j==6)
				{
					System.out.print("0 ");
				}
				else
				{
					System.out.print(l-- + " ");
				}
			}
			System.out.println();
		}
	}
}
