import java.util.Scanner;

public class perpustakaan {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean exit = false;

        // Data dummy untuk login
        String studentNIM = "202310370311406";
        String adminUsername = "useradmin";
        String adminPassword = "JANGGAR";

        while (!exit) {
            System.out.println("==== PERPUSTAKAAN ====");
            System.out.println("1. Login as Student");
            System.out.println("2. Login as Admin");
            System.out.println("3. Exit");
            System.out.print("Choose option (1-3): ");
            int option = scanner.nextInt();

            switch (option) {
                case 1:
                    // Login as student
                    System.out.print("Enter your NIM: ");
                    String nim = scanner.next();
                    if (nim.equals(studentNIM)) {
                        System.out.println("Successful Login as Student");
                    } else {
                        System.out.println("User Not Found");
                    }
                    break;
                case 2:
                    // Login as admin
                    System.out.print("Enter your username (admin): ");
                    String username = scanner.next();
                    System.out.print("Enter your password (admin): ");
                    String password = scanner.next();
                    if (username.equals(adminUsername) && password.equals(adminPassword)) {
                        System.out.println("Successful Login as Admin");
                    } else {
                        System.out.println("Admin User Not Found!");
                    }
                    break;
                case 3:
                    // Exit
                    System.out.println("Suwon Slur");
                    exit = true;
                    break;
                default:
                    // Invalid option
                    System.out.println("Invalid option. Please choose between 1-3.");
                    break;
            }
        }
    }
}
