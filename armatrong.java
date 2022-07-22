import java.util.Scanner;
public class armatrong {
     public static void main(String[] args)
     {
        int rem,sum=0,check,n;
         Scanner s = new Scanner(System.in);

        System.out.print("Enter Any Number \n-:");
        n = s.nextInt();
        
        check=n;
        while(n!=0)

       { rem = n %10;
        sum = sum+(rem * rem * rem);
        n=n/10;
        }    
        if(sum==check)
        {
            System.out.print("Its Armstrong Number\n -:"+check);
        }
        else
        {
            System.out.print(" Its not Armstrong number\n -:"+check);
        }
     }
}
