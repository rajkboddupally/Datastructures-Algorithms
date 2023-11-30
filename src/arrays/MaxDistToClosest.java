package arrays;

public class MaxDistToClosest {

    public static void main(String[] args) {
        System.out.println(maxDistToClosest(new int[]{1, 0, 0, 0}));
        //System.out.println(maxDistToClosest(new int[]{1, 0, 0, 0, 1, 0, 1}));
    }

    public static int maxDistToClosest(int[] seats) {
        //0 0 1 0 0 0 1 1
        int maxStartEmptySeats = 0;
        int maxEndEmptySeats = 0;
        int maxMiddleEmptySeats = 0;
        int tempMaxMiddleEmptySeats = 0;
        for (int i = 0; i < seats.length; i++) {
            if (seats[i] == 0) {
                maxStartEmptySeats++;
            } else break;
        }

        for (int i = seats.length - 1; i >= 0; i--) {
            if (seats[i] == 0) {
                maxEndEmptySeats++;
            } else break;
        }

        for (int i = 0; i < seats.length; i++) {
            if (seats[i] == 0) {
                tempMaxMiddleEmptySeats++;

            } else {
                tempMaxMiddleEmptySeats = 0;
            }
            maxMiddleEmptySeats = Math.max(tempMaxMiddleEmptySeats, maxMiddleEmptySeats);
        }
        int maxStartEndEmptySeats = Math.max(maxEndEmptySeats, maxStartEmptySeats);
        return Math.max(maxStartEndEmptySeats, (maxMiddleEmptySeats+1) / 2);
    }
}
