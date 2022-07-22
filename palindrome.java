// Polindrome number is reversible like 121
import java.util.Scanner;
public class palindrome {
    public static void main(String[] args)
    {
        int rem,sum=0,check,n;
        Scanner s = new Scanner(System.in);

        System.out.print("Enter Any Number\n -:");
        n = s.nextInt();

        check = n;
        while(n!=0)
        {
            rem = n%10;
            sum = (sum*10)+rem;
            n = n/10;
        }
        if(sum==check)
        {
            System.out.print(check+"\nIt's Palindrome Number");
        }
        else 
        {
            System.out.print(check+"\nIt's not Palindrome Number");
        }
    }
}
