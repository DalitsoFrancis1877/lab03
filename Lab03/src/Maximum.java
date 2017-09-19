import java.util.Scanner;

public class Maximum 
{
	public static void Say(String s)
	{
		System.out.print(s);
	}
	public static int Ask(String s)	
	{
		Say(s);
		Scanner reader = new Scanner(System.in);
		int n = reader.nextInt();
		return n;
	}
	public static void main(String[] args) 
	{
		int number1 = Ask("premier numero");
		int number2 = Ask("deuxieme numero");
		int number3 = Ask("troisieme numero");
		
		if(number1 > number2)
		{
			
			if(number1 > number3)
			{
				System.out.print("le plus grand chiffre est "+ number1);
			}
		}
		
		
		if(number2 > number1)
		{
			if(number2 > number3)
			{
				System.out.print("le plus grand chiffre est "+ number2);
			}
		}
		
		if(number3 > number1)
		{
			if(number3 > number2)
			{
				System.out.print("le plus grand chiffre est "+ number3);
			}
		}
	}
}
