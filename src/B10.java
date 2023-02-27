
public class B10 {
	public static void main(String[] args) {
		char c = 'a';
		char a = 'a';
		for (int i = 1, k=1; i <=9; i++,c++,a++)
		{
			if (i <= 5)
			{
				for (int j = 1;j<=5 - i;j++)
				{
					System.out.print("  ");
			    } 
				char d = c ;
				for (int j = 1;j<=i;j++)
				{
					if (i == j || j==1)
					{
						System.out.print(d  +   " ");
					}
					else
					{
						System.out.print(k++ +  " ");
					}
			    }
			}
		  else	
		  {
			  char b = a;
			  for(int j=1;j <=i- 5;j++)
			     {
				  System.out.print("  ");
			     }
			  
			  for(int j=1;j <=10 -i;j++)
			  {
				  if ( j==1||j == 10 - i)
					{
						System.out.print(b +   " ");
					}
					else
					{
						System.out.print(k++ +  " ");
					}
			   }
		   }
	      System.out.println();
		  }
	     
	   }	     
}
