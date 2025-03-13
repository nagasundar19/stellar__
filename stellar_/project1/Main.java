import java.util.Scanner;

public class Main {
    static class Delivery {
        int productId;
        String productName;
        String productCategory;
        String customerName;
        String customerAddress;
        String customerMobile;

        Delivery(int productId, String productName, String productCategory, String customerName, String customerAddress, String customerMobile) {
            this.productId = productId;
            this.productName = productName;
            this.productCategory = productCategory;
            this.customerName = customerName;
            this.customerAddress = customerAddress;
            this.customerMobile = customerMobile;
        }

        @Override
        public String toString() {
            return "Product ID: " + productId + ", Product Name: " + productName + ", Category: " + productCategory +
                    ", Customer: " + customerName + ", Address: " + customerAddress + ", Mobile: " + customerMobile;
        }
    }

    static Delivery deliveries[] = new Delivery[100]; 
    static int deliveryCount = 0;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int choice;
        do {
            System.out.println("\n--- Product Delivery Management System ---");
            System.out.println("1. Add Product");
            System.out.println("2. View Product");
            System.out.println("3. Delete Product");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");
            choice = sc.nextInt();
            sc.nextLine(); 

            switch (choice) {
                case 1:
                    addDelivery(sc);
                    break;
                case 2:
                    viewDeliveries();
                    break;
                case 3:
                    deleteDelivery(sc);
                    break;
                case 4:
                    System.out.println("Exiting...");
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        } while (choice != 4);

        sc.close();
    }

    private static void addDelivery(Scanner scanner) {
        System.out.print("Enter Product ID: ");
        int productId = scanner.nextInt();
        scanner.nextLine();
        System.out.print("Enter Product Name: ");
        String productName = scanner.nextLine();
        System.out.print("Enter Product Category: ");
        String productCategory = scanner.nextLine();
        System.out.print("Enter Customer Name: ");
        String customerName = scanner.nextLine();
        System.out.print("Enter Customer Address: ");
        String customerAddress = scanner.nextLine();
        System.out.print("Enter Customer Mobile Number: ");
        String customerMobile = scanner.nextLine();

        deliveries[deliveryCount++] = new Delivery(productId, productName, productCategory, customerName, customerAddress, customerMobile);
        System.out.println("Product added successfully.");
    }

    private static void viewDeliveries() {
        if (deliveryCount == 0) {
            System.out.println("No Product found.");
        } else {
            System.out.println("\n--- List of Product ---");
            for (int i = 0; i < deliveryCount; i++) {
                System.out.println(deliveries[i]);
            }
        }
    }

    private static void deleteDelivery(Scanner scanner) {
        if (deliveryCount == 0) {
            System.out.println("No deliveries to delete.");
            return;
        }

        System.out.print("Enter Product ID to delete: ");
        int productId = scanner.nextInt();
        boolean found = false;

        for (int i = 0; i < deliveryCount; i++) {
            if (deliveries[i].productId == productId) {
                for (int j = i; j < deliveryCount - 1; j++) {
                    deliveries[j] = deliveries[j + 1];
                }
                deliveries[--deliveryCount] = null;
                found = true;
                System.out.println("Delivery deleted successfully.");
                break;
            }
        }
        if (!found) {
            System.out.println("Product with ID " + productId + " not found.");
        }
    }
}
