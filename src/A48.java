
public class A48 {
	public static void main(String[] args) {
		char c1 = 'P';
		for(int i = 6; i>=1;i--,c1--)
		{
			char c = c1;
			for(int j = i;j<=6; j++,c++)
			{
				System.out.print(c+ " ");
			}
			System.out.println();
		}
	}
}
