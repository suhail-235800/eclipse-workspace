package kba;

import java.util.Scanner;

public class Division
{
    public String divideTwoNumbers(int number1, int number2)
    {
        double value =0 ;
        String res = "";
        
        try
        {
            value= number1/number2;
            res = ("The answer is "+ value);
        }
        catch(ArithmeticException e)
        {
            res = "Division by zero is not possible";
        }
        finally
        {
            return(res+". Thanks for using the application.");    
        }
    }
    
    public static void main(String args[])
    {
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter the numbers");
        int num1 =  scn.nextInt();
        int num2 =  scn.nextInt();
        Division div = new Division();
        System.out.print(div.divideTwoNumbers(num1,num2));
    }
}
