import java.util.Scanner;

public class Prime_number {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        
        System.out.print("Enter an integer: ");
        int number = scanner.nextInt();

        if (number <= 1) {
            System.out.println(number + " is not a prime number.");
        } else {
            boolean isPrime = true;
            int i = 2;

            
            while (i <= number / 2) {
                if (number % i == 0) {
                    isPrime = false;
                    System.out.println(number + " is divisible by " + i);
                    break;
                }
                i++;
            }

            
            if (isPrime) {
                System.out.println(number + " is a prime number.");
            } else {
                System.out.println(number + " is not a prime number.");
            }
        }

        scanner.close();
    }
}
