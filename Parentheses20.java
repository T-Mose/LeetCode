import java.util.ArrayList;

public class Parentheses20 {
    public static boolean isValid(String s) {
        if (s.length() % 2 != 0)
            return false; // Never legal

        ArrayList<Character> open = new ArrayList<>();

        for (int i = 0; i < s.length(); i++) {
            if (open.size() > 0 && opposite(s.charAt(i)) == open.get(open.size() - 1))
                open.remove(open.size() - 1);
            else
                open.add(s.charAt(i));
        }
        return open.isEmpty();
    }

    public static char opposite(char kar) {
        char opp = '0';
        switch (kar) {
            case ')':
                opp = '(';
                break;
            case '}':
                opp = '{';
                break;
            case ']':
                opp = '[';
                break;
            default:
                break;
        }
        return opp;
    }

    public static void main(String[] args) {
        System.out.println(isValid("(}"));
    }
}
