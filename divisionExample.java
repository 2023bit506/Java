/*Write a method that calculates the division of two numbers but declares to throw an ArithmeticException if the divisor is zero using the throws keyword.
Demonstrate the usage of this method in a main program by handling the exception appropriately.
 */


public class divisionExample 
{
    public static double division(double dividend, double divisor) throws ArithmeticException
    {
        if(divisor==0)
        {
            throw new ArithmeticException("cannot divide by zero");
        }
        else
        {
            return dividend / divisor;

        }
    }
    public static void main(String[] args) {
        double dividend = 10;
        double divisor = 0;

        try
        {
            double result = division(dividend,divisor);
            System.out.println("Result : "+ result);
        }
        catch(ArithmeticException e)
        {
            System.out.println("Exception Caught: "+e.getMessage());
        }
    }    
}
