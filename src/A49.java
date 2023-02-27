
public class A49 {
public static void main(String[] args) {
	for(int i = 1; i<=6;i++)
	{  
		char c1 = 'P' ;
		for(int j= 1; j<=i;j++,c1++)
		{
		  if( i == j||  i==1|| j==1 || j == 6)
		  {
			  System.out.print(c1++  + " ");
		  }
		  else
		  {
			  System.out.print("0 ");
		  }
		}
		System.out.println();
	}
}

}
