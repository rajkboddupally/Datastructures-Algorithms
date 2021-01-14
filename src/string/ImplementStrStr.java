package string;

public class ImplementStrStr {

    public int strStr_V1(String haystack, String needle) {
        int index = -1;

        if (needle.equals(""))
            return 0;

        if (needle.length() > haystack.length())
            return -1;

        char[] hay = haystack.toCharArray();
        char[] nee = needle.toCharArray();

        int hayIndex = 0, neeIndex = 0;

        while (hayIndex < haystack.length() && neeIndex < needle.length()) {

            if (hay[hayIndex++] == nee[neeIndex]) {
                index = (index == -1) ? hayIndex - 1 : index;
                neeIndex++;
            } else {
                hayIndex = (index != -1) ? index + 1 : hayIndex;
                index = -1;
                neeIndex = 0;
            }
        }

        if (neeIndex != needle.length())
            return -1;

        return index;

    }

    public int strStr(String haystack, String needle) {
        int index = -1;

        if (needle.equals(""))
            return 0;

        if (needle.length() > haystack.length())
            return -1;

        for (int i = 0; i <= haystack.length() - needle.length(); i++) {
            int j = 0;
            while (j < needle.length()) {
                if (needle.charAt(j) != haystack.charAt(i + j)) {
                    break;
                }
                j++;
                if (j == needle.length()) {
                    return i;
                }
            }
        }
        return index;
    }
}
