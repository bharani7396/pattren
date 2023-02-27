
public class A44 {
	public static void main(String[] args) {
		char c1 = 'A';
		for(int i =1 ; i<=7;i++)
		{
			char c =c1;
			for(int j = 1; j<=i; j++,c++)
			{
				System.out.print(c  + " ");
			}
			System.out.println();
		}
	}
}
