package Array;

public class IntegerReversion {
    /*
    For a given integer, reverse the integer.
    Input is an INTEGER. Not a string.

    Algorithm:
    - Get the last integer using the modulo operator. The last digit is the remainder when dividing by 10.
    - Remove the last digit from the original number by dividing by 10.
    - Reversed number will be reversed * 10 + remainder until the original number is greater than 0
     */

    public static void main(String[] args) {
        System.out.println(reversedNumber(1234));
        System.out.println(reversedNumber(5432109));
    }

    public static int reversedNumber(int input){
        int reversed = 0;
        int remainder = 0;

        while (input > 0){
            remainder = input%10;
            input = input/10;
            reversed = reversed*10 + remainder;
        }

        return reversed;
    }


}
