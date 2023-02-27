
public class A103 {
	public static void main(String[] args) {
		for(int i = 1 ; i<=6; i++)
		{
			char c = 'a';
			for(int j = i+1 ; j<= 6;j++ )
			{
				System.out.print("  ");
			}
			for(int j = 1; j <= i*2-1; j++)
			{
				if( i==6||j==1||j== i*2-1)
				{
					System.out.print("1 ");
				}
				else
				{
			        
					System.out.print(c++ + " ");
				}
			}
			System.out.println();
		}
	}
}
