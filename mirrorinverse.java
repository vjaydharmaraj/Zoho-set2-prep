import java.util.*;

public class mirrorinverse {
        public static void main(String[] args)
        {
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter size of the array : ");
            int n = sc.nextInt();
            int[] arr = new int[n];

            for (int i=0;i<n;i++)
            {
                arr[i] = sc.nextInt();
            }

            int count = 0;

            for ( int i = 0 ; i < arr.length ; i++ )
            {
                if ( arr[arr[i]] == 1 )
                {
                    count ++;
                }
            }
            if (count != 0)
            {
                System.out.println ( "mirror inverse") ;
            }
            else
            {
                System.out.println ("Not mirrored inverse");
            }

    }


}
