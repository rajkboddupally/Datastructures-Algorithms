package string;/* Raj Kumar Boddupally created on 7/22/2021 inside the package - string */

import java.util.*;

public class GroupAnagrams {
    public static void main(String[] args) {
        GroupAnagrams g = new GroupAnagrams();
        g.groupAnagrams(new String[]{"eat", "tea", "tan", "ate", "nat", "bat"});
    }

    public List<List<String>> groupAnagrams(String[] strs) {
        List<List<String>> res = new ArrayList<>();
        HashMap<String, List<String>> anagramMap = new HashMap<>();

        for (String str : strs) {
            char[] arr = str.toCharArray();
            Arrays.sort(arr);
            String sortedKey = new String(arr);

            if (anagramMap.containsKey(sortedKey)) {
                anagramMap.get(sortedKey).add(str);
            } else {
                List<String> list = new ArrayList<>();
                list.add(str);
                anagramMap.put(sortedKey, list);
            }
        }

        for (Map.Entry<String, List<String>> map : anagramMap.entrySet()) {
            res.add(map.getValue());
        }

        return res;
    }
}
