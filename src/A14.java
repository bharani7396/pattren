
public class A14 {
	public static void main(String[] args) {
		for (int i = 7 ; i>= 5 ;i--)
		{
			for  (int  j =7, k = i  ; j>=3 ;j-- )
			{
				System.out.print(k-- + " ");
			}
			System.out.println();
		}
	}
}
