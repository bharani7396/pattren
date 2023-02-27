
public class B12 {
	 public static void main(String[] args) {
		 for (int i = 1, k = 1; i<=9;i++) {
			 for(int j= 5;j>=1;j--) {
				
			 if (i==j||i  == 10-j)
			 {
				System.out.print(k++  + " " ); 
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
