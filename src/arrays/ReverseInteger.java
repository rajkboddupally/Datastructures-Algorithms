package arrays;

public class ReverseInteger {


    public static void main(String[] args) {

        ReverseInteger r = new ReverseInteger();
        System.out.println(r.reverse(1534236469));
        //System.out.println(Integer.MAX_VALUE);
        //System.out.println(Math.pow(2,31));

    }

    public int reverse(int x) {
        int reverseInt = 0;
        while (x != 0) {
            if (reverseInt > Integer.MAX_VALUE / 10 || (reverseInt == Integer.MAX_VALUE / 10 && x > 7)) return 0;
            if (reverseInt < Integer.MIN_VALUE / 10 || (reverseInt == Integer.MIN_VALUE / 10 && x < -8)) return 0;
            reverseInt = reverseInt * 10 + x % 10;
            x = x / 10;
        }

        return reverseInt;
    }
}
