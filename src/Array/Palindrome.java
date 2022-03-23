package Array;

public class Palindrome {
    /*
    Reads the same forwards and backwards

    Algorithm : O(N) linear running time complexity
    - Store 2 pointers
        - First one at the first character.
        - Second one at the last character.
    -
     */

    public static void main(String[] args) {
        System.out.println(isPalindrome("racecar"));
        System.out.println(isPalindrome("orange"));
    }

    public static boolean isPalindrome(String s){
        int forward = 0; // Pointer that traverses forwards
        int backward = s.length() -1; // Pointer that traverses backwards

        while (forward<backward){
            if(s.charAt(forward) != s.charAt(backward)) return false;

            forward++;
            backward--;
        }
        return true;
    }
}
