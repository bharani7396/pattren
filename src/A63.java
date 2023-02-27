
public class A63 {
	public static void main(String[] args) {
		char c ='E';
		for(int i = 5; i>=1; i--,c--)
		{
			for(int j = i ;j >=1;j--)
			{
				System.out.print(c + " ");
			}
			System.out.println();
		}
	}
}
