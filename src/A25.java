
public class A25 {
 public static void main(String[] args) {
	char c1  = 'F';
	for (int i = 1; i <= 5;i++,c1++)
	{
		char c = c1;
		for(int j = 1  ; j<=6 ; j++)
		{
			System.out.print(c-- + " ");
		}
		System.out.println();
	}
}
}