import java.util.Scanner;

/**
 * Created by maciek on 25.09.16.
 */
public class RealCharCounter2016 {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        String inputString = sc.nextLine();
        countMultipleChars(inputString);
    }
    public static void countMultipleChars(String inputString) {
        String buffer = "";
        int count = 0;
        int i = 0;

        while (i < inputString.length()) {
            char start = inputString.charAt(i);
            for (int j = i+1; i < inputString.length(); j++) {
                char end = inputString.charAt(j);
                if(start == end) {
                    count++;
                } else {
                    break;
                }
            }
            i += count+1;
            if (count > 0) {
                String add = start + "";
                int tempcount = count + 1;
                buffer += tempcount+add;
            } else {
                buffer += start;
            }
            count = 0;
        }
        System.out.println(buffer);
    }
}
