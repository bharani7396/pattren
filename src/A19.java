
public class A19 {
	public static void main(String[] args) {
		for  (int i = 0  ; i<=6;i++)
		{
			for (int j = 0,k = 3; j<=5; j++)
			{
				if(i == 0||j==0||i==6||j==5)
				{
					System.out.print("0 ");
				}
				else 
				{
					System.out.print(k-- + i  + " ");
				}
			}
			System.out.println();
		}
	}
}
