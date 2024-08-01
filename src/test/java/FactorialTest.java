import org.junit.Assert;
import org.junit.Test;

public class FactorialTest {

    @Test
    public void factorialTest(){
        Factorial factorial = new Factorial();
        int expected = 120;
        int actual = factorial.factorialRecursion(5);

        Assert.assertEquals(expected, actual);
    }


    @Test
    public void durationTest(){
        Factorial factorial = new Factorial();
        Long recursive = factorial.getRecursionDuration(6);
        Long nonRecursive = factorial.getNonRecDuration(5);
        Assert.assertNotEquals(recursive, nonRecursive, 0.05);
    }
}
