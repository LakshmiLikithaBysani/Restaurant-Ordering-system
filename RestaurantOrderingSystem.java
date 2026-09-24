import java.util.Scanner;

public class RestaurantOrderingSystem {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String[] items = {
            "Pizza",
            "Burger",
            "Biryani",
            "Fried Rice",
            "Ice Cream"
        };

        double[] prices = {
            250,
            120,
            200,
            150,
            80
        };

        double total = 0;
        int choice;

        do {
            System.out.println("\n=== RESTAURANT ORDERING SYSTEM ===");
            System.out.println("1. Pizza - Rs. 250");
            System.out.println("2. Burger - Rs. 120");
            System.out.println("3. Biryani - Rs. 200");
            System.out.println("4. Fried Rice - Rs. 150");
            System.out.println("5. Ice Cream - Rs. 80");
            System.out.println("6. Generate Bill");
            System.out.println("7. Exit");

            System.out.print("Enter your choice: ");
            choice = sc.nextInt();

            if (choice >= 1 && choice <= 5) {

                System.out.print("Enter quantity: ");
                int quantity = sc.nextInt();

                double amount = prices[choice - 1] * quantity;

                total = total + amount;

                System.out.println(
                    items[choice - 1] +
                    " added. Amount = Rs. " + amount
                );

            } else if (choice == 6) {

                System.out.println("\n=== FINAL BILL ===");
                System.out.println("Total Amount = Rs. " + total);

            } else if (choice == 7) {

                System.out.println("Thank you for visiting!");

            } else {

                System.out.println("Invalid choice.");
            }

        } while (choice != 7);

        sc.close();
    }
}
