
public class A105 {
	public static void main(String[] args) {
		for(int i = 1, k = 9  ; i<=5; i++,k -= 2)
		{
			for(int j = i+1 ; j<= 5;j++ )
			{
				System.out.print("  ");
			}
			for(int j = 1, l = k ; j <= i*2-1; j++)
			{
				System.out.print(l++ + " ");
			}
			System.out.println();
		}
	}
}
