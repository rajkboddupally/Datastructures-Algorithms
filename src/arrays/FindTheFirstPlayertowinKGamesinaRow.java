package arrays;

import java.util.HashMap;
import java.util.Map;

/*
Raj Kumar Boddupally created on 12/15/2024 inside the package - arrays

https://leetcode.com/problems/find-the-first-player-to-win-k-games-in-a-row/

A competition consists of n players numbered from 0 to n - 1.

You are given an integer array skills of size n and a positive integer k, where skills[i] is the skill level of player i. All integers in skills are unique.

All players are standing in a queue in order from player 0 to player n - 1.

The competition process is as follows:

The first two players in the queue play a game, and the player with the higher skill level wins.
After the game, the winner stays at the beginning of the queue, and the loser goes to the end of it.
The winner of the competition is the first player who wins k games in a row.

Return the initial index of the winning player.



Example 1:

Input: skills = [4,2,6,3,9], k = 2

Output: 2

Explanation:

Initially, the queue of players is [0,1,2,3,4]. The following process happens:

Players 0 and 1 play a game, since the skill of player 0 is higher than that of player 1, player 0 wins. The resulting queue is [0,2,3,4,1].
Players 0 and 2 play a game, since the skill of player 2 is higher than that of player 0, player 2 wins. The resulting queue is [2,3,4,1,0].
Players 2 and 3 play a game, since the skill of player 2 is higher than that of player 3, player 2 wins. The resulting queue is [2,4,1,0,3].
Player 2 won k = 2 games in a row, so the winner is player 2.

Example 2:

Input: skills = [2,5,4], k = 3

Output: 1

Explanation:

Initially, the queue of players is [0,1,2]. The following process happens:

Players 0 and 1 play a game, since the skill of player 1 is higher than that of player 0, player 1 wins. The resulting queue is [1,2,0].
Players 1 and 2 play a game, since the skill of player 1 is higher than that of player 2, player 1 wins. The resulting queue is [1,0,2].
Players 1 and 0 play a game, since the skill of player 1 is higher than that of player 0, player 1 wins. The resulting queue is [1,2,0].
Player 1 won k = 3 games in a row, so the winner is player 1.



Constraints:

n == skills.length
2 <= n <= 105
1 <= k <= 109
1 <= skills[i] <= 106
All integers in skills are unique.

 */
public class FindTheFirstPlayertowinKGamesinaRow {

    /*
    Approach
    1. Create a map with key as player index and their skill as value
    2. create a counter and see if a[0] unchanged for k times.
        2.1 if counter reached k return index of player
    3. a[0] changed, then reshuffle array.
     */
    public int findWinningPlayer(int[] skills, int k) {



        Map<Integer, Integer> skillMap = new HashMap<>();
        int index = 0;
        for(int skill : skills)
            skillMap.put(skill, index++);

        if(k >= skills.length){
            int largestNum = skills[0];
            for(int skill: skills)
                largestNum = Math.max(largestNum, skill);
            return skillMap.get(largestNum);
        }

        Map<Integer, Integer> winMap = new HashMap<>();

        while(true){

            if(skills[0] > skills[1]){
                reShuffle(skills, 1, skills[1], skills.length-1);
            }else {
                reShuffle(skills, 0,skills[0],skills.length-1);
            }
            winMap.compute(skills[0], (key, currentWin) ->(currentWin == null)?1: currentWin + 1);
            if(winMap.containsKey(skills[0]) && winMap.get(skills[0]) == k)
                return skillMap.get(skills[0]);

        }

    }

    private void reShuffle(int[] skills, int startIndex, int skill, int index) {
        for(int i=startIndex;i<skills.length-1;i++){
            skills[i] = skills[i+1];
        }
        skills[index] = skill;
    }


}
