public class Pallindrone {
    public static void main(String[] args)
    {
        int sum=0,n=120,check,rem;
        check=n;
        while(n!=0)
        {
            rem=n%10;
            sum=(sum*10)+rem;
            n=n/10;
        }
        if(sum==check)
        {
            System.out.print(check+ " is Pallindrome number");
        }
        else
        {
            System.out.print(check+" is not Pallindrome number");
        }
    }
}
