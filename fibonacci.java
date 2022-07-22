// Fibonacci Series 0 1 add 1 add 2 = 0 1 1 2 3
import java.util.Scanner;
public class fibonacci {
       public static void main(String[] arg)
       {
        int range,a=0,b=1,c;
        Scanner s = new Scanner(System.in);

        System.out.print("Enter Range of Fabonacci Series\n -:");
        range = s.nextInt();

        for(int i=1;i<=range;i++)
        {
            System.out.print(a+" ");
            c = a+b;
            a=b;
            b=c;
        }
       }    
}
