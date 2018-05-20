import java.util.Scanner;

public class ReverseWords
{
	public static boolean containsSpaces(String str)
	{
		int strLen = str.length();
		boolean hasSpaces = false;

		for ( int i = 0; i < strLen; i++ )
		{
			char character = str.charAt(i);
			if ( character == ' ' )
			{
				hasSpaces = true;
			}
		}

		return hasSpaces;
	}

    public static void main(String[] args)
    {

		System.out.printf("Please enter the string to reverse: ");
		
		Scanner read = new Scanner(System.in);

		String str = read.nextLine();

		if ( str.trim().length() < 1 )
		{
			do
			{
				System.out.printf("String cannot be empty.\n");
				System.out.printf("Please enter the string to reverse: ");
				str = read.nextLine();
			} while ( str.trim().length() < 1 );
		}

		if ( !containsSpaces(str) )
		{
			do
			{
				System.out.printf("String must include spaces.\n");
				System.out.printf("Please enter the string to reverse: ");
				str = read.nextLine();
			} while ( !containsSpaces(str) );
		}


		String [] strParts = str.split(" ", 0);

		int count = strParts.length;

		String result = "";

		while ( count > 0 )
		{
			count--;
			String reversedOrderString = strParts[count];

			if ( count > 0 )
			{
				result += reversedOrderString;
				result += " ";
			}
			
			else
			{
				result += reversedOrderString;
			}

		}

		if (result.length() > 0)
		{
			System.out.println(result);
		}
    }
}
