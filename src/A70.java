
public class A70 {
	public static void main(String[] args) {
	      
		for(int i = 5; i>=1; i--)
		{
			char c = 'A';
			for(int j = 1 ;j <=i;j++,c++)
			{
				System.out.print(c + " " + j+" " );
			}
			System.out.println();
		}
	}
}
