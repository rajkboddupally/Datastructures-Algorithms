package string;

/*
https://leetcode.com/problems/shifting-letters-ii/description/

Raj Kumar Boddupally created on 06/01/2025 inside the package - string

 */


public class ShiftingLettersII {

    public String shiftingLetters(String s, int[][] shifts) {
        int[] diffArr = new int[s.length()];
        int n = s.length();

        for (int[] shift : shifts) {
            if (shift[2] == 1) {
                diffArr[shift[0]]++;
                if (shift[1] + 1 < n) {
                    diffArr[shift[1] + 1]--;
                }
            } else {
                diffArr[shift[0]]--;
                if (shift[1] + 1 < n) diffArr[shift[1] + 1]++;
            }
        }

        StringBuilder result = new StringBuilder();
        int diff = 0;
        for (int i = 0; i < n; i++) {
            diff = (diff + diffArr[i]) % 26;
            if (diff < 0)
                diff += 26;
            char r = (char) ('a' + ((s.charAt(i) - 'a' + diff) + 26) % 26);
            result.append(r);
        }

        return result.toString();
    }


}
