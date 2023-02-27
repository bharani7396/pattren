
public class A98 {
	public static void main(String[] args) {
		for (int i = 0; i <=10; i++) {
			if (i <= 5)
			{ 
				char c1 = 'p';
				for (int j=0;j<=i;j++,c1++)
				{
					 if(i == j || j== 0)
					 {
						 System.out.print( "0 ");
					 }
					 else
					 {
						 System.out.print( c1 + " ");
					 }
			    }
			 
			}
		  else	
		  {  
			   char c1 = 'p';
			  for(int j=0;j<=10-i;j++,c1++) 
				  {
				  if(j == 0 || j== 10-i)
					 {
						 System.out.print( "0 ");
					 }
					 else
					 {
						 System.out.print(  c1 + " ");
					 } 
			      }
	      
		    }
			System.out.println();
		   }
	    }			

}
