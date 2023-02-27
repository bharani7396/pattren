
public class B14 {
	 public static void main(String[] args) {
		 char c = 'a';
		 for (int i = 1; i<=9;i++) {
			 for(int j= 5;j>=1;j--) {
				
			 if (i==j||i  == 10-j)
			 {
				System.out.print(c++  + " " ); 
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
