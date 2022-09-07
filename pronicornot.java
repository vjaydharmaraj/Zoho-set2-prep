import java.util.*;

public class pronicornot {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a Number: ");
        int num = sc.nextInt();
        int flag=0;

        for(int i=0; i<num; i++)
        {
            if(i*(i+1) == num)
            {
                flag = 1;
                break;
            }
        }

        if(flag == 1)
            System.out.println(num+" is a Pronic Number.");
        else
            System.out.println(num+" is not a Pronic Number.");

    }

}
