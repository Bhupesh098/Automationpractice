import java.util.Scanner;
public class Bhupesh_reverse_number {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = input.nextInt();

        int reverse = 0;
        while (num != 0) {
            reverse = reverse * 10 + num % 10;
            num /= 10;
        }

        System.out.println("The reverse of the number is: " + reverse);
    }
}



