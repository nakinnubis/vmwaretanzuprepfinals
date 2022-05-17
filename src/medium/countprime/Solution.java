package medium.countprime;

import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Solution {
    public static void main(String[] args) {
        int n = 10;
        countPrimes(n);
    }
    public static int countPrimes(int n) {
        var primes = IntStream.range(1,n+1).boxed().toList();

            var p =    primes.stream().filter(a->isPrime(a,n)).collect(Collectors.counting());
return Math.toIntExact(p);
    }

    private static boolean isPrime(int a,int n) {
        if (a%2 != 0 && a != 1 && a < n){
            return true;
        }
        return false;
}
    public static boolean isPrime(int number) {
        int sqrt = (int) Math.sqrt(number) + 1;

    for (int i = 2; i < sqrt; i++) { if (number % i == 0) {
        // number is perfectly divisible - no prime
        return false;
    }
    }
    return true; }

}


