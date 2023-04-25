import java.util.Scanner;
class InvalidUserException extends Exception
{
public InvalidUserException(String msg)
{
super(msg);
}
}
class Exceptions
{
public static void main(String args[])
{
	String username,password;
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter the Username: ");
	username = sc.nextLine();
	System.out.println("Enter the Password: ");
	password = sc.nextLine();
	try
	{
		if (username.length()<8)
			throw new InvalidUserException("Invalid Username. Username must be of alteast eight charaters");
		else if (!password.equals("12345678"))
			throw new InvalidUserException("Invalid Password, Try again!");
		else
			System.out.println("Login Successful");
	}
	catch(InvalidUserException e)
	{
		e.printStackTrace();
	}
}
}
