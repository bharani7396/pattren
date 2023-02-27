
public class A58 {
	public static void main(String[] args) {
		for(int i = 5,k = 1; i>=1; i--)
		{
			for(int j = i ,l = k ; j>=1;j--)
			{
				if(i==5||j==1)
				{
					System.out.print("0 ");
				}
				else
				{
					System.out.print(l++ + " ");
				}		
			}
			System.out.println();
		}
	}
}
