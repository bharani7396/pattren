package patterns;

public class B32 {
	public static void main(String[] args) {
		for(int i = 1; i<=5; i++)
		{
			for(int j = i+1; j<=5; j++)
			{
				System.out.print("  ");
			}
			for(int j = 1; j<= i*2-1; j++)
			{
				if(j%2==1)
				{
					System.out.print("1 ");
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
















/*for (int i = 0; i < 5; i++) {
int k = 1;
System.out.printf("%" + (5 - i) * 2 + "s", "");
for (int j = 0; j <= i; j++) {
    System.out.printf("%4d", k);
    k = k * (i - j) / (j + 1);
}
System.out.println();
}*/