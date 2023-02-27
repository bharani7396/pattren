
public class A94 {
	public static void main(String[] args) {
		for (int i = 1,k = 9,n=1; i <=9; i++,k--,n++) {
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
					System.out.print(n + " ");
				}

			}
			System.out.println();
		}
	}				
}
