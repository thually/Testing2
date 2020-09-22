import java.util.Scanner;

public class Primos {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int N = input.nextInt();
        for (int i = 0; i <= N; i++) {
            int P = input.nextInt();
            if (esPrimo(P)){
                System.out.println("me arrimo");
            } else {
                System.out.println("no me arrimo");
            }
        }
    }
    public static boolean esPrimo(int x){
        for (int i = 2; i < x; i++) {
            if (x % i == 0){
                return false;
            }
        }
        return true;
    }
}
