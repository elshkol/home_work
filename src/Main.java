import java.util.Scanner;
public class Main {
    public static void main(String args[]) {
        System.out.println("Введите количество элементов массива: ");
        Scanner scan = new Scanner(System.in);
        int numberMas = scan.nextInt();
        if (numberMas > 0) {
            int[] mas = new int[numberMas];
            int count = 0;
            for (int i = 1; i <= numberMas; i++){
                System.out.println("Введите элемент массива № " + i);
                mas[i - 1] = scan.nextInt();
            }
            String result = "";
            for (int i = 0; i < numberMas; i++) {
                result = result + Integer.toString(mas[i]);
            }
            System.out.println("Результат (строка):" + result);
            System.out.println("Результат (число):" + Integer.valueOf(result));
        }
    }
}