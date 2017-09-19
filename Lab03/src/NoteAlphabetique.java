import java.util.Scanner;

public class NoteAlphabetique 
{
	public static int note;
	public static void input()
	{
		note = Ask("Quelle est votre note?");
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
		
		if(note > 100 || note < 0)
		{
			Say("Note entree invalide");
			input();
		}
		
		if(note >= 90 && note <= 100)
		{
			Say("Vous avez un A+");
		}
		
		if(note >= 85 && note <= 89)
		{
			Say("Vous avez un A");
		}
		
		if(note >= 80 && note <= 84)
		{
			Say("Vous avez un A-");
		}
		
		if(note >= 77 && note <= 79)
		{
			Say("Vous avez un B+");
		}
		
		if(note >= 74 && note <= 76)
		{
			Say("Vous avez un B");
		}
		
		if(note >= 70 && note <= 73)
		{
			Say("Vous avez un B-");
		}
		
		if(note >= 67 && note <= 69)
		{
			Say("Vous avez un C+");
		}
		
		if(note >= 64 && note <= 66)
		{
			Say("Vous avez un C");
		}
		
		if(note >= 60 && note <= 63)
		{
			Say("Vous avez un C-");
		}
		
		if(note >= 57 && note <= 59)
		{
			Say("Vous avez un D+");
		}
		
		if(note >= 54 && note <= 56)
		{
			Say("Vous avez un D");
		}
		
		if(note >= 53 && note <= 50)
		{
			Say("Vous avez un D-");
		}
		
		if(note <= 50)
		{
			Say("Vous avez un EC");
		}
		
	}

}