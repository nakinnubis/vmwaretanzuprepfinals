package easy.missingnumber;

import java.util.Arrays;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Solution {
    public static void main(String[] args) {
       var nums = new int[] {5,7,11,13};
      var result = missingNumber(nums);
        System.out.println(result);
    }
    public static int missingNumber(int[] nums) {
        int n  = nums.length;
        var numbers = IntStream.range(0,n+1)
                .boxed()
                .collect(Collectors.toSet());
        for (var _num_: nums
             ) {
            numbers.remove(_num_);
        }
       return numbers.iterator().next();
    }

//    public static int missingNumber2(int[] nums) {
//        int n  = nums.length;
//
//        for(var i =0; i< n; i++){
//            if(i != d[i]){
//                return i;
//            }
//        }
//       return 0;
//    }
}
