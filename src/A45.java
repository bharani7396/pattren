
public class A45 {
public static void main(String[] args) {
	char c1 = 'A';
	for(int i = 1 ; i<=6; i++,c1++)
	{
		char c = c1;
		for (int j= 1; j<=i;j++,c--)
		{
			System.out.print(c + " ");
		}
		System.out.println();
	}
}
}
