import java.util.Scanner;

public class Main {
    public static void main(String args[]) {
        System.out.println("Введите любое целое число (большое): ");
        Scanner scan = new Scanner(System.in);
        int number = scan.nextInt();
        int Cifra = 0;
        int sum = 0;
        String numberString = Integer.toString(number);
        for (int x = 0; x < numberString.length(); x++) {
            Cifra = Character.getNumericValue(numberString.charAt(x));
            if (Cifra % 2 == 1) {
                sum = sum + Cifra;
            }
        }
        System.out.println(sum);
    }
}
