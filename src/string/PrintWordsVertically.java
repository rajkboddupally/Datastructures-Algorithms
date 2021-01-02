package string;

import java.util.ArrayList;
import java.util.List;

public class PrintWordsVertically {

    public static void main(String[] args) {
        String str = "TO BE OR NOTM TO BE";
        List<String> o = printVertically(str);

        for (String s : o)
            System.out.println(s);


    }

    public static List<String> printVertically(String s) {

        String[] strArr = s.split(" ");
        int length = strArr.length;
        int maxLength = 0;
        for (int i = 0; i < length; i++) {
            if (maxLength < strArr[i].length()) {
                maxLength = strArr[i].length();
            }
        }
        List<String> output = new ArrayList<>(maxLength);
        StringBuilder[] sb = new StringBuilder[maxLength];
        for (int j = 0; j < maxLength; j++) {
            sb[j] = new StringBuilder();
            for (int k = 0; k < length; k++) {
                if (strArr[k].length() > j) {
                    sb[j].append(strArr[k].charAt(j));
                } else {
                   sb[j].append(' ');
                }
            }
            while(sb[j].charAt(sb[j].length() - 1) == ' '){
                sb[j].deleteCharAt(sb[j].length() - 1);
            }
            output.add(sb[j].toString());
        }
        return output;
    }

}
