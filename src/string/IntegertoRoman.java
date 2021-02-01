package string;

public class IntegertoRoman {

    public String intToRoman1(int num) {


        StringBuilder sb = new StringBuilder();
        int divide = 0;

        //1000s
        if (num >= 1000) {
            divide = num / 1000;
            for (int i = 0; i < divide; i++) {
                sb.append("M");
            }
        }
        num = num % 1000;

        //100s
        if (num >= 900) {
            sb.append("CM");
            num -= 900;
        } else if (num >= 500) {
            sb.append("D");
            num -= 500;
        } else if (num >= 400) {
            sb.append("CD");
            num -= 400;
        }

        divide = num / 100;
        for (int i = 0; i < divide; i++) {
            sb.append("C");
        }

        num = num % 100;

        //10s
        if (num >= 90) {
            sb.append("XC");
            num -= 90;
        } else if (num >= 50) {
            sb.append("L");
            num -= 50;
        } else if (num >= 40) {
            sb.append("XL");
            num -= 40;
        }
        divide = num / 10;
        for (int i = 0; i < divide; i++) {
            sb.append("X");
        }
        num = num % 10;

        //1s
        if (num == 9) {
            sb.append("IX");
            num -= 9;
        } else if (num >= 5) {
            sb.append("V");
            num -= 5;
        } else if (num == 4) {
            sb.append("IV");
            num -= 4;
        }
        divide = num % 10;
        for (int i = 0; i < divide; i++) {
            sb.append("I");
        }

        return sb.toString();
    }


    public String intToRoman(int num) {


        StringBuilder sb = new StringBuilder();
        int divide = 0;

        String[] roman = {"M", "CM", "D", "CD", "C", "XC", "L", "XL", "X", "IX", "V", "IV", "I"};
        int[] intValues = {1000, 900, 500, 400, 100, 90, 50, 40, 10, 9, 5, 4, 1};

        for (int i = 0; i < intValues.length; i++) {
            while (num >= intValues[i]) {
                sb.append(roman[i]);
                num -= intValues[i];
            }
        }

        return sb.toString();
    }
}
