
public class A82 {
	public static void main(String[] args) {
		for(int i = 1,k =7;i<=6;i++,k--)
		{
			for(int j =1; j<=6-i;j++ )
			{
				System.out.print("  ");
			}
			for(int j= 1, l =k; j<=i;j++)
			{
				System.out.print(l++ +" ");
			}
			System.out.println();
		}
		
		
		
//		for(int i = 7;i>=1;i--)
//		{
//			for(int j =i; j>=2;j-- )
//			{
//				System.out.print("  ");
//			}
//			for(int j= i; j<=7;j++)
//			{
//				System.out.print(j +" ");
//			}
//			System.out.println();
//		}
	}
}
