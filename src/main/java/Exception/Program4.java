package Exception;

public class Program4 {
    public static void main(String[] args)
    {
        try
        {
         //checkEligibility(10);
        }
        catch (ArithmeticException e)
        {
         System.out.print(e);
        }
        catch (Exception e)
        {
          System.out.print(e);
        }
        /*public static void checkEligibility(int age) throws ArithmeticException
        {
           if(age>18)
           {
               throw new ArithmeticException("hey! kid you are under age");
           }
           else
           {
               System.out.print("You are eligible to registered");
           }
        }*/

    }
}
