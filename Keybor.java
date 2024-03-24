import java.util.Scanner;
class Keybor
{
    public static void main(String arg[])
    {
       int a,b,add,sub,mul,div;
       System.out.println("Enter the Value of a and b");
       Scanner s=new Scanner(System.in);
       a=s.nextInt();
       b=s.nextInt();
       add=a+b;
       sub=a-b;
       mul=a*b;
       div=a/b;
       System.out.println("The sum of number is " + add);
       System.out.println("The substraction of number is " + sub);
       System.out.println("The multiplication of number is " + mul);
       System.out.println("The division of number is " + div);
}
    }

