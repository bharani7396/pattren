
public class A18 {
	public static void main(String[] args) {
		for  (int i = 0; i<=5;i++)
		{
			for (int j = 0, k = 4 ; j<=5; j++)
			{
		       if(i == 0||j==0||i==5||j==5)
		       {
		    	   System.out.print("0 ");
		       }
		       else 
		       {
		    	   System.out.print(k-- + " ");
		       }
			}
			System.out.println();
		}
	}
}
