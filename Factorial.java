//Calculate the Factorial of a number? Khushbu

public class Factorial
{
    public static void main(String[] args)
    {
        int number=5;     //number to calculate factorial
        int fact=1;
            
        for (int j = 1; j <= number; j++) 
        {
            fact=fact*j;
        }

        System.out.println(fact);

    }
}