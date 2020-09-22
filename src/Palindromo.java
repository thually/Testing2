import java.util.Scanner;

public class Palindromo {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String n = input.next();
        boolean palindromo = true;
        for (int i = 0; i < n.length()/2; i++){
            if (n.charAt(i) != n.charAt(n.length()-1-i)){
                palindromo = false;
                break;
            }
        }

        if ( palindromo){
            System.out.println("Pali");
        } else {
            System.out.println("No pali");
        }
    }
}
