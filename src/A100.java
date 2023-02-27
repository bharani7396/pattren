
public class A100 {
	public static void main(String[] args) {	
		for (int i = 1; i <=11; i++) {
			if (i <= 6)
			{
				char c = 'p';
				for (int j=1;j<=i;j++,c++)
				{
					if(j == i || j == 1 )
					{
					   System.out.print(c + " ");
					}
					else
					{
						System.out.print("0 ");
					}
			}
			 
			}
		  else	
		  {
			  char c1 ='z';
			  for(int j=11;j>=i;j--,c1--) 
				  {
				    if (j==11)
				    {
				    	 System.out.print( "p ");
				    }
				    else if (j==i)
				    {
				    	System.out.print( c1 + " ");
				    }
				    else
				    {
				    	System.out.print("0 ");
				    }
			      }
	      
		    }
			System.out.println();
		   }
	    }				
}
