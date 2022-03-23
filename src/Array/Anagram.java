package Array;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Anagram {
/*
    An anagram is a word or phrase formed by rearranging the letters of a different word or phrase,
    typically using all the original letters exactly once.

    Algorithm : Overall Running Time - O(NlogN) + O(N) = O(NlogN)
    - Sort both string arrays in alphabetical order.
    - Iterate and compare to check if both arrays are matching.
        1. Check if both character arrays are equal in length
        2. Sort the letters : O(NlogN) - bottleneck of the algorithm
    - If they are, the two strings are anagrams
 */
    public static void main(String[] args) {
        System.out.println(isAnagram("apple".toCharArray(), "orange".toCharArray()));
        System.out.println(isAnagram("restful".toCharArray(), "fluster".toCharArray()));
    }

    public static boolean isAnagram(char[] subject, char[] anagram) {
        if(subject.length != anagram.length) return false;

        // Sorting both the arrays
        Arrays.sort(subject);
        Arrays.sort(anagram);

        // Comparison
        for(int i=0; i<subject.length; ++i){
            if(subject[i] != anagram[i]){
                return false;
            }
        }
        return true;
    }
}
