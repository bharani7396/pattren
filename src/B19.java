
public class B19 {
	 public static void main(String[] args) {
		 char c = 'a';
		 for (int i = 1; i<=7;i++,c++) {
			 for(int j= 1;j<=13;j++) {
				
			 if (i==j||i== 14-j)
			 {
				System.out.print(c + " "); 
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
