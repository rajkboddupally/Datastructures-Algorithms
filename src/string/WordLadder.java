package string;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class WordLadder {

    public int ladderLength(String beginWord, String endWord, List<String> wordList) {
        int steps = 0;
        int minSteps = 0;

        String nextWord = null;
        List<String> nextWordList;

        //check endWord is present in wordList
        if (!wordList.contains(endWord))
            return steps;
        System.out.print(beginWord + " => ");
        Set<String> checked = new HashSet<>();
        while (!beginWord.equals(endWord)) {

            nextWordList = getNextWord(beginWord, wordList, checked);

            if (nextWordList.size() == 1) {
                nextWord = nextWordList.get(0);
                System.out.print(nextWord + " => ");
                if (!nextWord.equals(endWord)) {
                    checked.add(nextWord);
                    beginWord = nextWord;
                    steps++;
                } else {
                    return steps;
                }
            } else {
                for (String nextWord1 : nextWordList) {
                    System.out.print(nextWord + " => ");

                    if (!nextWord.equals(endWord)) {
                        checked.add(nextWord);
                        beginWord = nextWord;
                        steps++;
                    } else {
                        //minSteps = Math.min(minSteps, steps);
                        return steps;
                    }
                }
            }

        }
        return steps;
    }

    /*
            String begin = "hit";
        String end = "cog";
        String[] data = {"hot","dot","dog","lot","log","cog"};

        "hit" -> "hot" -> "dot" -> "dog" -> "cog"
     */

    private List<String> getNextWord(String beginWord, List<String> wordList, Set<String> checked) {
        List<String> nextWordList = new ArrayList<>(wordList.size());
        for (String str : wordList) {
            if (!checked.contains(str)) {
                int same = 0;
                if (str.length() != beginWord.length())
                    continue;

                for (int i = 0; i < str.length(); i++) {
                    if (str.charAt(i) == beginWord.charAt(i)) {
                        same++;
                    }
                }

                if (same == str.length() - 1)
                    nextWordList.add(str);
            }
        }
        return nextWordList;
    }
}




