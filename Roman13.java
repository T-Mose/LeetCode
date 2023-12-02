public class Roman13 {
    public static int romanToInt(String s) {
        int sum = 0;
        int tempSum = 0;
        char current;
        for (int i = 0; i < s.length(); i++) {
            current = s.charAt(i);

            tempSum = toInt(current);

            while (i + 1 < s.length() && toInt(current) == toInt(s.charAt(i + 1))) {
                tempSum += toInt(current);
                // Apperently only one negative is allowed so this does not need to be a loop
                // Any instance where this loops is not a correct roman numeral
                i++;    
            }
            if (i + 1 < s.length() && toInt(current) < toInt(s.charAt(i + 1))) {
                sum += (toInt(s.charAt(i + 1)) - tempSum);
                i++;
            } else {
                sum += tempSum;
            }
            System.out.println(sum);

        }

        return sum;
    }

    public static int toInt(char kar) {
        int val = 0;
        switch (kar) {
            case 'M':
                val = 1000;
                break;
            case 'D':
                val = 500;
                break;
            case 'C':
                val = 100;
                break;
            case 'L':
                val = 50;
                break;
            case 'X':
                val = 10;
                break;
            case 'V':
                val = 5;
                break;
            case 'I':
                val = 1;
                break;

            default:
                break;
        }
        return val;
    }

    public static void main(String[] args) {
        System.out.println(romanToInt("MVXLIIM"));
    }
}
