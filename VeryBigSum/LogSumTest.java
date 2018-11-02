package com.fieldforce.rohit;

public class LogSumTest {

    static String aVeryBigSum(String[] ar) {
        String sum = "";
        for (int i = 0; i < ar.length; i++) {
            String curentItem = ar[i];
            if (i == 0) {
                sum = curentItem;
            } else {

                if (sum.length() < curentItem.length()) {
                    int diff = curentItem.length() - sum.length();
                    for (int k = 0; k < diff; k++) {
                        sum = "0" + sum;
                    }
                } else {
                    int diff = sum.length() - curentItem.length();
                    for (int l = 0; l < diff; l++) {
                        curentItem = "0" + curentItem;
                    }
                }

                sum = addTwoStrings(sum, curentItem, "0", sum.length() - 1);

            }


        }


        return sum;


    }

    public static String replace(String str, int index, String replace) {
        return str.substring(0, index) + replace + str.substring(index + 1);
    }

    public static void main(String[] arr) {
        System.out.print(aVeryBigSum(new String[]{"1000000000000000000000000009", "1000000000000000000000000000","1000000000000000000000000000"}));
    }

    public static String addTwoStrings(String strOne, String strTwo, String carry, int index) {
        if (index == -1) {
            return strOne;
        }
        String str = strOne;
        int sum = Integer.parseInt(String.valueOf(strOne.charAt(index))) + Integer.parseInt(String.valueOf(strTwo.charAt(index)));
        if (Integer.parseInt(carry) > 0) {
            sum += Integer.parseInt(carry);
        }
        if (sum > 9) {
            if (index == 0) {
                str = replace(str, index, String.valueOf(sum));
            } else {
                String s = String.valueOf(sum);
                str = replace(str, index, String.valueOf(s.charAt(s.length() - 1)));
                carry = String.valueOf(s.charAt(0));
            }
        } else {

            str = replace(str, index, String.valueOf(sum));
            carry = "0";


        }


        return addTwoStrings(str, strTwo, carry, index - 1);

    }
}
