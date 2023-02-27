
public class A64 {
	public static void main(String[] args) {
		char c1 ='E';
		for(int i = 5; i>=1; i--,c1--)
		{
			char c= c1;
			for(int j = i ;j >=1;j--,c--)
			{
				System.out.print(c + " ");
			}
			System.out.println();
		}
	}
}
