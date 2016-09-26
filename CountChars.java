import java.util.Scanner;

/**
 * Created by maciek on 25.09.16.
 */
public class CountChars {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        countCharsInString(input);

    }
    public static void countCharsInString(String input) {
        String buffer ="";
        for (int i = 0; i < input.length(); i++) {
            if (!buffer.contains(String.valueOf(input.charAt(i)))) {
                buffer += input.charAt(i);
            }
        }
        System.out.print(buffer.length());
    }
}
