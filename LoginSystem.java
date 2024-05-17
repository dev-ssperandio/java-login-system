import java.util.Scanner;

public class LoginSystem {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String username = "S Sperandio";
        String password = "123456";

        // Login system that ask the user for their username and password ...
        System.out.print("Login: ");
        String inputUsername = scanner.nextLine();
        System.out.print("Password: ");
        String inputPassword = scanner.nextLine();

        // ... and check if the information is correct
        if (inputUsername.equals(username) && inputPassword.equals(password))
            System.out.println("Login allowed successfully!");
        else
            throw new SecurityException("Login denied! Please check your username and password.");

        scanner.close();
    }
}