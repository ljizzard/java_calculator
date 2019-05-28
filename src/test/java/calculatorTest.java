import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class calculatorTest {

    Calculator numbers;

    @Before
    public void before(){
        numbers = new Calculator (10, 2);
    }

    @Test
    public void add(){
        assertEquals(12.0, numbers.add());
    }

    @Test
    public void subtract(){
        assertEquals(8.0, numbers.subtract());

    }

    @Test
    public void multiply(){
        assertEquals(20.0, numbers.multiply());
    }

    @Test
    public void divide(){
        assertEquals(5.0, numbers.divide());
    }
}
