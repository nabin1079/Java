
class Local
{
static int c=30;
int b=20;
        public static void main(String args[])
        {
       int a=10;
       System.out.println("the local variable is "+ a);
       Local obj=new Local();
       System.out.println("the instance variable is "+ obj.b);
       System.out.println("the static variable is "+ c);
        }
    }
