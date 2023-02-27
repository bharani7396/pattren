
public class B24 {
	public static void main(String[] args) {
		for (int i = 1,k = 11 ; i <=11; i++,k--) {
			int l = 5;
			if (i <= 6)
			{
				for (int j=1;j<=6-i;j++)
					{
					   System.out.print("  ");
			        }
			        for (int j=1;j<=i*2-1;j++)
						{
			        	   if(j==1||j==i*2-1)
			        	   {
			        		   System.out.print("1 ");
			        	   }
			        	   else if(i==j ||i==6 && j<=5)
			        	   {
			        		   System.out.print(j + " ");
			        	   }
			        	   else if(i==6&&j>=7)
			        	   {
			        		   System.out.print(l-- + " ");
			        	   }
			        	   else
			        	   {
			        		   System.out.print("  ");
			        	   }
			            }    
			}
		  else	
		  {
			  for(int j=7;j<=i;j++) 
				  {
				     System.out.print("  ");
			      }
				   for(int j=k*2-1;j>=1;j--) 
				     {
					   if(j==k*2-1||j==1)
		        	   {
		        		   System.out.print("1 ");
		        	   }
					   else if(k==j)
		        	   {
		        		   System.out.print(j + " ");
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
