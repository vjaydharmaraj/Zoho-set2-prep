import java.util.*;

public class bmi {
    public static void main(String[] args) {
        System.out.println("***********BODY MASS CALCULATOR************");
        float bmi;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Height in Metres : ");
        float height = sc.nextFloat();
        System.out.println("Enter Weight in kg : ");

        int weight = sc.nextInt();

        bmi = weight / (height * height);

        System.out.println(bmi);
    }
}
