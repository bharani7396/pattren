
public class A99 {
	public static void main(String[] args) {	
		for (int i = 1; i <=11; i++) {
			if (i <= 5)
			{
				char c = 'a';
				for (int j=1;j<=i;j++,c++){
					System.out.print(c + " ");
			}
			 
			}
		  else	
		  {
			  char c ='a';
			  for(int j=1;j<=12-i;j++,c++) 
				  {
				     System.out.print(c + " ");
			      }
	      
		    }
			System.out.println();
		   }
	    }				
}
