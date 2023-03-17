import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Scanner;

public class ProductInventory {

    public static void main2(String[] args) {
        String[] tert = new String[5];
        tert[0] = "w";
        tert[1] = "w";
        tert[2] = "w";
        tert[3] = "w";

        for (int i = 0; i < tert.length; i++) {
            if (tert[i] == null) {
                System.out.println(i);
            }
        }

    }

    public static void main(String[] args) throws IOException {
        String file = "/home/khushbu/Documents/HeroVired/Playground/products.txt";
        Scanner scanner = new Scanner(new File(file));
        String[] prds = new String[15];
        String[] qty = new String[15];
        String[] prddtls = new String[15];
        String[] prices = new String[15];
        int index = 0;
        while (scanner.hasNextLine()) {
            String line = scanner.nextLine();
            String[] tokens = line.split(",");
            // System.out.println(tokens[0] + "\t" + tokens[1]+ "\t" + tokens[2]);
            prds[index] = tokens[0].trim();
            qty[index] = tokens[1].trim();
            prddtls[index] = tokens[2].trim();
            prices[index] = tokens[3].trim();
            index++;
        }
        scanner.close();
        Scanner sc = null;
        while (true) {
            System.out.println("1. View list of all Products");
            System.out.println("2. View quantities available for a specific Product");
            System.out.println("3. Product Specification, Cost and count available");
            System.out.println("4. Update Product Details");
            System.out.println("5. Add/Delete Product Quantities");
            sc = new Scanner(System.in);
            System.out.print("Enter a number for action: ");
            int a = sc.nextInt();
            // sc.close();
            switch (a) {
                case 1: {
                    for (int i = 0; i < prds.length; i++) {
                        System.out.println(i + " - " + prds[i]);

                    }
                    break;
                }

                case 2: {
                    sc = new Scanner(System.in);
                    System.out.print("Enter a product name for action: ");
                    String prd = sc.nextLine();
                    // sc.close();
                    for (int i = 0; i < prds.length; i++) {
                        if (prd.equalsIgnoreCase(prds[i])) {
                            System.out.println("there are "+ qty[i] + " " + prd + " items");
                            break;
                        }
                    }
                    break;
                }

                case 3: {
                    for (int i = 0; i < prds.length; i++) {
                        if (prds[i] != null)
                            System.out.println(prds[i] + " | " + qty[i] + " | " + prices[i] + " | " + prddtls[i]);

                        // if (i == prds.length -1) {
                        // break;
                        // }
                    }
                    break;
                }

                case 4: {
                    sc = new Scanner(System.in);
                    System.out.print("Enter a product name for updating description: ");
                    String prd = sc.nextLine();
                    // sc.close();
                    for (int i = 0; i < prds.length; i++) {
                        if (prd.equalsIgnoreCase(prds[i])) {
                            sc = new Scanner(System.in);
                            System.out.print("Enter description for " + prd + ": ");
                            String desc = sc.nextLine();
                            prddtls[i] = desc;
                            
                        }
                    }
                    break;
                }

                case 5: {
                    sc = new Scanner(System.in);
                    System.out.print("Enter a product name: ");
                    String prd = sc.nextLine();
                    System.out.print("Enter a product quantity: ");
                    String qnty = sc.nextLine();
                    System.out.print("Enter a product price: ");
                    String pprice = sc.nextLine();
                    System.out.print("Enter a product Description: ");
                    String prdDesc = sc.nextLine();
                    for (int i = 0; i < prds.length; i++) {
                        if (prds[i] == null) {
                            prds[i] = prd;
                            qty[i] = qnty;
                            prices[i] = pprice;
                            prddtls[i] = prdDesc;
                            break;
                        }
                    }
                    break;
                }
                case 6: {
                    System.out.println("Exiting now!");
                    System.exit(0);
                }

                default: {

                    break;
                }
            }

        }
    }
}
