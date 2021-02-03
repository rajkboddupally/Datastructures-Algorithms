package string;

public class LongestCommonPrefix {

    public String longestCommonPrefix(String[] strs) {
        if (strs.length == 0 || strs[0] == null || strs[0].length() == 0)
            return "";
        StringBuilder sb = new StringBuilder();

        int minStrLength = strs[0].length();

        for (int j = 1; j < strs.length; j++) {
            minStrLength = Math.min(minStrLength, strs[j].length());
        }

        outerloop:
        for (int i = 0; i < minStrLength; i++) {
            for (int j = 1; j < strs.length; j++) {
                if (strs[0].charAt(i) != strs[j].charAt(i)) {
                    break outerloop;
                }
            }
            sb.append(strs[0].charAt(i));
        }
        return sb.toString();
    }
}
