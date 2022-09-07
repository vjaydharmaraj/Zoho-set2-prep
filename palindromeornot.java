import java.util.Scanner;

public class palindromeornot {
    public static void main(String[] args) {
        System.out.println("Enter the number : ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int temp = n;
        int rem ;
        int rev = 0;
        while(n!=0)
        {
            rem = n%10;
            rev = rev*10+rem;
            n=n/10;
        }

        if(temp == rev)
        {
            System.out.println("true");

        }
        else
        {
            System.out.println("false");
        }

    }
}
