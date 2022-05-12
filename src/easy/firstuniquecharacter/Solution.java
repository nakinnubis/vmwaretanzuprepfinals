package easy.firstuniquecharacter;

import java.util.Arrays;
import java.util.function.Function;
import java.util.stream.Collectors;

import static java.util.function.Function.*;

//Given a string s, find the first non-repeating character in it and return its index. If it does not exist, return -1.
//
//
//
//        Example 1:
//
//        Input: s = "leetcode"
//        Output: 0
//        Example 2:
//
//        Input: s = "loveleetcode"
//        Output: 2
//        Example 3:
//
//        Input: s = "aabb"
//        Output: -1
public class Solution {
    public static void main(String[] args) {
        String s = "yekbsxznylrwamcaugrqrurvpqybkpfzwbqiysrdnrsnbftvrnszfjbkbmrctjizkjqoxqzddyfnavnhqeblfmzqgsjflghaulbadwqsyuetdelujphmlgtmkoaoijypvcajctbaumeromgejtewbwqptotrorephegyobbstvywljboeihdliknluqdpgampjyjpinxhhqexoctysfdciqjbzilnodzoihihusxluqoayenluziobxiodrfdkinkzzozmxfezfvllpdvogqqtquwcsijwachefspywdgsohqtlquhnoecccgbkrzqcprzmwvygqwddnehhi";
        firstUniqChar(s);
    }
    public static int firstUniqChar(String s) {
        if(s.length() > 0 && !s.isEmpty() && !s.isBlank()){
            var strChar = s.toCharArray();
            for (int i = 0; i < strChar.length; i++) {
                if(s.indexOf(strChar[i]) == s.lastIndexOf(strChar[i])){
                    return i;
                }
            }
        }
        return -1;
    }
}
