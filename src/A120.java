
public class A120 {
	public static void main(String[] args) {
		for(int i = 1 , k= 1 ,l=8 ; i<=5; i++,k++,l--)
		{
			int a = k;
			int b = l;
			for(int j = 2 ; j<= i;j++ )
			{
				System.out.print("  ");
			}
			for(int j =i*2-1 ;j<=9 ; j++)
			{
				if (i %2 == 1) 
				{
					System.out.print(a++ + " ");
				}
				else 
				{
					System.out.print(b-- + " ");
				}
				
			}
			System.out.println();
		}
	}
}
