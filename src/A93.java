
public class A93 {
	public static void main(String[] args) {
		for (int i = 1,k = 1, n = 9; i <=9; i++,k++,n--) {
			if (i <= 5)
			{
				for (int j=1,l = k;j<=i;j++){
					System.out.print( l-- + " ");
			}
			 
			}
		  else	
		  {
			  for(int j=1, m=n ;j<=10-i;j++) 
				  {
				     System.out.print(m-- + " ");
			      }
	      
		    }
			System.out.println();
		   }
	    }				
}
