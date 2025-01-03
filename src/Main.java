import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ArrayList<Expense> expenses = new ArrayList<>();
        try (Scanner scanner = new Scanner(System.in)) {
            
            while (true) {
                System.out.println("1. Add Expense");
                System.out.println("2. View Expenses");
                System.out.println("3. Exit");
                System.out.println("Choose an option: ");

                int choice = scanner.nextInt();
                scanner.nextLine(); // Consume newline 

                switch (choice) {
                    case 1 -> {
                        System.out.println("Enter description: ");
                        String description = scanner.nextLine();

                        System.out.println("Enter amount: ");
                        double amount = scanner.nextDouble();
                        scanner.nextLine(); // Consume newline

                        System.out.println("Enter category: ");
                        String category = scanner.nextLine();

                        Expense expense = new Expense(description, amount, category);
                        expenses.add(expense);
                        System.out.println("Expense added successfully!");
                    }
                    case 2 -> {
                        System.out.println("Expenses:");
                        for (Expense expense : expenses) {
                            System.out.println(expense);
                        }
                    }
                    case 3 -> {
                        System.out.println("Exiting... Goodbye!");
                        return;
                    }
                    default -> System.out.println("Invalid choice. Please try again.");
                }
            }
        }
    }
}