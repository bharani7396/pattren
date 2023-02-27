
public class A97 {
public static void main(String[] args) {
	for (int i = 0; i <=10; i++) {
		if (i <= 5)
		{
			for (int j=0;j<=i;j++)
			{
				 if(i == j || j== 0)
				 {
					 System.out.print( "0 ");
				 }
				 else
				 {
					 System.out.print( j + " ");
				 }
		    }
		 
		}
	  else	
	  {
		  for(int j=0;j<=10-i;j++) 
			  {
			  if(i == j || j== 10-i)
				 {
					 System.out.print( "0 ");
				 }
				 else
				 {
					 System.out.print( j + " ");
				 } 
		      }
      
	    }
		System.out.println();
	   }
    }			

}
