import java.util.Scanner;

/**
 * That class counts unique chars in String
 */
public class UniqueChars {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        String input = sc.next().toLowerCase();
        charCounter(input);
        System.out.println(charCounter(input));
    }
    public static int charCounter(String input) {
        String buffer = "";
        for(int i = 0; i < input.length(); i++) {
            if (!buffer.contains(String.valueOf(input.charAt(i)))) {
                buffer += input.charAt(i);
            }

        }
    return buffer.length();
    }
}
