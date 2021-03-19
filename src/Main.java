import java.util.Scanner;
public class Main {
    public static void main(String args[]) {
        System.out.println("Введите количество элементов массива: ");
        Scanner scan = new Scanner(System.in);
        int numberMas = scan.nextInt();
        if (numberMas > 0) {
            String[] mas = new String[numberMas];
            // int count = 0;
            for (int i = 1; i <= numberMas; i++) {
                System.out.println("Введите элемент массива № " + i);
                mas[i - 1] = scan.next();
            }
            char bykva;
            for (int i = 0; i < numberMas; i++) {
                for (int j = 0; j <= mas[i].length() - 1; j++){
                    bykva = mas[i].charAt(j);
                    if (Character.isLowerCase(bykva)) {
                        System.out.print(Character.toUpperCase(bykva));
                    }
                    else { // иначе
                        System.out.print(Character.toLowerCase(bykva));
                    }
                }
            }
        }
    }
}















