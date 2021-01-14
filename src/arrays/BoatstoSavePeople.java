package arrays;

import java.util.Arrays;

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
        int startIndex = 0, endIndex = people.length - 1;
        while (startIndex <= endIndex) {
            if (people[startIndex] + people[endIndex] <= limit) {
                startIndex++;
            }
            endIndex--;
            rescueBoats++;
        }

        return rescueBoats;
    }
}
