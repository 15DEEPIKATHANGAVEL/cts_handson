import org.junit.Test;
import static org.junit.Assert.*;


public class CalculatorTest {


    @Test
    public void testAddition(){


        Calculator c = new Calculator();


        int result = c.add(10,20);


        assertEquals(30,result);


    }



    @Test
    public void testSubtraction(){


        Calculator c = new Calculator();


        int result = c.subtract(20,10);


        assertEquals(10,result);


    }


} 
