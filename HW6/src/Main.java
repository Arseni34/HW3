import java.util.Scanner;

// Press ⇧ twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        CreditCard creditCard1 = new CreditCard(11111111, 20);
        CreditCard creditCard2 = new CreditCard(22222222, 40);
        CreditCard creditCard3 = new CreditCard(33333333, 3);
        while (true) {
            System.out.println("1 - Просмотреть информацию о карте ");
            System.out.println("2 - Положить деньги на карту ");
            System.out.println("3 - Снять деньги с карты ");
            System.out.println("4 - Выход ");

            Scanner scanner = new Scanner(System.in);
            int a = scanner.nextInt();
            if (a == 1) {
                creditCard1.viewInformation();
                creditCard2.viewInformation();
                creditCard3.viewInformation();
            }
            if (a == 2) {
                System.out.println("1 - Карта 11111111 ");
                System.out.println("2 - Карта 22222222 ");
                System.out.println("3 - Карта 33333333 ");
                int b = scanner.nextInt();
                System.out.println("Введите сумму ");
                int x = scanner.nextInt();
                if (b == 1) {
                    creditCard1.addMoney(x);
                }
                if (b == 2) {
                    creditCard2.addMoney(x);
                }
                if (b == 3) {
                    creditCard3.addMoney(x);
                }
            }
                if (a == 3) {
                    System.out.println("1 - Карта 11111111 ");
                    System.out.println("2 - Карта 22222222 ");
                    System.out.println("3 - Карта 33333333 ");
                    int c = scanner.nextInt();
                    System.out.println("Введите сумму ");
                    int y = scanner.nextInt();
                    if (c == 1) {
                        creditCard1.takeMoney(y);
                    }
                    if (c == 2) {
                        creditCard2.takeMoney(y);
                    }
                    if (c == 3) {
                        creditCard3.takeMoney(y);
                    }

                }
else return;


        }
    }
}