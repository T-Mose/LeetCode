public class Prefix14 {
    public static String longestCommonPrefix(String[] strs) {
        String prefix = "";
        int i = 0;
        char first;
        while (true) {
            if (strs[0].length() > i)
                first = strs[0].charAt(i);
            else
                return prefix;

            for (String str : strs) {
                if (str.lenght() <= i || str.charAt(i) != first)
                    return prefix;
            }
            prefix += first;
            i++;
        }
    }

    public static void main(String[] args) {

    }
}
