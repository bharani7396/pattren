
public class A116 {
	public static void main(String[] args) {
		for(int i = 5  ; i>=1; i--)
		{	
			for(int j = 5 ; j>= i;j-- )
			{
				System.out.print("  ");
			}
			char c = 'a';
			for(int j = i*2-1;j>=1 ; j--)
			{
				if (i==5||j==1||j==i*2-1)
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
