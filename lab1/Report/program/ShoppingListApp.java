import java.util.ArrayList;
import java.util.Scanner;

public class ShoppingListApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<String> shoppingList = new ArrayList<>();
        boolean running = true;

        while (running) {
            System.out.println("\n--- SHOPPING LIST MENU ---");
            System.out.println("1. Add Item");
            System.out.println("2. Remove Item by Name");
            System.out.println("3. View Shopping List");
            System.out.println("4. Exit");
            System.out.print("Choose an option (1-4): ");

            int choice = scanner.nextInt();
            scanner.nextLine(); // Clear scanner buffer

            switch (choice) {
                case 1:
                    System.out.print("Enter item name to add: ");
                    String itemToAdd = scanner.nextLine().trim();
                    if (!itemToAdd.isEmpty()) {
                        shoppingList.add(itemToAdd);
                        System.out.println("\"" + itemToAdd + "\" added to the list.");
                    } else {
                        System.out.println("Item name cannot be empty.");
                    }
                    break;

                case 2:
                    System.out.print("Enter item name to remove: ");
                    String itemToRemove = scanner.nextLine().trim();
                    // Case-insensitive removal
                    boolean removed = shoppingList.removeIf(item -> item.equalsIgnoreCase(itemToRemove));
                    if (removed) {
                        System.out.println("\"" + itemToRemove + "\" removed successfully.");
                    } else {
                        System.out.println("Item not found in the list.");
                    }
                    break;

                case 3:
                    System.out.println("\n--- Current Shopping List ---");
                    if (shoppingList.isEmpty()) {
                        System.out.println("The shopping list is currently empty.");
                    } else {
                        for (int i = 0; i < shoppingList.size(); i++) {
                            System.out.println((i + 1) + ". " + shoppingList.get(i));
                        }
                    }
                    break;

                case 4:
                    System.out.println("Exiting Shopping List program. Goodbye!");
                    running = false;
                    break;

                default:
                    System.out.println("Invalid option! Please choose between 1 and 4.");
            }
        }

        scanner.close();
    }
}
