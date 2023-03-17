import java.util.Scanner;

public class EvenOdd {
    static Scanner sc = new Scanner(System.in);
    public static String evOdd(int n) {
        if ((n % 2) == 0) {
            return "* The given number " + n + " is a Even Number.";
        } else {
            return "* The given number " + n + " is a Odd Number.";
        }
    }

    public static void main(String[] args) {
        System.out.println("\n***********Even Odd Number**************");
        System.out.print("Please enter the number :");

        int num = sc.nextInt();

        String s = evOdd(num);
        System.out.println(s);

        for (;;)  {
            System.out.print("Do you want to Continue: y/n");
            sc = new Scanner(System.in);
            String inpt = sc.nextLine();

            if (inpt.equals("Y") || inpt.equals("y")) {
                System.out.print("Please enter the number :");
                int no = sc.nextInt();
                String str = evOdd(no);
                System.out.println(str);

            } else if (inpt.equals("N") || inpt.equals("n")) {
                System.exit(0);
            }
        }
    }
}
