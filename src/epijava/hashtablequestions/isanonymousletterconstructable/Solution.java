package epijava.hashtablequestions.isanonymousletterconstructable;

import com.sun.source.tree.Tree;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Solution {

    static boolean testForPalindrome(String str,String[] words, int k){
        //Thing to note for string that can form palindrome
        //1. They are usually odd
        //2. they typically read same forward and backward
        //3. characters could be duplicate in the string e.g. rrr => rrr , level => level, edified => deified ,

        var test =  Arrays.stream(words).collect(Collectors.groupingBy(
                Function.identity(),
                Collectors.counting()));
        TreeMap<String,Long> treeMap = new TreeMap<>(test);

        Map<String, Long> finalMap = new LinkedHashMap<>();

        //Sort a map and add to finalMap
        treeMap.entrySet().stream()
                .sorted(Map.Entry.<String, Long>comparingByValue()
                        .reversed()).forEachOrdered(e -> finalMap.put(e.getKey(), e.getValue()));

        return false;
    }
}
