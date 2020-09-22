import java.util.Arrays;
import java.util.Scanner;

public class HelloWord {
    public static void main(String[] args) {
        System.out.println("Hello, World !!!");

        Scanner input = new Scanner(System.in);
        int N = input.nextInt();
        int[] array1 = new int[N];
        for (int i = 0; i < N; i++) {
            array1[i] = input.nextInt();
        }
        System.out.println(Arrays.toString(array1));
    }
}
