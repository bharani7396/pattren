
public class A67 {
	public static void main(String[] args) {
		for(int i = 5; i>=1; i--)
		{
			char c = 'P';
			for(int j = i ;j >=1;j--,c++)
			{
				System.out.print(c + " ");
			}
			System.out.println();
		}
	}
}
