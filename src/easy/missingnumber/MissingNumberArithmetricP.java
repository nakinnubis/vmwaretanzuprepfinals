package easy.missingnumber;
import java.util.*;
public class MissingNumberArithmetricP {
    public static void main(String[] args) {
        var nums = new int[] {1,1,1};
        var result = missingNumber(nums);
        System.out.println(result);
    }
    public static int missingNumber(int[] arr) {
      var sortedNumbers = Arrays.stream(arr).sorted().boxed().toList();
       int diff = 0;
       int fastPointer = 1;
        for (int i = 0; i < sortedNumbers.size(); i++) {
            if(fastPointer < sortedNumbers.size()){
                var current = sortedNumbers.get(i);
                var next = sortedNumbers.get(fastPointer);
                var currentDiff = next -current;
                if(currentDiff != 0){
                    if(currentDiff > diff && diff !=0){
                        return current+diff;
                    }
                    else if(currentDiff < diff && diff != 0){
                        return current -currentDiff;
                    }
                    diff = currentDiff;
                }

            }

            fastPointer++;
        }
        return arr[0];
    }
}
//    LRU Cache.
//
//        Design a polling system.
//        URL shortening system.
//top n numbers in a number array: given Ann array contains numerical numbers, print the top n largest numbers.
// 1. Design and write code LRU Cache. 2. Design bit.ly 2. Check if Anagram string is present in the list 3. Design device behaviour app