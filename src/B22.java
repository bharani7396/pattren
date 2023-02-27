
public class B22 {
	public static void main(String[] args) {
		for (int i = 1,k = 11 ; i <=11; i++,k--) {
			if (i <= 6)
			{
				for (int j=1;j<=6-i;j++)
				{
					System.out.print("  ");
				}
				for (int j=1;j<=i*2-1;j++)
				{
					System.out.print(  "1 ");
				}    
			}
			else	
			{
				for(int j=7;j<=i;j++) 
				{
					System.out.print("  ");
				}
				for(int j=k*2-1;j>=1;j--) 
				{
					System.out.print(  "1 ");
				}
			}
			System.out.println();

		}				
	}
}
