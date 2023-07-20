import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int l0 = 0;
        int l1 = 1;
        int l2;
        System.out.println("Podaj liczbę: ");
        int counter = scanner.nextInt();
        System.out.print("Ciąg fibonacciego odpowiadający liczbię: " + counter + " to: " + l0+" "+l1);

        for (int i = 2; i < counter; i++) {

            l2 = l0 + l1;
            System.out.print(" " + l2);

            l0 = l1;
            l1 = l2;
        }
    }
}