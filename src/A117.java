
public class A117 {
	public static void main(String[] args) {
		char c = 'p';
		for(int i = 5   ; i>=1; i--,c++)
		{
			for(int j = 5 ; j>= i;j-- )
			{
				System.out.print("  ");
			}
			char d = c;
			for(int j = i*2-1;j>=1 ; j--)
			{
				System.out.print(d++ + " ");
			}
			System.out.println();
		}
	}
}
