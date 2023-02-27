
public class B21 {
	 public static void main(String[] args) {
		 char c = 'r';
		 char d = 'r';
		 for (int i = 5; i>=1;i--,c++)
		 {
			 for(int j= 1;j<=9;j++)
			 {
				
			     if ( i + j == 10)
			     {
				    System.out.print(c + " " ); 
			     }
			    else if(i==j)
			      {
				     System.out.print(d  + " ");
			      }
			    else
			     {
				    System.out.print("  "); 
			     }
			 }
			 System.out.println();
		 }
	  }
}
