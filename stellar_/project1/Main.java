	import java.util.*;
	public class Main {
	    static class Product {
	        int id;
	        String name;
	        String category;

	        Product(int id, String name, String category) {
	            this.id = id;
	            this.name = name;
	            this.category = category;
	        }

	        @Override
	        public String toString() {
	            return "ID: " + id + ", Name: " + name + ", Category: " + category;
	        }
	    }

	    static Product p[] = new Product[100];
	    static int productCount = 0;

	    public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);
	        int choice;
	        do {
	            System.out.println("\n--- Product Delivery Management System ---");
	            System.out.println("1. Add Product");
	            System.out.println("2. View Products");
	            System.out.println("3. Delete Product");
	            System.out.println("4. Exit");
	            System.out.print("Enter your choice: ");
	            choice = sc.nextInt();
	            sc.nextLine();

	            switch (choice) {
	                case 1:
	                    addProduct(sc);
	                    break;
	                case 2:
	                    viewProducts();
	                    break;
	                case 3:
	                    deleteProduct(sc);
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

	    private static void addProduct(Scanner scanner) {
	        System.out.print("Enter Product ID: ");
	        int id = scanner.nextInt();
	        scanner.nextLine();
	        System.out.print("Enter Product Name: ");
	        String name = scanner.nextLine();
	        System.out.print("Enter Product Category: ");
	        String category = scanner.nextLine();
	        p[productCount++] = new Product(id, name, category);
	        System.out.println("Product added successfully.");
	    }

	    private static void viewProducts() {
	        if (productCount == 0) {
	            System.out.println("No products found.");
	        } else {
	            System.out.println("\n--- List of Products ---");
	            for (int i = 0; i < productCount; i++) {
	                System.out.println(p[i]);
	            }
	        }
	    }

	    private static void deleteProduct(Scanner scanner) {
	        if (productCount == 0) {
	            System.out.println("No products to delete.");
	            return;
	        }
	        System.out.print("Enter Product ID to delete: ");
	        int id = scanner.nextInt();
	        boolean found = false;
	        for (int i = 0; i < productCount; i++) {
	            if (p[i].id == id) {
	                for (int j = i; j < productCount - 1; j++) {
	                    p[j] = p[j + 1];
	                }
	                p[--productCount] = null;
	                found = true;
	                System.out.println("Product deleted successfully.");
	                break;
	            }
	        }
	        if (!found) {
	            System.out.println("Product with ID " + id + " not found.");
	        }
	    }
	}
