
public class A41 {
	public static void main(String[] args) {
		for(int i = 1, k= 7; i<=7;i++,k--)
		{
			for(int j = 1, l = k  ; j<=i;j++,l++)
			{
				if(i == j)
				{
					System.out.print("0 ");
				}
				else
				{
					System.out.print(l  +" ");
				}
			}
			System.out.println();
		}
	}
}
