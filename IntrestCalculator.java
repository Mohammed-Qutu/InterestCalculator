/*
Mohammed Qutu
This program calculates intrest
21.0.2; Java HotSpot(TM) 64-Bit Server VM 21.0.2+13-LTS-58
*/
import java.util.Scanner;
public class IntrestCalculator 
{

    public static void main(String[] args) 
    {
        Scanner keyBoard = new Scanner(System.in);
       
        int loanAmount,years;//rate;
        double rate;
        double intrest;
        
        System.out.print("Whats the loan amount?: $");
        loanAmount = keyBoard.nextInt();
        
        System.out.print("\nWhats the rate in decimal?: %");
        rate = keyBoard.nextDouble();
        
        System.out.print("\nFor how many years?: ");
        years = keyBoard.nextInt();
        
        intrest = (double) loanAmount * (rate) * years;
        
        System.out.print("\n Loan Amount: " + "$" + loanAmount
                   +     "\n Rate: " + "%" + rate
                   +     "\n Years: " + years
                   +     "\n Intrest calculated: " + "$" + intrest);
        
        
    }
}
