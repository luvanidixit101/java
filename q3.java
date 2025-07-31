/*write a program  that accept a String and a charecter as input. 
The program shold print the frequency in the string and list all the positin (indices) 
where the charecter appears*/
   


   import java.util.Scanner;
import java.util.ArrayList;

public class q3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Accept a string input
        System.out.print("Enter a string: ");
        String input = scanner.nextLine();

        // Accept a character input
        System.out.print("Enter a character: ");
        char ch = scanner.next().charAt(0);

        int frequency = 0;
        ArrayList<Integer> positions = new ArrayList<>();

        // Find frequency and positions
        for (int i = 0; i < input.length(); i++) {
            if (input.charAt(i) == ch) {
                frequency++;
                positions.add(i);
            }
        }

        System.out.println("Frequency of '" + ch + "' in the string: " + frequency);
        System.out.print("Positions: ");
        if (positions.isEmpty()) {
            System.out.println("Character not found.");
        } else {
            for (int pos : positions) {
                System.out.print(pos + " ");
            }
            System.out.println();
        }
    }
}
