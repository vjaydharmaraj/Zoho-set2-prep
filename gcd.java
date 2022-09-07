import java.util.Scanner;

public class gcd {
        public static void main(String[] args)
        {
            Scanner sc = new Scanner(System.in);
            int n1 = sc.nextInt();
            int n2 = sc.nextInt();
            int temp;
            int gcd = 0;

            while(n2 != 0)
            {
                temp = n2;
                n2 = n1 % n2;
                n1 = temp;
            }
            gcd = n1;
            System.out.println("\n GCD =  " +gcd);
        }
}
