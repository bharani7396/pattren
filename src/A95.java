
public class A95 {
	public static void main(String[] args) {
		for (int i = 1,k = 9; i <=9; i++,k--) {
			if (i <= 5)
			{
				for (int j=1;j<=i;j++)
				{
					System.out.print(i + " ");
				}

			}
			else	
			{
				for(int j=1;j<=10-i;j++) 
				{
					System.out.print(k + " ");
				}

			}
			System.out.println();
		}
	}				
}
