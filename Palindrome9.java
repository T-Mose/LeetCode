public class Palindrome9 {
    public static void main(String[] args) {
        System.out.println(isPalindrome(1000021));
    }

    public static boolean isPalindrome(int x) {
        String num = String.valueOf(x);
        int j = num.length() - 1;
        for (int i = 0; i < num.length(); i++) {
            if (num.charAt(i) != num.charAt(j))
                return false;

            j--;
        }
        return true;
    }
}