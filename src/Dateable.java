import java.util.Scanner;

public class Dateable {

    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);				// line 1
        System.out.println("Enter your age:");		// line 2
        int age=-1;
        while (age < 0) {
            try {
                age = Integer.parseInt(scanner.nextLine());
            }
            catch (NumberFormatException e) {
                System.out.println("Please enter a valid number!");
            }
        }
        int dateable=(age/2)+7;// line 3
        System.out.println(age+"-year olds should date somebody who is at least "+dateable+" years old.");
    }
}

