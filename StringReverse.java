import java.util.Scanner;

/**
 * Created by maciek on 25.09.16.
 */
public class StringReverse {
    static Scanner sc = new Scanner(System.in);
    static StringReverse sr1 = new StringReverse();

    public static void main(String[] args) {
        String input;
        System.out.println("Napisz co Ci obrócić, jeśli chcesz wyjść wpisz EXIT");
        input = getUserInput();

        System.out.println(sr1.reverser(input));
    }
    public String reverser(String input) {
        int start = 0;
        int end = input.length() - 1;
        char[] lettersList = input.toCharArray();
        char temp;

        while (end > start) {
            temp = lettersList[start];
            lettersList[start] = lettersList[end];
            lettersList[end] = temp;
            start++;
            end--;
        }
        return new String(lettersList);
    }
    public static String getUserInput() {
        return sc.nextLine().trim();
    }
}

