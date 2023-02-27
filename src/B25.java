
public class B25 {
	public static void main(String[] args) {
		for (int i = 1,k = 13 ; i <=13; i++,k--) {
			if (i <= 7)
			{
				for (int j=i;j<=6;j++)
					{
					   System.out.print("  ");
			        }
			        for (int j=i*2-1;j>=1;j--)
						{
			        	   if(j==1||j==i*2-1||j==5||j==9)
			        	   {
			        		   System.out.print("1 ");
			        	   }
			        	   else
			        	   {
			        		   System.out.print("  ");
			        	   }
			            }    
			}
		  else	
		  {
			  for(int j=8;j<=i;j++) 
				  {
				     System.out.print("  ");
			      }
				   for(int j=1;j<=k*2-1;j++) 
				     {
					   if(j==k*2-1||j==1||j==5||j==9)
		        	   {
		        		   System.out.print("1 ");
		        	   }
		        	   else
		        	   {
		        		   System.out.print("  ");
		        	   }
			      }
		    }
			System.out.println();
		   
	    }				
	  }
}
