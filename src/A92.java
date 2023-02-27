
public class A92 {
	public static void main(String[] args) {
		for (int i = 1,k = 9; i <=9; i++)
		{
			if (i <= 5)
			{
				for (int j=1;j<=i;j++,k++)
				{
					System.out.print(j + " ");
				}

			}
			else	
			{
				for(int j=1;j<=10-i;j++) 
				{
					System.out.print(j + " ");
				}
			}
			System.out.println();
		}
	}				
}
