import java.util.*;

public class sumoddandeven {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the array size ");
        int n = sc.nextInt();
        int arr[] = new int[n];

        for(int i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
        }


        int Even = 0, Odd = 0;


        for (int i = 0; i < arr.length; i++)
        {
            if (arr[i] % 2 == 0)
                Even += arr[i];

            else
                Odd += arr[i];
        }

        System.out.println("Sum of even numbers: " +Even);
        System.out.println("Sum of odd numbers: " +Odd);

    }
}
