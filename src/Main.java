import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner ma = new Scanner(System.in);
        System.out.println("Введите количество элементов:");
        int num = ma.nextInt();
        int a[] = new int[num];
        System.out.println("Введите элементы:");
        for (int i = 0; i < num; i++) {
            a[i] = ma.nextInt();
        }
        System.out.println("Элементы массива в обратном порядке:");
        for (int i = a.length - 1; i >= 0; i--) {
            System.out.println(a[i]);
        }
    }
}










