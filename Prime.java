import java.util.Scanner;
public class Prime {
    public static void main(String[] args)
    {
        int n1,n2,i,j;
        Scanner s = new Scanner(System.in);
        
        System.out.print("Enter First number-:");
        n1=s.nextInt();
        
        System.out.print("Enter Second Number-:");
        n2=s.nextInt();
        
        for( i=n1;i<=n2;i++)
        {
            for( j=2;j<=i;j++)
            {
                if(i%j==0)
                break;
            }
            if(i==j)
            
                System.out.print(j+" ");
            
        }
    }
}
    
