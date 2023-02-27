package patterns;

public class B29 {
	public static void main(String[] args) {

		for(int i = 1; i<=10;i++)
		{
			for(int j = 1; j<=10;j++)
			{
				if(j > 11-i && j<i || j<11-i&&j>i)
				{
					System.out.print(" ");
				}
				else
				{
					System.out.print("*");
				}
			}
			System.out.println();
		}	
	}
}





























/*for (int i = 1; i <=5; i++) {

for (int j = 1;j<=i;j++)
   {
	System.out.print("* ");
   }
for (int j = 1;j<=10-2*i;j++)
{
	System.out.print("  ");
}
for(int j = 1; j<=i;j++)
{
	System.out.print("* ");
}
System.out.println();
}
for (int i = 1; i <=5; i++) {

for (int j = i;j<=5;j++)
{
System.out.print("* ");
}
for (int j = 1;j<=i*2-2;j++)
{
System.out.print("  ");
}
for(int j = i; j<=5;j++)
{
System.out.print("* ");
}
System.out.println();
}*/