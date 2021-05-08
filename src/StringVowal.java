import java.util.Map;
import java.util.Scanner;
import java.util.concurrent.ConcurrentHashMap;

public class StringVowal {
    static final Map<Character, Boolean> smallVowel = new ConcurrentHashMap();
    static final Map<Character, Boolean> capitalVowel = new ConcurrentHashMap<>();

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        String name = s.nextLine();                 // Reading input from STDIN
        int number = Integer.parseInt(name);
        String[] arrs = new String[number];
        for (int i = 0; i < number; i++) {
            arrs[i] = s.nextLine();
        }
        s.close();

        for (int i = 0; i < number; i++) {
            resetMap();
            for (int j = 0; j < arrs[i].length(); j++) {
                char ch = arrs[i].charAt(j);
                if ((ch >= 'a' && ch <= 'z') && checkSmallVowel(ch)) {
                    smallVowel.put(ch, true);
                }
                if ((ch >= 'A' && ch <= 'Z') && checkBigVowel(ch)) {
                    capitalVowel.put(ch, true);
                }
            }
            if (!smallvowel.containsValue(false) || !capitalvowel.containsValue(false)) {
                System.out.println("lovely string");
            } else {
                System.out.println("ugly string");
            }
        }
    }

    public static boolean checkSmallVowel(char ch) {
        return ch == 'a' ||
                ch == 'e' ||
                ch == 'i' ||
                ch == 'o' ||
                ch == 'u';
    }

    public static boolean checkBigVowel(char ch) {
        return ch == 'A' ||
                ch == 'E' ||
                ch == 'I' ||
                ch == 'O' ||
                ch == 'U';
    }

    public static void resetMap() {
        smallvowel.put('a', false);
        smallvowel.put('e', false);
        smallvowel.put('i', false);
        smallvowel.put('o', false);
        smallvowel.put('u', false);

        capitalvowel.put('A', false);
        capitalvowel.put('E', false);
        capitalvowel.put('I', false);
        capitalvowel.put('O', false);
        capitalvowel.put('U', false);
    }
}