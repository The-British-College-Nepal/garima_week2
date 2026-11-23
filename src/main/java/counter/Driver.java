package counter;

import java.util.Scanner;

/**&#xA; * Driver class demonstrating the use of the Counter interface and WordProcessor implementation.&#xA; */
public class Driver {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("==================================================");
        System.out.println("🔤 SSD Week 2: Interfaces & WordProcessor Demo");
        System.out.println("==================================================");

        // --- Demonstration 1: Polymorphism using the Counter Interface Type ---
        // Note: It is completely valid to declare wp as type Counter!
        // This programs to the interface rather than the concrete implementation.
        Counter wp = new WordProcessor();

        System.out.print("Please enter a sentence: ");
        String sentence = scanner.nextLine();

        System.out.println("\n--- Analysis Results (Polymorphic Call via Counter) ---");
        System.out.println("Length (with spaces) : " + wp.getLength(sentence));
        System.out.println("Letters (alpha only) : " + wp.countLetters(sentence));
        System.out.println("Words (split spaces) : " + wp.countWords(sentence));

        // --- Demonstration 2: Using WordProcessor directly for fallback text ---
        // We declare wp2 as WordProcessor so we can call setText(), which is
        // specific to WordProcessor and not declared in Counter.
        WordProcessor wp2 = new WordProcessor();
        wp2.setText("The British College Kathmandu Nepal");

        System.out.println("\n--- Fallback State Demo (when null argument is passed) ---");
        System.out.println("Configured Fallback Text: \"" + wp2.getText() + "\"");
        System.out.println("Letters for null input : " + wp2.countLetters(null));
        System.out.println("Length for null input  : " + wp2.getLength(null));
        System.out.println("Words for null input   : " + wp2.countWords(null));
        System.out.println("==================================================");

        scanner.close();
    }
}