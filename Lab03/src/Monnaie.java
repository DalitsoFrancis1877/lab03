import java.util.Scanner;

public class Monnaie 
{
	public static int montant;
	public static int cents = 0;
	public static void input()
	{
		montant = Ask("Entrez montant.(pas plus grand que 1000 et pas plus petit que 0.01$");
	}
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
		input();
		
		if(montant <= 1000)
		{
			Say("montant trop grand");
			Say("reessayez");
			input();
		}
		
		decomposition();
	}
	
	public static void decomposition()
	{
		hundred();
		
	}
	
	public static void hundred()
	{
		if(montant >= 100)
		{
			montant = montant - 100;
			cents = cents + 1;
		}
		
		if(montant >= 100)
		{
			hundred();
		}
	}
}
