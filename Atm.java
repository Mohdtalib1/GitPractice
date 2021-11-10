import java.util.Scanner;
class Atm {
	public static void main(String args[]) {
		
		int amt,a,b,c,d,e,f;
		
		System.out.println("Enter your amount");

		Scanner s=new Scanner(System.in);
		amt=s.nextInt();

		if(amt<=25000)
		{
			if(amt%10==0)
			{
				if(amt>=2000)
				{
					a=amt/2000;
					amt=amt%2000;
					System.out.println("2000 notes - " +a);
				}
				if(amt>=500)
				{
					b=amt/500;
					amt=amt%500;
					System.out.println("500 notes - " +b);
				}
				if(amt>=100)
				{
					c=amt/100;
					amt=amt%100;
					System.out.println("100 notes - " +c);
				}
				if(amt>=50)
				{
					d=amt/50;
					amt=amt%50;
					System.out.println("50 notes - " +d);
				}
				if(amt>=20)
				{
					e=amt/20;
					amt=amt%20;
					System.out.println("20 notes - " +e);
				}
				if(amt>=10)
				{
					f=amt/10;
					amt=amt%10;
					System.out.println("10 notes - " +f);
				}
			}
			else 
				System.out.println("Please enter the amount in the multiple of 10");
		}
		else
			System.out.println("Entered amount is above to the limit 25000");
	}
}
					
				
				
		
	
	
	
