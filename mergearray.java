import java.util.*;

public class mergearray {
    public static void main(String[] args) {
        int[] arr1 = {1, 2, 3, 4, 5, 6};
        int[] arr2 = {7, 8, 9, 0};

        int n1 = arr1.length;
        int n2 = arr2.length;
        int n3 = n1 +n2;
        int[] arr3 = new int[n3];
        for (int i=0;i<n1;i++)
        {
            arr3[i]=arr1[i];
        }
        for (int i=0;i<n2;i++)
        {
            arr3[n1+i] = arr2[i];
        }

        for (int i=0;i<n3;i++)
        {
            System.out.print(arr3[i]);
        }
    }
}
