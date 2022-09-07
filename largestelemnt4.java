import java.util.Arrays;
import java.util.Scanner;

public class largestelemnt4 {
    public static void main(String[] args) {
        System.out.println("Enter the array size : ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        int[] arrr = new int[n];
        for(int i=0;i<n;i++)
        {
            arr[i]= sc.nextInt();
        }

        Arrays.sort(arr);
        int j=0;
        for(int i= arr.length-1;i>=0;i--)
        {
            arrr[j++] = arr[i];
        }

        System.out.println(arrr[3]);
    }
}
