import java.time.Duration;
import java.time.Instant;

public class Permutations {


    /******************************************************************************
     *  Compilation:  javac Permutations.java
     *  Execution:    java Permutations n
     *
     *  Enumerates all permutations on n elements.
     *  Two different approaches are included.
     *
     *  % java Permutations 3
     *  abc
     *  acb
     *  bac
     *  bca
     *  cab
     *  cba
     *
     ******************************************************************************/


    // print n! permutation of the characters of the string s (in order)
    public void perm1(String s) {
        perm1("", s);
    }

    private void perm1(String prefix, String s) {
        int n = s.length();
        if (n == 0) System.out.println(prefix);
        else {
            for (int i = 0; i < n; i++)
                perm1(prefix + s.charAt(i), s.substring(0, i) + s.substring(i + 1, n));
        }

    }

    // print n! permutation of the elements of array a (not in order)
    public void perm2(String s) {
        int n = s.length();
        char[] a = new char[n];
        for (int i = 0; i < n; i++)
            a[i] = s.charAt(i);
        perm2(a, n);
    }

    private void perm2(char[] a, int n) {
        if (n == 1) {
            System.out.println(new String(a));
            return;
        }
        for (int i = 0; i < n; i++) {
            swap(a, i, n - 1);
            perm2(a, n - 1);
            swap(a, i, n - 1);
        }
    }

    // swap the characters at indices i and j
    private void swap(char[] a, int i, int j) {
        char c = a[i];
        a[i] = a[j];
        a[j] = c;
    }


    public long getUnorderedDuration(int n){
        String alphabet = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ";
        String elements = alphabet.substring(0, n);
        Instant start = Instant.now();
        perm1(elements);
        Instant finish = Instant.now();
        long timeElapsed = Duration.between(start,finish).getNano();
        System.out.println("unOrdered nanoSec = " + timeElapsed);
        return timeElapsed;
    }

    public long getOrderedDuration(int n){
        String alphabet = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ";
        String elements = alphabet.substring(0, n);
        Instant start = Instant.now();
        perm2(elements);
        Instant finish = Instant.now();
        long timeElapsed = Duration.between(start,finish).getNano();
        System.out.println("nonrecursion nanoSec = " + timeElapsed);
        return timeElapsed;
    }
}
