import java.util.Scanner;

public class SignIn {
    private static String password;
    private static String login;
    public static void signIn() {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            try {
                System.out.println("Введите логин:");
                 login = scanner.nextLine();

                if (login.length() > 19 || login.contains(" ")) {
                    throw new WrongLoginException();
                }
            } catch (WrongLoginException e) {
                System.out.println("Требуется переписать логин");
                continue;
            }
            break;
        }
        while (true) {
            try {
                System.out.println("Введите пароль:");
                password = scanner.nextLine();
                if (password.length() > 19 || password.contains(" ") || (!password.contains("1")) && !password.contains("2") && !password.contains("3") && !password.contains("4") && !password.contains("5") && !password.contains("6") && !password.contains("7") && !password.contains("8") && !password.contains("9")) {
                    throw new WrongPasswordException();
                }
            } catch (WrongPasswordException e) {
                System.out.println("Требуется переписать пароль");
                continue;
            }
            break;
        }

        while (true) {
            System.out.println("Подтвердите пароль:");
            String confirmPassword = scanner.nextLine();
            try {
                if (!confirmPassword.equals(password)) {
                    throw new WrongPasswordException("Неверное подтверждение пароля");
                }
            } catch (WrongPasswordException e) {
                System.out.println("Требуется переписать подтверждение пароля");
                continue;
            }
            break;
        }
    }
    public static void getLoginPassword(){
        System.out.println("Логин "+login);
        System.out.println("Пароль "+ password);
    }
    public static String getPassword(){
        return password;

    }

    public static String getLogin() {
        return login;
    }
}
