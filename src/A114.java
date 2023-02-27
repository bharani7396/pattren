
public class A114 {
	public static void main(String[] args) {
		for(int i = 5 , k = 1  ; i>=1; i--)
		{
			for(int j = 5-1 ; j>= i;j-- )
			{
				System.out.print("  ");
			}
			for(int j = i*2-1, l= k;j>=1 ; j--)
			{
				System.out.print(l++  + " ");
			}
			System.out.println();
		}
	}
}
