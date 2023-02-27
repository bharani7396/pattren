
public class A61 {
	public static void main(String[] args) {
		char c ='A';
		for(int i = 6; i>=1; i--,c++)
		{
			for(int j = i ;j >=1;j--)
			{
				System.out.print(c + " ");
			}
			System.out.println();
		}
	}
}
