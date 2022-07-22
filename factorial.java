import java.util.Scanner;
public class factorial {
    public static void main(String[] args)
    {
        int n;
        Scanner s = new Scanner(System.in);

        System.out.print("Enter value of Factorial\n -:");
        n = s.nextInt();
        factorial obj = new factorial();
       int result = obj.fact(n);
       System.out.print("Factorial of given number\n-:"+result) ;
    }
    int fact(int n)
    {
        if(n==1)
        {
            return 1;
        }
        else
        {
         return n*fact(n-1);
        }
    }
}

