import org.junit.*;
import static org.junit.Assert.assertEquals;
public class JUnitTest {
    private Finder finder = new Finder();
    @Test
    public void maxValidTest() {
        int[] valArray = new int[]{3,7,1,2,-1};
        int expect = 7;
        int actual = finder.findMax(valArray);
        assertEquals(actual,expect);
    }
    @Test
    public void MinValidTest() {
        int[] valArray = new int[]{3,7,1,2,-1};
        int expect = -1;
        int actual = finder.findMin(valArray);
        assertEquals(actual,expect);
    }
    @Test
    public void maxInvalidTest() {
        int[] valArray = new int[3];
        Integer expect = 0;
        Integer actual = finder.findMax(valArray);
        assertEquals(actual,expect);
    }
    @Test
    public void minInvalidTest() {
        int[] valArray = new int[3];
        Integer expect = 0;
        Integer actual = finder.findMin(valArray);
        assertEquals(actual,expect);
    }
    @Test
    public void maxNullTest() {
        int[] valArray = new int[]{};
        Integer actual = finder.findMax(valArray);
        assertEquals(actual,null);
    }
    @Test
    public void minNullTest() {
        int[] valArray = new int[]{};
        Integer actual = finder.findMin(valArray);
        assertEquals(actual,null);
    }
}