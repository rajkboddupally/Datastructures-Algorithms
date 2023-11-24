package arrays;

import java.util.Arrays;

/*
You are given an array people where people[i] is the weight of the ith person, and an infinite number of boats where each boat can carry a maximum weight of limit. Each boat carries at most two people at the same time, provided the sum of the weight of those people is at most limit.

Return the minimum number of boats to carry every given person.



Example 1:

Input: people = [1,2], limit = 3
Output: 1
Explanation: 1 boat (1, 2)
Example 2:

Input: people = [3,2,2,1], limit = 3
Output: 3
Explanation: 3 boats (1, 2), (2) and (3)
Example 3:

Input: people = [3,5,3,4], limit = 5
Output: 4
Explanation: 4 boats (3), (3), (4), (5)


Constraints:

1 <= people.length <= 5 * 104
1 <= people[i] <= limit <= 3 * 104

 */

public class BoatstoSavePeople {
    public int numRescueBoats_OLD(int[] people, int limit) {
        int rescueBoats = 0;
        int totalWeightInBoat = 0;
        int totalPeopleInBoat = 0;

        Arrays.sort(people);

        for (int i = 0; i < people.length; i++) {

            totalWeightInBoat += people[i];
            totalPeopleInBoat++;

            if (totalWeightInBoat == limit) {
                rescueBoats++;
                totalWeightInBoat = 0;
                totalPeopleInBoat = 0;
            } else if (totalWeightInBoat > limit) {
                rescueBoats++;
                totalWeightInBoat = people[i];
                totalPeopleInBoat--;
            }
        }

        if (totalWeightInBoat > 0)
            rescueBoats++;

        return rescueBoats;
    }


    public int numRescueBoats_V1(int[] people, int limit) {
        int rescueBoats = 0;
        Arrays.sort(people);
        for (int i = 0; i < people.length; i++) {
            if (people[i] == 0) continue;
            int maxWeightNeeded = limit - people[i];
            int person2Weight = 0;
            int j = i + 1;
            int person2Index = j;
            for (; j < people.length && maxWeightNeeded > 0; j++) {
                if (people[j] == 0) continue;
                if (people[j] <= maxWeightNeeded) {
                    if (person2Weight < people[j]) {
                        person2Weight = people[j];
                        person2Index = j;
                    }
                } else
                    break;
            }
            rescueBoats++;
            people[i] = 0;
            if (person2Weight > 0) {
                people[person2Index] = 0;
            }
        }
        return rescueBoats;
    }

    public int numRescueBoats(int[] people, int limit) {
        int rescueBoats = 0;
        Arrays.sort(people);
        int startIndex = 0;
        int endIndex = people.length - 1;

        while(startIndex <= endIndex){
            if(people[startIndex] + people[endIndex] <= limit){
                startIndex++;
            }
            endIndex--;
            rescueBoats++;
        }

        return rescueBoats;
    }
}
