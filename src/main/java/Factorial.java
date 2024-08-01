import java.time.Duration;
import java.time.Instant;

public class Factorial {

    public int factorialRecursion(int n){

        if (n==1){
            return 1;
        }
        return n* factorialRecursion(n-1);
    }

    public int factorialNonRecursion(int n){
        int sum = 1;
        for (int i = n; i > 0; i--){
        sum = sum * i;
        }
        return sum;
    }

    public long getRecursionDuration(int n){
        Instant start = Instant.now();
        factorialRecursion(n);
        Instant finish = Instant.now();
        long timeElapsed = Duration.between(start,finish).getNano();
        System.out.println("recursion nanoSec = " + timeElapsed);
        return timeElapsed;
    }

    public long getNonRecDuration(int n){
        Instant start = Instant.now();
        factorialNonRecursion(n);
        Instant finish = Instant.now();
        long timeElapsed = Duration.between(start,finish).getNano();
        System.out.println("nonrecursion nanoSec = " + timeElapsed);
        return timeElapsed;
    }
}
