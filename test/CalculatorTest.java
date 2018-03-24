import org.junit.Assert;
import org.junit.Test;

/**
 * Created by Hashan on 3/23/2018.
 */
public class CalculatorTest {
    @Test
    public void add() throws Exception {
        Calculator calculator = new Calculator();
        Assert.assertEquals(6, calculator.add(2,4));
    }

    @Test
    public void subtract() throws Exception {
        Calculator calculator = new Calculator();
        Assert.assertEquals(2, calculator.subtract(4,4));
    }

}