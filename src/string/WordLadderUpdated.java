package string;

import java.util.*;

public class WordLadderUpdated {

    public int ladderLength(String beginWord, String endWord, List<String> wordList) {
        int steps = 0;
        Set<String> set = new HashSet<>(wordList);
        if (!set.contains(endWord))
            return 0;

        Queue<String> queue = new LinkedList<>();
        queue.offer(beginWord);
        //steps++;

        while (!queue.isEmpty()) {
            steps++;
            int size = queue.size();

            while (size-- > 0) {
                String currentWord = queue.poll();

                for (int i = 0; i < currentWord.length(); i++) {
                    StringBuilder tempWord = new StringBuilder();
                    tempWord.append(currentWord);

                    for (char c = 'a'; c <= 'z'; c++) {
                        tempWord.setCharAt(i, c);

                        if (tempWord.toString().equals(currentWord))
                            continue;
                        else if (tempWord.toString().equals(endWord)) {
                            return steps+1;
                        } else if (set.contains(tempWord.toString())) {
                            set.remove(tempWord.toString());
                            queue.offer(tempWord.toString());
                        }
                    }
                }

            }
        }
        return 0;
    }


}




