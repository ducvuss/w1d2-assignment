import java.util.ArrayList;
import java.util.Scanner;

class Assignment1 {

    static int total = 0;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        ArrayList<Integer> intergers = new ArrayList<Integer>();

        Integer input = 0;
        while (input != null) {
            System.out.print("Enter a number to continue, enter non-numeric characters to stop: ");
            try {
                input = sc.nextInt();
            }
            catch (Exception ex) {
                System.out.println("Calculating your total...");
                break;
            }
            finally {
                intergers.add(input);
            }
        }
        

        intergers.forEach(number -> {
            total += number;
        });

        System.out.println("Total value is : " + total);
    }
}