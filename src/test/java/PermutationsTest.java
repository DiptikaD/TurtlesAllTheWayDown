import org.junit.Assert;
import org.junit.Test;

import java.time.Instant;

public class PermutationsTest {

    @Test
    public void durationTest(){
        Permutations permutations = new Permutations();
        Long ordered = permutations.getOrderedDuration(4);
        Long unordered = permutations.getUnorderedDuration(5);
        Assert.assertNotEquals(ordered, unordered, 0.05);
    }
}
