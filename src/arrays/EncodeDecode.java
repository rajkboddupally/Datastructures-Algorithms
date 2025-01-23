package arrays;

import java.util.ArrayList;
import java.util.List;

public class EncodeDecode {

    int[] len;

    public String encode(List<String> strs) {
        len = new int[strs.size()];
        int i = 0;
        StringBuilder sb = new StringBuilder();
        for (String s : strs) {
            len[i++] = s.length();
            sb.append(s);
        }
        return sb.toString();
    }

    public List<String> decode(String str) {
        int start = 0;
        int end;
        List<String> result = new ArrayList<>();
        for (int i = 0; i < len.length; i++) {
            end = start + len[i];
            result.add(str.substring(start, end));
            start = end;
        }
        return result;
    }
}
