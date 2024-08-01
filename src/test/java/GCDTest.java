import org.junit.Assert;
import org.junit.Test;

public class GCDTest {

    @Test
    public void gcdTest1(){
        GreatestCommonD gcd = new GreatestCommonD();
        int expected = 24;
        int actual = gcd.gcd(408, 216);

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void gcdTest2(){
        GreatestCommonD gcd = new GreatestCommonD();
        int expected = 3;
        int actual = gcd.gcd(3093, 102);

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void durationTest(){
        GreatestCommonD gcd = new GreatestCommonD();
        Long recursive = gcd.getGCD1Duration(408, 216);
        Long nonRecursive = gcd.getGCD2Duration(408, 216);
        Assert.assertNotEquals(recursive, nonRecursive, 0.05);
    }


}
