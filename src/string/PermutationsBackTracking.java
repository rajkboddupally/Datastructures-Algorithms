package string;

public class PermutationsBackTracking {
    public void permute(String str, int l, int r) {
        if (l == r)
            System.out.println(str);
        else {
            for (int i = l; i <= r; i++) {
                str = swap(str, i, l);
                permute(str, l + 1, r);
                str = swap(str, i, l);
            }
        }
    }

    private String swap(String str, int i, int l) {

        char[] charArr = str.toCharArray();
        char temp = charArr[i];
        charArr[i] = charArr[l];
        charArr[l] = temp;

        return String.valueOf(charArr);
    }
}
