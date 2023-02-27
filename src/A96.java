
public class A96 {
	public static void main(String[] args) {
		for (int i = 1; i <=11; i++) {
			if (i <= 6)
			{
				for (int j=i;j>=1;j--)
				{
					if(i == j || j== 1)
					{
						System.out.print( "1 ");
					}
					else
					{
						System.out.print("0 ");
					}
				}

			}
			else	
			{
				for(int j=11;j>=i;j--) 
				{
					if(i == j || j== 11)
					{
						System.out.print( "1 ");
					}
					else
					{
						System.out.print("0 ");
					} 
				}

			}
			System.out.println();
		}
	}				
}
