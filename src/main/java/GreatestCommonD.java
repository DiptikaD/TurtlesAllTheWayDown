import java.time.Duration;
import java.time.Instant;

public class GreatestCommonD {

/******************************************************************************
 *  Compilation:  javac Euclid.java
 *  Execution:    java Euclid p q
 *
 *  Reads two command-line arguments p and q and computes the greatest
 *  common divisor of p and q using Euclid's algorithm.
 *
 *  Remarks
 *  -----------
 *    - may return the negative of the gcd if either p or q is negative
 *
 ******************************************************************************/



    // recursive implementation
    public int gcd(int p, int q) {
        if (q == 0) return p;
        else return gcd(q, p % q);
    }

//     non-recursive implementation
    public int gcd2(int p, int q) {
        while (q != 0) {
            int temp = q;
            q = p % q;
            p = temp;
        }
        return p;
    }

    public long getGCD1Duration(int p, int q){
        Instant start = Instant.now();
        gcd(p, q);
        Instant finish = Instant.now();
        long timeElapsed = Duration.between(start,finish).getNano();
        System.out.println("recursion nanoSec = " + timeElapsed);
        return timeElapsed;
    }

    public long getGCD2Duration(int p, int q){
        Instant start = Instant.now();
        gcd2(p, q);
        Instant finish = Instant.now();
        long timeElapsed = Duration.between(start,finish).getNano();
        System.out.println("nonrecursion nanoSec = " + timeElapsed);
        return timeElapsed;
    }

}
