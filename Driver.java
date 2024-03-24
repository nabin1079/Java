import java.lang.*;
import java.util.*;

public class Driver {
	public static void main(String args[])
	{
		System.out.println("Enter your age");
	Scanner s=new Scanner(System.in);
	int age;
	age= s.nextInt();
	if (age>=18)
	{
			
System.out.println("You can Drive ");
}
	else {
		System.out.println("You cannot drive");
	}
}
}