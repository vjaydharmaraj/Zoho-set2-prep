import java.util.*;

public class sumdiagonal {
    public static void main(String[] args) {
        int[][] a ={{1,2},{3,4}};
        int sum =0;
        for(int i=0;i<2;i++) {
            for (int j = 0; j < 2; j++)
            {
                if (i==j)
                    sum += a[i][j];
            }

        }
        System.out.println(sum);
    }
}
