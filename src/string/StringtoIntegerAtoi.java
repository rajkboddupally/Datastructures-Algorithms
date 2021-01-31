package string;

public class StringtoIntegerAtoi {

    public static void main(String[] args) {
        StringtoIntegerAtoi s = new StringtoIntegerAtoi();

        /*

        System.out.println(s.myAtoi("-2147483647"));
        System.out.println(s.myAtoi("   -42"));

        System.out.println(s.myAtoi("-91283472332"));
        System.out.println(s.myAtoi("3.12312312"));


        System.out.println(s.myAtoi("20000000000000000000"));
        System.out.println(s.myAtoi("  -0012a42"));

         */

        System.out.println(s.myAtoi("4193 with words"));

        System.out.println(s.myAtoi("words with 987"));
    }

    public int myAtoi1(String s) {
        s = s.trim();
        if (s.isEmpty())
            return 0;
        boolean signInd = s.charAt(0) == '-' ? true : false;

        if (s.charAt(0) == '+' || s.charAt(0) == '-') {
            s = s.substring(1);
        }

        String[] arr = s.split("[.\\s]");

        String[] numArr = arr[0].split("[^0-9]");

        if (numArr.length > 0 && !numArr[0].isEmpty()) {
            try {
                return signInd ? -Integer.valueOf(numArr[0]) : Integer.valueOf(numArr[0]);
            } catch (Exception ex) {
                return signInd ? Integer.MIN_VALUE : Integer.MAX_VALUE;
            }
        }
        return 0;
    }

    public int myAtoi(String s) {
        s = s.trim();
        if (s.isEmpty())
            return 0;
        boolean signInd = s.charAt(0) == '-' ? true : false;

        if (s.charAt(0) == '+' || s.charAt(0) == '-') {
            s = s.substring(1);
        }

        char[] charArray = s.toCharArray();
        StringBuilder sb = new StringBuilder();

        for (char c : charArray) {
            if (sb.length() == 0 && (c == '0')) {
            } else if (c >= '0' && c <= '9') {
                sb.append(c);
            } else {
                break;
            }
        }
        if (sb.length() == 0)
            return 0;
        try {
            return signInd ? -Integer.valueOf(sb.toString()) : Integer.valueOf(sb.toString());
        } catch (Exception ex) {
            return signInd ? Integer.MIN_VALUE : Integer.MAX_VALUE;
        }
    }
}
