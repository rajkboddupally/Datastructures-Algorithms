package arrays;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/*
Raj Kumar Boddupally created on 12/15/2024 inside the package - arrays

https://leetcode.com/problems/find-the-number-of-winning-players/
You are given an integer n representing the number of players in a game and a 2D array pick where pick[i] = [xi, yi] represents that the player xi picked a ball of color yi.

Player i wins the game if they pick strictly more than i balls of the same color. In other words,

Player 0 wins if they pick any ball.
Player 1 wins if they pick at least two balls of the same color.
...
Player i wins if they pick at leasti + 1 balls of the same color.
Return the number of players who win the game.

Note that multiple players can win the game.



Example 1:

Input: n = 4, pick = [[0,0],[1,0],[1,0],[2,1],[2,1],[2,0]]

Output: 2

Explanation:

Player 0 and player 1 win the game, while players 2 and 3 do not win.

Example 2:

Input: n = 5, pick = [[1,1],[1,2],[1,3],[1,4]]

Output: 0

Explanation:

No player wins the game.

Example 3:

Input: n = 5, pick = [[1,1],[2,4],[2,4],[2,4]]

Output: 1

Explanation:

Player 2 wins the game by picking 3 balls with color 4.



Constraints:

2 <= n <= 10
1 <= pick.length <= 100
pick[i].length == 2
0 <= xi <= n - 1
0 <= yi <= 10

 */
public class FindtheNumberofWinningPlayers {
    /*
     Approach
     Create a map with key as player index and value as map of color of the ball and count.
     initiate winningPlayerCount to 0
     1. Iterate pick length
     2. if map has a x already
        then check the value if there , if yes increment the counter.
        else put the y as key and 1
     3. if map does not have x
        then put x as key and value as map of y and 1.

     4. Iterate through map
        get key - x and see the value of y.
            if y>= x then increment winningPlayerCount
     5. return winningPlayerCount;
     */
    public int winningPlayerCount(int n, int[][] pick) {
        int winningPlayerCount = 0;
        Map<Integer, Map<Integer, Integer>> myMap = getIntegerMapMap(pick);
        for (Map.Entry<Integer, Map<Integer, Integer>> entry : myMap.entrySet()) {
            int x = entry.getKey();
            Map<Integer, Integer> y = entry.getValue();
            for (Integer integer : y.values()) {
                if (integer > x) {
                    winningPlayerCount++;
                    break;
                }
            }
        }
        return winningPlayerCount;
    }

    private static Map<Integer, Map<Integer, Integer>> getIntegerMapMap(int[][] pick) {
        Map<Integer, Map<Integer, Integer>> myMap = new HashMap<>();
        for(int[] a: pick){
            if(myMap.containsKey(a[0])){
                Map<Integer, Integer> val = myMap.get(a[0]);
                if(val.containsKey(a[1])){
                    val.put(a[1], val.get(a[1])+1);
                }else{
                    val.put(a[1], 1);
                }
                myMap.put(a[0], val);
            }else {
                Map<Integer, Integer> val = new HashMap<>();
                val.put(a[1], 1);
                myMap.put(a[0], val);
            }
        }
        return myMap;
    }

}

