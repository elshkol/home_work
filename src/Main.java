import java.util.Scanner;

public class Main {
    public static void main(String args[]) {
        System.out.println("Введите любое целое число: ");
        Scanner scan = new Scanner(System.in);
        int number = scan.nextInt();
        if (number >= 0) ;
        {
            System.out.println(Integer.toBinaryString(number));
        }
    }
}
