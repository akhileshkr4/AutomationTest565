package Exception;

public class Program3 {
    public static void main(String[] args)
    {
        try
        {
          int i=10;
          int b=0;
          System.out.print(i/b);//create the object of ArithmeticException
        }
        catch (ArithmeticException e)
        {
            System.out.print("catch the arithmeticException");
        }
        finally
        {
           System.out.println("This is finally block");
           System.out.println("program ends");
        }


    }


}
