
public class B13 {
	 public static void main(String[] args) {
		 for (int i = 1, k = 9, l = 6; i<=9;i++) {
			 for(int j= 5;j>=1;j--) {
				
			 if (i==j)
			 {
				System.out.print(k--   + " " ); 
				
			 }
			 else if(i  == 10-j)
			 {
				 System.out.print(l++  +  "  ");
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
