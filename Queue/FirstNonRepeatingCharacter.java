import java.util.*;

public class FirstNonRepeatingCharacter {
    public static void printNonRepat(String str) {
        int fre[] = new int[26];
        Queue<Character> q1 = new LinkedList<>();
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            q1.add(ch);
            fre[ch - 'a']++;

            while (!q1.isEmpty() && fre[q1.peek() - 'a'] > 1) {
                q1.remove();
            }

            if (q1.isEmpty()) {
                System.out.print("-1" + " ");
            } else {
                System.out.print(q1.peek() + " ");
            }
        }
        System.out.println();
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter String : ");
        String str = sc.nextLine();
        printNonRepat(str);
    }
}
